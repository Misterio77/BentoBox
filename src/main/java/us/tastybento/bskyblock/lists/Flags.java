package us.tastybento.bskyblock.lists;

import org.bukkit.Material;

import us.tastybento.bskyblock.api.flags.Flag;
import us.tastybento.bskyblock.api.flags.FlagBuilder;
import us.tastybento.bskyblock.listeners.flags.*;

public class Flags {

    /*
     * Protection Flags
     */
    
    // Break and place blocks
    public static final Flag BREAK_BLOCKS = new FlagBuilder().id("BREAK_BLOCKS").icon(Material.STONE).listener(new BreakBlocksListener()).build();
    public static final Flag PLACE_BLOCKS = new FlagBuilder().id("PLACE_BLOCKS").icon(Material.DIRT).listener(new PlaceBlocksListener()).build();

    // Block interactions - all use BlockInteractionListener()
    public static final Flag ANVIL = new FlagBuilder().id("ANVIL").icon(Material.ANVIL).listener(new BlockInteractionListener()).build();
    public static final Flag BEACON = new FlagBuilder().id("BEACON").icon(Material.BEACON).build();
    public static final Flag BED = new FlagBuilder().id("BED").icon(Material.BED).build();
    public static final Flag BREWING = new FlagBuilder().id("BREWING").icon(Material.BREWING_STAND_ITEM).build();
    public static final Flag CHEST = new FlagBuilder().id("CHEST").icon(Material.CHEST).build();
    public static final Flag DOOR = new FlagBuilder().id("DOOR").allowedByDefault(true).icon(Material.WOODEN_DOOR).build();
    public static final Flag CRAFTING = new FlagBuilder().id("CRAFTING").allowedByDefault(true).icon(Material.WORKBENCH).build();
    public static final Flag ENCHANTING = new FlagBuilder().id("ENCHANTING").allowedByDefault(true).icon(Material.ENCHANTMENT_TABLE).build();
    public static final Flag FURNACE = new FlagBuilder().id("FURNACE").icon(Material.FURNACE).build();
    public static final Flag GATE = new FlagBuilder().id("GATE").allowedByDefault(true).icon(Material.FENCE_GATE).build();
    public static final Flag MUSIC = new FlagBuilder().id("MUSIC").icon(Material.JUKEBOX).build();
    public static final Flag LEVER_BUTTON = new FlagBuilder().id("LEVER_BUTTON").icon(Material.LEVER).build();
    public static final Flag REDSTONE = new FlagBuilder().id("REDSTONE").icon(Material.REDSTONE).build();
    public static final Flag SPAWN_EGGS = new FlagBuilder().id("SPAWN_EGGS").icon(Material.MONSTER_EGG).build();

    // Entity interactions
    public static final Flag ARMOR_STAND = new FlagBuilder().id("ARMOR_STAND").icon(Material.ARMOR_STAND).listener(new EntityInteractListener()).build();
    public static final Flag RIDING = new FlagBuilder().id("RIDING").icon(Material.GOLD_BARDING).build();
    public static final Flag TRADING = new FlagBuilder().id("TRADING").allowedByDefault(true).icon(Material.EMERALD).build();

    // Breeding
    public static final Flag BREEDING = new FlagBuilder().id("BREEDING").icon(Material.CARROT).listener(new BreedingListener()).build();

    // Buckets. All bucket use is covered by one listener
    public static final Flag BUCKET = new FlagBuilder().id("BUCKET").icon(Material.BUCKET).listener(new BucketListener()).build();
    public static final Flag COLLECT_LAVA = new FlagBuilder().id("COLLECT_LAVA").icon(Material.LAVA_BUCKET).build();
    public static final Flag COLLECT_WATER = new FlagBuilder().id("COLLECT_WATER").icon(Material.WATER_BUCKET).build();
    public static final Flag MILKING = new FlagBuilder().id("MILKING").icon(Material.MILK_BUCKET).build();    
        
    // Chorus Fruit and Enderpearls
    public static final Flag CHORUS_FRUIT = new FlagBuilder().id("CHORUS_FRUIT").icon(Material.CHORUS_FRUIT).listener(new TeleportationListener()).build();
    public static final Flag ENDER_PEARL = new FlagBuilder().id("ENDER_PEARL").icon(Material.ENDER_PEARL).build();
    
    // Physical interactions
    public static final Flag CROP_TRAMPLE = new FlagBuilder().id("CROP_TRAMPLE").icon(Material.WHEAT).listener(new PhysicalInteractionListener()).build();
    public static final Flag PRESSURE_PLATE = new FlagBuilder().id("PRESSURE_PLATE").icon(Material.GOLD_PLATE).build();

    // Egg throwing
    public static final Flag EGGS = new FlagBuilder().id("EGGS").icon(Material.EGG).listener(new EggListener()).build();
    
    /*
     * Fire
     * I'll take you to burn.
     * Fire
     * I'll take you to learn.
     * You gonna burn, burn, burn 
     * Fire
     * I'll take you to burn
     * - The Crazy World of Arthur Brown
     */
    public static final Flag FIRE = new FlagBuilder().id("FIRE").icon(Material.FLINT_AND_STEEL).listener(new FireListener()).build();
    public static final Flag FIRE_EXTINGUISH = new FlagBuilder().id("FIRE_EXTINGUISH").icon(Material.POTION).build();
    public static final Flag FIRE_SPREAD = new FlagBuilder().id("FIRE_SPREAD").icon(Material.FIREWORK_CHARGE).build();
    
    // Inventories
    public static final Flag MOUNT_INVENTORY = new FlagBuilder().id("MOUNT_INVENTORY").icon(Material.IRON_BARDING).listener(new InventoryListener()).build();
    
    // Hurting things
    public static final Flag HURT_MOBS = new FlagBuilder().id("HURT_MOBS").icon(Material.STONE_SWORD).listener(new HurtingListener()).build();
    public static final Flag HURT_MONSTERS = new FlagBuilder().id("HURT_MONSTERS").icon(Material.WOOD_SWORD).build();
    
    // Leashes
    public static final Flag LEASH = new FlagBuilder().id("LEASH").icon(Material.LEASH).listener(new LeashListener()).build();
    
    // Portal use protection
    public static final Flag PORTAL = new FlagBuilder().id("PORTAL").icon(Material.OBSIDIAN).listener(new PortalListener()).build();
        
    // PVP
    public static final Flag PVP_OVERWORLD = new FlagBuilder().id("PVP_OVERWORLD").icon(Material.ARROW).listener(new PVPListener()).build();
    public static final Flag PVP_NETHER = new FlagBuilder().id("PVP_NETHER").icon(Material.IRON_AXE).build();
    public static final Flag PVP_END = new FlagBuilder().id("PVP_END").icon(Material.END_CRYSTAL).build();
    
    // Shearing
    public static final Flag SHEARING = new FlagBuilder().id("SHEARING").icon(Material.SHEARS).listener(new ShearingListener()).build();
    
    // Item pickup or drop
    public static final Flag ITEM_DROP = new FlagBuilder().id("ITEM_DROP").icon(Material.DIRT).listener(new ItemDropPickUpListener()).build();
    public static final Flag ITEM_PICKUP = new FlagBuilder().id("ITEM_PICKUP").icon(Material.DIRT).build();
    
    /*
     * Non-protection flags
     */

    public static final Flag ENTER_EXIT_MESSAGES = new FlagBuilder().id("ENTER_EXIT_MESSAGES").icon(Material.DIRT).allowedByDefault(true).build();
    public static final Flag MOB_SPAWN = new FlagBuilder().id("MOB_SPAWN").icon(Material.APPLE).allowedByDefault(true).build();
    public static final Flag MONSTER_SPAWN = new FlagBuilder().id("MONSTER_SPAWN").icon(Material.MOB_SPAWNER).allowedByDefault(true).build();

}
