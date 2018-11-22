package me.wsman217.CustomCrafter.CustomRecipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import me.wsman217.CustomCrafter.Main;

public class Recipes {
	public final int NumberOfRecipes;
	public String[][] Recipes;
	public String ForWorks;

	public Recipes(Main plugin) {

		NumberOfRecipes = plugin.getConfig().getInt("CustomRecipes.NumberOfRecipes");
		Recipes = new String[NumberOfRecipes][10];

		for (int i = 0; i < NumberOfRecipes; i++) {
			for (int j = 0; j < 10; j++) {
				Recipes[i][j] = plugin.getConfig().getString("CustomRecipes." + i + "." + j);
			}
		}

		for (int i = 0; i < NumberOfRecipes; i++) {

			ItemStack output = new ItemStack(Material.getMaterial(Recipes[i][9]));
			ShapedRecipe recipe = new ShapedRecipe(output);

			recipe.shape("ABC", "DEF", "GHI");

			char Letters = 'A';
			for (int j = 0; j < 9; j++) {
				if (!(Recipes[i][j].equals("null"))) {
					recipe.setIngredient(Letters, Material.getMaterial(Recipes[i][j]));
				}
				Letters++;
			}
			plugin.getServer().addRecipe(recipe);
		}
	}
}