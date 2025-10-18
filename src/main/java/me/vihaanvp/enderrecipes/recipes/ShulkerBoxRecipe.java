package me.vihaanvp.enderrecipes.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class ShulkerBoxRecipe {
    public static void register(JavaPlugin plugin) {
        ShapedRecipe shulkerRecipe = new ShapedRecipe(
                new NamespacedKey(plugin, "shulker_box_from_obsidian"),
                new ItemStack(Material.SHULKER_BOX)
        );
        shulkerRecipe.shape(
                "OOO",
                "OCO",
                "OOO"
        );
        shulkerRecipe.setIngredient('O', Material.OBSIDIAN);
        shulkerRecipe.setIngredient('C', Material.CHEST);
        Bukkit.addRecipe(shulkerRecipe);
    }
}