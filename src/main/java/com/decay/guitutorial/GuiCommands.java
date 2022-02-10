package com.decay.guitutorial;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GuiCommands implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
       if(sender instanceof Player){
           Bukkit.getServer().getPluginManager().callEvent(new GuiEvent((Player) sender));
           return true;
       } else {
           Bukkit.getLogger().info("Você deve ser um jogador para utilizar esse comando.");
       }
        return false;
    }
}
