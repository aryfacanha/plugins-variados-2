package com.decay.guitutorial;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private JavaPlugin instance = this;

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Gui(), this);

        getServer().getPluginCommand("opengui").setExecutor(new GuiCommands());

        Receita r = new Receita(instance);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
