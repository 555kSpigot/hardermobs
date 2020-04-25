package com.golimc.hardermobs;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.golimc.hardermobs.commands.HardermobsCommand;
import com.golimc.hardermobs.listeners.Listeners;

public class Main extends JavaPlugin {
	private static Main instance;
	
	public static Main getInstance() {
		return Main.instance;
		
	}
	
    @Override
    public void onEnable() {
    	new HardermobsCommand(this);
    	Main.instance = this;
    	
    	this.getServer().getPluginManager().registerEvents((Listener)new Listeners(), (Plugin)this);
  
    
    }
    
    @Override
    public void onDisable() {
    	
    	Main.instance = null;
    }
    
}
