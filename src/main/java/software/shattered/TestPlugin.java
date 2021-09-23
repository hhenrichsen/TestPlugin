package software.shattered;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class TestPlugin extends JavaPlugin {
    private Greeter greeter;

    @Override
    public void onLoad() {
        this.greeter = new Greeter();
    }

    @Override
    public void onEnable() {
        greeter.load(new File(getDataFolder(), "config.yml"));
    }

    public Greeter getGreeter() {
        return greeter;
    }
}
