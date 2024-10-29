package me.fini69.helloworld

import org.bukkit.plugin.java.JavaPlugin

class HelloWorld : JavaPlugin() {

    override fun onEnable() {
        logger.info("Hello from Paper! Plugin has been enabled!")
    }

    override fun onDisable() {
        logger.info("Hello from Paper! Plugin has been disabled!")
    }
}
