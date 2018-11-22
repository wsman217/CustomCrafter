package me.wsman217.CustomCrafter.CustomRecipes;

import me.wsman217.CustomCrafter.Main;

public class Recipes {
	
	public final int NumberOfRecipes;
	public String[] Recipes;
	

	public Recipes(Main plugin) {
		
		NumberOfRecipes = plugin.getConfig().getInt("CustomRecipes.NumberOfRecipes");

		for (int j = 0; j <= NumberOfRecipes; j++) {
			
		}
	}
}
