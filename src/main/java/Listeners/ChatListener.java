package Listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        String[] emotes = new String[] {"4Head","BRUH","D:","PauseChamp","PepeHands","pepeLaugh","PepoG","PogChamp","Sadge","tf","WeirdChamp","YEP"};
        int i = 0;
        for (String emote : emotes) {
            i++;
            if (e.getMessage().contains(emote)) {
                switch (i) {
                    case 1:
                        e.setMessage(e.getMessage().replace(emote, "\uE001"));
                    case 2:
                        e.setMessage(e.getMessage().replace(emote, "\uE002"));
                    case 3:
                        e.setMessage(e.getMessage().replace(emote, "\uE003"));
                    case 4:
                        e.setMessage(e.getMessage().replace(emote, "\uE004"));
                    case 5:
                        e.setMessage(e.getMessage().replace(emote, "\uE005"));
                    case 6:
                        e.setMessage(e.getMessage().replace(emote, "\uE006"));
                    case 7:
                        e.setMessage(e.getMessage().replace(emote, "\uE007"));
                    case 8:
                        e.setMessage(e.getMessage().replace(emote, "\uE008"));
                    case 9:
                        e.setMessage(e.getMessage().replace(emote, "\uE009"));
                    case 10:
                        e.setMessage(e.getMessage().replace(emote, "\uE010"));
                    case 11:
                        e.setMessage(e.getMessage().replace(emote, "\uE011"));
                    case 12:
                        e.setMessage(e.getMessage().replace(emote, "\uE012"));
                }
            }
        }
    }
}
