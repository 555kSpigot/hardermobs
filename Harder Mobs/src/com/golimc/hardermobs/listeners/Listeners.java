package com.golimc.hardermobs.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Zombie;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.*;

public class Listeners implements Listener {

    @EventHandler
    public void creatureSpawn(final CreatureSpawnEvent event) {
    	
    	if(event.getEntityType() == EntityType.ZOMBIE) {
    		
    		final Zombie zombie = (Zombie) event.getEntity();
    		
    		zombie.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
    		zombie.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
    		zombie.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
    		zombie.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
    	    
    		final ItemStack sharpnessSword = new ItemStack(Material.DIAMOND_SWORD);
    		sharpnessSword.addEnchantment(Enchantment.DAMAGE_ALL, 5);
    		
    		zombie.getEquipment().setItemInMainHand(sharpnessSword);
    		
    	}
    	
    	if(event.getEntityType() == EntityType.SKELETON) {
    		
    		final Skeleton skeleton = (Skeleton) event.getEntity();
    		
    		skeleton.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
    		skeleton.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
    		skeleton.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
    		skeleton.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
    		
            final ItemStack punchBow = new ItemStack(Material.BOW);
            punchBow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
            punchBow.addEnchantment(Enchantment.ARROW_DAMAGE, 5);
            
            skeleton.getEquipment().setItemInMainHand(punchBow);
    		
    	}
    	
         if(event.getEntityType() == EntityType.CREEPER) {
    		
    		final Creeper creeper = (Creeper) event.getEntity();
    		
    		creeper.setPowered(true);
    		
        }
    	
    	
    	
    	
    }
	
}
