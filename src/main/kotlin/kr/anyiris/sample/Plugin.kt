package kr.anyiris.sample

import org.bukkit.Bukkit
import org.bukkit.event.Listener
import org.bukkit.plugin.PluginDescriptionFile
import org.bukkit.plugin.java.JavaPlugin
import java.util.logging.Logger

class Plugin: JavaPlugin(), Listener {
    companion object{
        var instance: Plugin? = null
        public val logger: Logger = Bukkit.getLogger()

    }

    override fun onEnable(){
        instance = this

        var pdf:PluginDescriptionFile = instance!!.description
        var pluginName = pdf.name
        var pluginVersion = pdf.version

        Bukkit.getPluginManager().registerEvents(EventListener, instance!!)

        logger.info{ "[$pluginName $pluginVersion] Enabled" }
    }
}