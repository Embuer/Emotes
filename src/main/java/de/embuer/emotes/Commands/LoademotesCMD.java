package de.embuer.emotes.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LoademotesCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        p.setResourcePack("https://dl.dropboxusercontent.com/s/ia2rbz1rxcos3r4/Emotes.zip?dl=0");
        return true;
    }
}
