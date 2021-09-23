package software.shattered;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class Greeter {
    private String greeting;

    public void load(File file) {
        var config = YamlConfiguration.loadConfiguration(file);
        greeting = config.getString("greeting");
        if (greeting == null) {
            throw new IllegalStateException("Trying to load config without greeting!");
        }
    }

    public String getGreeting() {
        return greeting;
    }

    public String greet(String name) {
        return greeting.replaceAll("%p%", name);
    }
}
