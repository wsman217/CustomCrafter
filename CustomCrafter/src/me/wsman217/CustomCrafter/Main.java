package me.wsman217.CustomCrafter;

import org.bukkit.plugin.java.JavaPlugin;

import me.wsman217.CustomCrafter.CustomRecipes.Recipes;
import me.wsman217.CustomCrafter.messages.Messages;

public class Main extends JavaPlugin {
	public Messages messages;
	public Recipes recipes;

	@Override
	public void onEnable() {
		saveDefaultConfig();

		System.out.println("CustomCrafter is ENABLED");
		System.out.println("Author: wsman217");

		
		messages = new Messages(this);
		recipes = new Recipes(this);
		
		//getCommand("god").setExecutor(new me.wsman217.CustomCrafter.commands.GodCommand(this));
	}

	@Override
	public void onDisable() {
		System.out.println("God has been DISABLED");
		System.out.println("Author: wsman217");
	}
}
