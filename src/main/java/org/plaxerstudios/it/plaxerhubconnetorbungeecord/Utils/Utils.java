package org.plaxerstudios.it.plaxerhubconnetorbungeecord.Utils;

import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class Utils {
    private static String hubServerName;

    public static void loadConfig(File dataFolder) {
        if (!dataFolder.exists()) {
            dataFolder.mkdir();
        }

        File configFile = new File(dataFolder, "config.yml");

        if (!configFile.exists()) {
            try (InputStream inputStream = Utils.class.getResourceAsStream("/config.yml")) {
                Files.copy(inputStream, configFile.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            Configuration configuration = ConfigurationProvider.getProvider(YamlConfiguration.class).load(configFile);
            hubServerName = configuration.getString("hub-server", "hub");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getHubServerName() {
        return hubServerName;
    }
}
