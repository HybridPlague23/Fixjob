package me.HybridPlague.Fixjob;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import net.milkbowl.vault.permission.Permission;

public class Main extends JavaPlugin implements Listener {

	public InventoryManager invs;
	public Permission perm;
	private HashMap<Player, Player> targetPlayer = new HashMap<Player, Player>();
	
	@Override
	public void onEnable() {
		if (!setupPermission()) {
			System.out.println(ChatColor.RED + "You must have Vault installed.");
			getServer().getPluginManager().disablePlugin(this);
			return;
		}
		this.getServer().getPluginManager().registerEvents(new InventoryManager(this), this);
		this.invs = new InventoryManager(this);

	}

	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("fixjob")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("This command is only executable by a player.");
				return true;
			}
			Player p = (Player) sender;
			if (!p.hasPermission("fixjob.use")) {
				p.sendMessage(ChatColor.RED + "Insufficient permission.");
				return true;
			}
			if (args.length == 0) {
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &f/fixjob <player>"));
				return true;
			}
			if (Bukkit.getOfflinePlayer(args[0]).isOnline()) {
				Player target = Bukkit.getPlayer(args[0]);
				targetPlayer.put(p, target);
				invs.jobMain(p);
				return true;
			}
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lFixJob &fPlayer is not online."));
			return true;
			
		}
		return false;
	}
	
	public HashMap<Player, Player> getTargetPlayer() {
		return targetPlayer;
	}
	
	public boolean setupPermission() {
		RegisteredServiceProvider<Permission> permissions = getServer().
				getServicesManager().getRegistration(net.milkbowl.vault.permission.Permission.class);
		if (permissions != null)
			perm = permissions.getProvider();
		return (perm != null);
	}
	
}
