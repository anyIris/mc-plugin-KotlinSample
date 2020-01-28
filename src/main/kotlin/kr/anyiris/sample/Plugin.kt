package kr.anyiris.sample

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.PluginDescriptionFile
import org.bukkit.plugin.java.JavaPlugin
import java.util.logging.Logger

class Plugin: JavaPlugin(), Listener {
    companion object{
        public val logger: Logger = Bukkit.getLogger()

    }

    override fun onEnable(){
        var pdf:PluginDescriptionFile = this.description
        var pluginName = pdf.name
        var pluginVersion = pdf.version

        logger.info{ "[$pluginName $pluginVersion] Enabled" }

        Bukkit.getPluginManager().registerEvents(this,this)
    }

    @EventHandler
    public fun onPlayerJoin(event: PlayerJoinEvent){
        event.player.sendMessage("Hello World for kotlin")
    }
}