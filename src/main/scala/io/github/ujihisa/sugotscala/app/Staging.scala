package io.github.ujihisa.sugotscala.app

class Staging {
  def BlockPlaceEvent(event: org.bukkit.event.block.BlockPlaceEvent) = {
    val player = event.getPlayer
    val block = event.getBlockPlaced
    player.sendMessage(s"You placed ${block.getType.toString}!")
  }
}
