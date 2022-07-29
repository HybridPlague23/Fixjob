package me.HybridPlague.Fixjob;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InventoryManager implements Listener {

	public List<Inventory> jobs = new ArrayList<Inventory>();
	private Main plugin;
	public InventoryManager(Main plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
		this.plugin = plugin;
	}
	
	public Inventory jobMain;
	private Inventory jobUniversity;
	private Inventory jobGovernment;
	private Inventory jobDoA;
	private Inventory jobDoC;
	private Inventory jobDoE;
	private Inventory jobDoH;
	private Inventory jobDoJ;
	private Inventory jobDoPA;

	// Main Menu
	public void jobMain(final Player p) {
		
		jobMain = Bukkit.createInventory(null, 36, ChatColor.translateAlternateColorCodes('&', "&cFixJob » " + plugin.getTargetPlayer().get(p).getName()));
		jobs.add(jobMain);
		p.openInventory(jobMain);
		
		ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(" ");
		item.setItemMeta(meta);
		for (int i = 0; i < 36 ; i++) {
			jobMain.setItem(i, item);
		}
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7University Jobs"));
		item.setItemMeta(meta);
		jobMain.setItem(12, item);
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Government Jobs"));
		item.setItemMeta(meta);
		jobMain.setItem(14, item);
		
		item.setType(Material.BARRIER);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cClose"));
		item.setItemMeta(meta);
		jobMain.setItem(31, item);
	}
	
	// University Menu
	public void jobUniversity(final Player p) {
		
		jobUniversity = Bukkit.createInventory(null, 54, ChatColor.translateAlternateColorCodes('&', "&cUniversity » " + plugin.getTargetPlayer().get(p).getName()));
		jobs.add(jobUniversity);
		p.openInventory(jobUniversity);

		List<String> lore = new ArrayList<String>();
		ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(" ");
		item.setItemMeta(meta);
		for (int i = 0; i < 54 ; i++) {
			jobUniversity.setItem(i, item);
		}
		
		item.setType(Material.BREWING_STAND);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Brewer"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobUniversity.setItem(10, item);
		lore.clear();
		
		item.setType(Material.COOKED_BEEF);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Chef"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobUniversity.setItem(11, item);
		lore.clear();
		
		item.setType(Material.POTION);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&fDoctor"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobUniversity.setItem(12, item);
		lore.clear();
		
		item.setType(Material.WOODEN_HOE);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Farmer"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobUniversity.setItem(13, item);
		lore.clear();
		
		item.setType(Material.WOODEN_SWORD);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Hunter"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobUniversity.setItem(14, item);
		lore.clear();
		
		item.setType(Material.WOODEN_SHOVEL);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Landscaper"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobUniversity.setItem(15, item);
		lore.clear();
		
		item.setType(Material.WOODEN_AXE);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Lumberjack"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobUniversity.setItem(16, item);
		lore.clear();
		
		item.setType(Material.CRAFTING_TABLE);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Manufacturer"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobUniversity.setItem(19, item);
		lore.clear();
		
		item.setType(Material.ANVIL);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Mechanic"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobUniversity.setItem(20, item);
		lore.clear();
		
		item.setType(Material.PAPER);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&fPharmacist"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobUniversity.setItem(21, item);
		lore.clear();
		
		item.setType(Material.LEATHER_BOOTS);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eTour Guide"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobUniversity.setItem(22, item);
		lore.clear();
		
		item.setType(Material.WRITABLE_BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Writer"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobUniversity.setItem(23, item);
		lore.clear();
		
		item.setType(Material.ARROW);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cBack"));
		item.setItemMeta(meta);
		jobUniversity.setItem(45, item);
		
		item.setType(Material.BARRIER);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cClose"));
		item.setItemMeta(meta);
		jobUniversity.setItem(53, item);
	}
	
	// Government Menu
	public void jobGovernment(final Player p) {
		jobGovernment = Bukkit.createInventory(null, 54, ChatColor.translateAlternateColorCodes('&', "&cGovernment » " + plugin.getTargetPlayer().get(p).getName()));
		jobs.add(jobGovernment);
		p.openInventory(jobGovernment);
		
		ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(" ");
		item.setItemMeta(meta);
		for (int i = 0; i < 54 ; i++) {
			jobGovernment.setItem(i, item);
		}
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3Agriculture"));
		item.setItemMeta(meta);
		jobGovernment.setItem(11, item);
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3Construction"));
		item.setItemMeta(meta);
		jobGovernment.setItem(13, item);
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3Economy"));
		item.setItemMeta(meta);
		jobGovernment.setItem(15, item);
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3Health"));
		item.setItemMeta(meta);
		jobGovernment.setItem(29, item);
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3Justice"));
		item.setItemMeta(meta);
		jobGovernment.setItem(31, item);
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3Public Affairs"));
		item.setItemMeta(meta);
		jobGovernment.setItem(33, item);
		
		item.setType(Material.ARROW);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cBack"));
		item.setItemMeta(meta);
		jobGovernment.setItem(45, item);
		
		item.setType(Material.BARRIER);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cClose"));
		item.setItemMeta(meta);
		jobGovernment.setItem(53, item);
	}

	// DoA Menu
	public void jobDoA(final Player p) {
		jobDoA = Bukkit.createInventory(null, 36, ChatColor.translateAlternateColorCodes('&', "&cAgriculture » " + plugin.getTargetPlayer().get(p).getName()));
		jobs.add(jobDoA);
		p.openInventory(jobDoA);

		List<String> lore = new ArrayList<String>();
		ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(" ");
		item.setItemMeta(meta);
		for (int i = 0; i < 36 ; i++) {
			jobDoA.setItem(i, item);
		}
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bEnvironment Manager"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobDoA.setItem(10, item);
		lore.clear();
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSenior Environment Manager"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobDoA.setItem(12, item);
		lore.clear();
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bRanger"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobDoA.setItem(14, item);
		lore.clear();
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSenior Ranger"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobDoA.setItem(16, item);
		lore.clear();
		
		item.setType(Material.ARROW);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cBack"));
		item.setItemMeta(meta);
		jobDoA.setItem(27, item);
		
		item.setType(Material.BARRIER);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cClose"));
		item.setItemMeta(meta);
		jobDoA.setItem(35, item);
		
	}
	
	// DoC Menu
	public void jobDoC(final Player p) {
		jobDoC = Bukkit.createInventory(null, 36, ChatColor.translateAlternateColorCodes('&', "&cConstruction » " + plugin.getTargetPlayer().get(p).getName()));
		jobs.add(jobDoC);
		p.openInventory(jobDoC);

		List<String> lore = new ArrayList<String>();
		ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(" ");
		item.setItemMeta(meta);
		for (int i = 0; i < 36 ; i++) {
			jobDoC.setItem(i, item);
		}
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bConstructor"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobDoC.setItem(12, item);
		lore.clear();

		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eProperty Inspector"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobDoC.setItem(14, item);
		lore.clear();
		
		item.setType(Material.ARROW);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cBack"));
		item.setItemMeta(meta);
		jobDoC.setItem(27, item);
		
		item.setType(Material.BARRIER);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cClose"));
		item.setItemMeta(meta);
		jobDoC.setItem(35, item);
		
	}

	// DoE Menu
	public void jobDoE(final Player p) {
		jobDoE = Bukkit.createInventory(null, 36, ChatColor.translateAlternateColorCodes('&', "&cConstruction » " + plugin.getTargetPlayer().get(p).getName()));
		jobs.add(jobDoE);
		p.openInventory(jobDoE);

		List<String> lore = new ArrayList<String>();
		ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(" ");
		item.setItemMeta(meta);
		for (int i = 0; i < 36 ; i++) {
			jobDoE.setItem(i, item);
		}
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bEconomy Secretary"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobDoE.setItem(11, item);
		lore.clear();
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSenior Economy Secretary"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobDoE.setItem(13, item);
		lore.clear();
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bTreasurer"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobDoE.setItem(15, item);
		lore.clear();
		
		item.setType(Material.ARROW);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cBack"));
		item.setItemMeta(meta);
		jobDoE.setItem(27, item);
		
		item.setType(Material.BARRIER);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cClose"));
		item.setItemMeta(meta);
		jobDoE.setItem(35, item);
		
	}
	
	// DoH Menu
	public void jobDoH(final Player p) {
		jobDoH = Bukkit.createInventory(null, 36, ChatColor.translateAlternateColorCodes('&', "&cHealth » " + plugin.getTargetPlayer().get(p).getName()));
		jobs.add(jobDoH);
		p.openInventory(jobDoH);

		List<String> lore = new ArrayList<String>();
		ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(" ");
		item.setItemMeta(meta);
		for (int i = 0; i < 36 ; i++) {
			jobDoH.setItem(i, item);
		}
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHospital Secretary"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobDoH.setItem(13, item);
		lore.clear();
		
		item.setType(Material.ARROW);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cBack"));
		item.setItemMeta(meta);
		jobDoH.setItem(27, item);
		
		item.setType(Material.BARRIER);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cClose"));
		item.setItemMeta(meta);
		jobDoH.setItem(35, item);
	}
	
	// DoJ Menu
	public void jobDoJ(final Player p) {
		jobDoJ = Bukkit.createInventory(null, 36, ChatColor.translateAlternateColorCodes('&', "&cJustice » " + plugin.getTargetPlayer().get(p).getName()));
		jobs.add(jobDoJ);
		p.openInventory(jobDoJ);

		List<String> lore = new ArrayList<String>();
		ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(" ");
		item.setItemMeta(meta);
		for (int i = 0; i < 36 ; i++) {
			jobDoJ.setItem(i, item);
		}
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bPolice Officer"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobDoJ.setItem(11, item);
		lore.clear();
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSergeant"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobDoJ.setItem(13, item);
		lore.clear();
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Judge"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobDoJ.setItem(15, item);
		lore.clear();
		
		item.setType(Material.ARROW);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cBack"));
		item.setItemMeta(meta);
		jobDoJ.setItem(27, item);
		
		item.setType(Material.BARRIER);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cClose"));
		item.setItemMeta(meta);
		jobDoJ.setItem(35, item);
	}
	
	// DoPA Menu
	public void jobDoPA(final Player p) {
		jobDoPA = Bukkit.createInventory(null, 36, ChatColor.translateAlternateColorCodes('&', "&cPublic Affairs » " + plugin.getTargetPlayer().get(p).getName()));
		jobs.add(jobDoPA);
		p.openInventory(jobDoPA);

		List<String> lore = new ArrayList<String>();
		ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(" ");
		item.setItemMeta(meta);
		for (int i = 0; i < 36 ; i++) {
			jobDoPA.setItem(i, item);
		}
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bCommunity Coordinator"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobDoPA.setItem(12, item);
		lore.clear();
		
		item.setType(Material.BOOK);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSenior Tour Guide"));
		lore.add("");
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Left-Click to add"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right-Click to remove"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		jobDoPA.setItem(14, item);
		lore.clear();
		
		item.setType(Material.ARROW);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cBack"));
		item.setItemMeta(meta);
		jobDoPA.setItem(27, item);
		
		item.setType(Material.BARRIER);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cClose"));
		item.setItemMeta(meta);
		jobDoPA.setItem(35, item);
	}
	
	// Click events
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		if (jobs.contains(e.getInventory())) {
			e.setCancelled(true);
			
			Player p = (Player) e.getWhoClicked();
			
			// Main Menu
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("University Jobs")
					&& e.getCurrentItem().getType().equals(Material.BOOK)) {
				jobUniversity(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Government Jobs")
					&& e.getCurrentItem().getType().equals(Material.BOOK)) {
				jobGovernment(p);
			}
			
			/************************************************    
			 * 
			 *                 Government Menu 
			 * 
			 ************************************************/
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Agriculture")
					&& e.getCurrentItem().getType().equals(Material.BOOK)) {
				jobDoA(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Construction")
					&& e.getCurrentItem().getType().equals(Material.BOOK)) {
				jobDoC(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Economy")
					&& e.getCurrentItem().getType().equals(Material.BOOK)) {
				jobDoE(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Health")
					&& e.getCurrentItem().getType().equals(Material.BOOK)) {
				jobDoH(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Justice")
					&& e.getCurrentItem().getType().equals(Material.BOOK)) {
				jobDoJ(p);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Public Affairs")
					&& e.getCurrentItem().getType().equals(Material.BOOK)) {
				jobDoPA(p);
			}
			
			/************************************************    
			 * 
			 *                 DoA Menu 
			 * 
			 ************************************************/
			
			// Env. Manager
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "Environment Manager")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "EnvironmentManager");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Environment Manager"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "Environment Manager")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "EnvironmentManager");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Environment Manager"));
			}
			
			// Sr. Env. Manager
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "Senior Environment Manager")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "SeniorEnvironmentManager");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Senior Environment Manager"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "Senior Environment Manager")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "SeniorEnvironmentManager");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Senior Environment Manager"));
			}
			
			// Ranger
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "Ranger")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "Ranger");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Ranger"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "Ranger")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "Ranger");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Ranger"));
			}
			
			// Sr. Ranger
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "Senior Ranger")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "SeniorRanger");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Senior Ranger"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "Senior Ranger")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "SeniorRanger");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Senior Ranger"));
			}
			
			/************************************************    
			 * 
			 *                 DoC Menu 
			 * 
			 ************************************************/
			
			// Constructor
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Constructor")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "Constructor");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Constructor"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Constructor")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "Constructor");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Constructor"));
			}
			
			// PI
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Property Inspector")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "PropertyInspector");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Property Inspector"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Property Inspector")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "PropertyInspector");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Property Inspector"));
			}
			
			/************************************************    
			 * 
			 *                 DoE Menu 
			 * 
			 ************************************************/
			
			// Eco Sec
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "Economy Secretary")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "EconomySecretary");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Economy Secretary"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "Economy Secretary")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "EconomySecretary");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Economy Secretary"));
			}
			
			// Sr Eco Sec
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "Senior Economy Secretary")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "SeniorEconomySecretary");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Senior Economy Secretary"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "Senior Economy Secretary")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "SeniorEconomySecretary");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Senior Economy Secretary"));
			}
			
			// Treasurer
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Treasurer")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "Treasurer");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Treasurer"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Treasurer")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "Treasurer");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Treasurer"));
			}
			
			/************************************************    
			 * 
			 *                 DoH Menu 
			 * 
			 ************************************************/
			
			// HS
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Hospital Secretary")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "HospitalSecretary");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Hospital Secretary"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Hospital Secretary")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "HospitalSecretary");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Hospital Secretary"));
			}
			
			/************************************************    
			 * 
			 *                 DoJ Menu 
			 * 
			 ************************************************/
			
			// Police
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Police Officer")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "PoliceOfficer");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Police Officer"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Police Officer")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "PoliceOfficer");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Police Officer"));
			}
			
			// Sergeant
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Sergeant")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "Sergeant");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Sergeant"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Sergeant")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "Sergeant");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Sergeant"));
			}
			
			// Judge
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Judge")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "Judge");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Judge"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Judge")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "Judge");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Judge"));
			}
			
			/************************************************    
			 * 
			 *                 DoPA Menu 
			 * 
			 ************************************************/
			
			// CC
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Community Coordinator")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "CommunityCoordinator");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Community Coordinator"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Community Coordinator")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "CommunityCoordinator");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Community Coordinator"));
			}
			
			// STG
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "Senior Tour Guide")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "SeniorTourGuide");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Senior Tour Guide"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "Senior Tour Guide")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "SeniorTourGuide");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Senior Tour Guide"));
			}
			
			
			/************************************************    
			 * 
			 *                 University Menu 
			 * 
			 ************************************************/
			
			// Brewer
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Brewer")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "Brewer");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Brewer"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Brewer")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "Brewer");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Brewer"));
			}
			
			// Chef
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Chef")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "Chef");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Chef"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Chef")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "Chef");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Chef"));
			}
			
			// Doctor
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Doctor")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "Doctor");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Doctor"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Doctor")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "Doctor");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Doctor"));
			}
			
			// Farmer
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Farmer")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "Farmer");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Farmer"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Farmer")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "Farmer");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Farmer"));
			}
			
			// Hunter
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Hunter")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "Hunter");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Hunter"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Hunter")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "Hunter");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Hunter"));
			}
			
			// Landscaper
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Landscaper")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "Landscaper");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Landscaper"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Landscaper")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "Landscaper");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Landscaper"));
			}
			
			// Lumberjack
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Lumberjack")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "Lumberjack");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Lumberjack"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Lumberjack")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "Lumberjack");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Lumberjack"));
			}
			
			// Manufacturer
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Manufacturer")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "Manufacturer");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Manufacturer"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Manufacturer")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "Manufacturer");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Manufacturer"));
			}
			
			// Mechanic
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Mechanic")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "Mechanic");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Mechanic"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Mechanic")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "Mechanic");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Mechanic"));
			}
			
			// Pharmacist
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Pharmacist")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "Pharmacist");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Pharmacist"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Pharmacist")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "Pharmacist");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Pharmacist"));
			}
			
			// Tour Guide
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "Tour Guide")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "TourGuide");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Tour Guide"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "Tour Guide")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "TourGuide");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Tour Guide"));
			}
			
			// Writer
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Writer")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isLeftClick()) {
				plugin.perm.playerAddGroup(null, plugin.getTargetPlayer().get(p), "Writer");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " added to group Writer"));
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Writer")
					&& jobs.contains(e.getInventory())
					&& e.getClick().isRightClick()) {
				plugin.perm.playerRemoveGroup(null, plugin.getTargetPlayer().get(p), "Writer");
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &a" + plugin.getTargetPlayer().get(p).getName() + " removed from group Writer"));
			}
			
			/************************************************    
			 * 
			 *                 Extra Items 
			 * 
			 ************************************************/
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Back")
					&& e.getCurrentItem().getType().equals(Material.ARROW)
					&& (e.getView().getTitle().contains("University")
							|| e.getView().getTitle().contains("Government"))) {
				jobMain(p);
			}
			
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Back")
					&& e.getCurrentItem().getType().equals(Material.ARROW)
					&& (e.getView().getTitle().contains("Agriculture")
							|| e.getView().getTitle().contains("Construction")
							|| e.getView().getTitle().contains("Economy")
							|| e.getView().getTitle().contains("Health")
							|| e.getView().getTitle().contains("Justice")
							|| e.getView().getTitle().contains("Public Affairs"))) {
				jobGovernment(p);
			}
			
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Close")
					&& e.getCurrentItem().getType().equals(Material.BARRIER)) {
				p.closeInventory();
			}
			
		}
		return;
	}
}
