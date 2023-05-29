package org.plaxerstudios.it.plaxerhubconnetorbungeecord;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;
import org.plaxerstudios.it.plaxerhubconnetorbungeecord.Command.hub;
import org.plaxerstudios.it.plaxerhubconnetorbungeecord.Utils.Utils;

public final class PlaxerHubConnetorBungeecord extends Plugin {

    @Override
    public void onEnable() {
        Utils.loadConfig(getDataFolder());
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new hub());

    }


    @Override
    public void onDisable() {


    }
}
