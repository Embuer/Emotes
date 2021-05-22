package de.embuer.emotes.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EmotesCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("Available Emotes are: 4Head BRUH D: PauseChamp PepeHands pepeLaugh PepoG PogChamp Sadge tf WeirdChamp YEP");
        return true;
    }
}
