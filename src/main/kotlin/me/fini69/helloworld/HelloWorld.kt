package me.fini69.helloworld

import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin

class HelloWorld : JavaPlugin() {

    override fun onEnable() {
        // Log a message to the console when the plugin is enabled
        logger.info("Hello from Paper! Plugin has been enabled!")
    }

    override fun onDisable() {
        // Log a message to the console when the plugin is disabled
        logger.info("Hello from Paper! Plugin has been disabled!")
    }

    // Command handling
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender is Player) {
            when(command.name) {
                "hello" -> {
                    if(args.isEmpty()) {
                        if (sender.hasPermission("helloworld.hello")) {
                            sender.sendMessage("${ChatColor.GREEN}Hello, ${ChatColor.AQUA}${sender.name}${ChatColor.GREEN}! Welcome to the server!")
                        } else {
                            sender.sendMessage("${ChatColor.RED}You do not have permission to use this command.")
                        }
                    }
                }
            }
        }
        return true
    }
}
