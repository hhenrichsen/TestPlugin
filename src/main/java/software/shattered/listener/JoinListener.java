package software.shattered.listener;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import software.shattered.TestPlugin;

public class JoinListener implements Listener {
    private final TestPlugin plugin;

    public JoinListener(TestPlugin plugin) {
        this.plugin = plugin;
    }

    public void onJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage(plugin.getGreeter().getGreeting());
    }
}
