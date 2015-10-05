package io.github.ujihisa.sugotscala

import org.bukkit.{Bukkit, Location}
import org.bukkit.plugin.Plugin
import org.bukkit.inventory.ItemStack
import org.bukkit.entity.Player

class Lib(plugin: Plugin) {
  /** Convert from seconds to ticks */
  def sec(n: Long) = 20 * n

  def later(tick: Long)(f: => Unit) =
    Bukkit.getScheduler.runTaskLater(plugin, new Runnable { def run = f }, tick)

  def getDisplayName(itemStack: ItemStack): Option[String] =
    Option(itemStack.getItemMeta).map(_.getDisplayName)

  def setDisplayName(itemStack: ItemStack, s: String): Unit = {
    val itemMeta = itemStack.getItemMeta
    itemMeta.setDisplayName(s)
    itemStack.setItemMeta(itemMeta)
  }

  def consumeItem(player: Player): Unit = {
    require(player.getItemInHand != null)
    val itemStack = player.getItemInHand
    val amount = itemStack.getAmount
    if (amount == 1)
      player.setItemInHand(null)
    else
      itemStack.setAmount(amount - 1)
  }
    
  def setCancelled(event: org.bukkit.event.Cancellable) = event.setCancelled(true)

  def subtract(loc1: Location, loc2: Location) = loc1.clone.subtract(loc2.clone)
}
