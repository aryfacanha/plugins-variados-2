package com.decay.guitutorial;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomRecipes extends JavaPlugin {

    ItemStack result = new ItemStack(Material.DIAMOND_PICKAXE, 1);

    ItemMeta meta = result.getItemMeta();

}
