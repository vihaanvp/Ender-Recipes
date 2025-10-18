package me.vihaanvp.enderrecipes;

import org.bukkit.plugin.java.JavaPlugin;
import me.vihaanvp.enderrecipes.recipes.ElytraRecipe;
import me.vihaanvp.enderrecipes.recipes.ShulkerBoxRecipe;

public class EnderRecipes extends JavaPlugin {
    @Override
    public void onEnable() {
        // Create folder and config file
        saveDefaultConfig();

        // Read the config file
        boolean shulkerEnabled = getConfig().getBoolean("enable_shulker_box_recipe", true);
        boolean elytraEnabled = getConfig().getBoolean("enable_elytra_recipe", true);

        ElytraRecipe.register(this);
        ShulkerBoxRecipe.register(this);
        getLogger().info("EnderRecipes enabled! Custom recipes registered.");
    }

    @Override
    public void onDisable() {
        getLogger().info("EnderRecipes disabled.");
    }
}