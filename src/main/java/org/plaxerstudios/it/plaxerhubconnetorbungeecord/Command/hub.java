package org.plaxerstudios.it.plaxerhubconnetorbungeecord.Command;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import org.plaxerstudios.it.plaxerhubconnetorbungeecord.PlaxerHubConnetorBungeecord;
import org.plaxerstudios.it.plaxerhubconnetorbungeecord.Utils.Utils;

public class hub extends Command {

    public hub() {
        super("hub", null, new String[]{});
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender instanceof ProxiedPlayer) {
            ProxiedPlayer player = (ProxiedPlayer) sender;
            player.connect(ProxyServer.getInstance().getServerInfo(Utils.getHubServerName()));
            sender.sendMessage("§r§lPLAXER§b§lHUB §7Sei stato teletrasportato con successo!");
        } else {
            sender.sendMessage(new TextComponent("§r§lPLAXER§b§lHUB §7Devi essere un giocatore per eseguire questo messaggio!"));
        }
    }
}
