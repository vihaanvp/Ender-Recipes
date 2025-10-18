package me.vihaanvp.enderrecipes.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class ElytraRecipe {
    public static void register(JavaPlugin plugin) {
        ShapedRecipe elytraRecipe = new ShapedRecipe(
                new NamespacedKey(plugin, "elytra_custom"),
                new ItemStack(Material.ELYTRA)
        );
        elytraRecipe.shape(
                "TDT",
                "DND",
                "TDT"
        );
        elytraRecipe.setIngredient('T', Material.TOTEM_OF_UNDYING);
        elytraRecipe.setIngredient('D', Material.DIAMOND_BLOCK);
        elytraRecipe.setIngredient('N', Material.NETHERITE_BLOCK);
        Bukkit.addRecipe(elytraRecipe);
    }
}