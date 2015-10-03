organization := "io.github.ujihisa"

name := "sugot-scala"

scalaVersion := "2.11.7"

licenses := Seq(
  "GPL3 or any later versions" -> url("http://www.gnu.org/licenses/gpl-3.0.en.html"))

resolvers ++= Seq(
  "org.bukkit" at "http://repo.bukkit.org/content/groups/public/",
  "spigot-repo" at "https://hub.spigotmc.org/nexus/content/repositories/snapshots/"
  //"localrepo1" at "file://myrepo"
  )

libraryDependencies ++= Seq(
  "org.spigotmc" % "spigot-api" % "1.8.8-R0.1-SNAPSHOT"
  // "org.spigotmc" % "spigot" % "1.8.8"
  )
