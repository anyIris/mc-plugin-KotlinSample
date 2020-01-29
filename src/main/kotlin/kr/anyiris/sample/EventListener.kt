package kr.anyiris.sample

import org.bukkit.Location
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerMoveEvent

object EventListener: Listener {

    infix fun Location.equalsBlock(other: Location?) =
        this.blockX == other?.blockX && this.blockY == other.blockY && this.blockZ == other.blockZ

    @EventHandler
    public fun onPlayerJoin(event: PlayerJoinEvent){
        event.player.sendMessage("Hello World for kotlin")
    }

    @EventHandler
    public fun onMove(event: PlayerMoveEvent){
        if(!(event.from equalsBlock event.to)){
            event.player.damage(0.0)
        }
    }


}