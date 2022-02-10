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

public class Receita{
   public Receita(JavaPlugin instance){
       ItemStack result = new ItemStack(Material.DIAMOND_PICKAXE, 1);

       ItemMeta meta = result.getItemMeta();

       meta.setDisplayName(ChatColor.RED + "Super Pica Reta");

       result.setItemMeta(meta);

       result.addEnchantment(Enchantment.DIG_SPEED, 5);
       result.addEnchantment(Enchantment.DURABILITY, 3);

       NamespacedKey key = new NamespacedKey(instance, "super_pica_reta");

       ShapedRecipe recipe = new ShapedRecipe(key, result);

       recipe.shape("DPD"," O "," O ");

       recipe.setIngredient('D', Material.DIAMOND_BLOCK);
       recipe.setIngredient('P', Material.DIAMOND_PICKAXE);
       recipe.setIngredient('O', Material.OBSIDIAN);

       Bukkit.addRecipe(recipe);
   }
}
