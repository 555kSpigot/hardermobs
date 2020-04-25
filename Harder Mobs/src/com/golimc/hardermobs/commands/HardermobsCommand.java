package com.golimc.hardermobs.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.golimc.hardermobs.Main;

public class HardermobsCommand implements CommandExecutor {
	
	private Main plugin;
	
	public HardermobsCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("hardermobs").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	     if (!(sender instanceof Player)) {
	    	 sender.sendMessage(ChatColor.RED + "Please Run This In Game");
	    	 return true;
	     }
	     
	     Player player = (Player) sender;
	     
	     if (player.hasPermission("555k.hardermobs")) {
	    	
	    	 player.sendMessage(ChatColor.GREEN + "Plugin Version 1.0");
	    	 player.sendMessage(ChatColor.RED + "Harder Mobs Created by 555k");
	    	 player.sendMessage(ChatColor.RED + "spigotmc.org/members/555k.507718");
	    	 player.sendMessage(ChatColor.RED + "Information on what the plugin does on spigot");
	    	 
	    	 
	    	 return true;
	     } else {
	    	 player.sendMessage(ChatColor.GREEN + "Plugin Version 1.0");
	    	 player.sendMessage(ChatColor.RED + "Harder Mobs Created by 555k");
	    	 player.sendMessage(ChatColor.RED + "spigotmc.org/members/555k.507718");
	    	 player.sendMessage(ChatColor.RED + "Information on what the plugin does on spigot");
	     }
	     
		return false;
	}
	
}
