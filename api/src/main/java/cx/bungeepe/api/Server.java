package cx.bungeepe.api;

import lombok.NonNull;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Collection;
import java.util.HashMap;

@ParametersAreNonnullByDefault
public interface Server {

    void broadcastMessage(String message);

    @Nonnull
    String getName();

    @Nonnull
    SemVer getMinecraftVersion();

    @Nonnull
    SemVer getApiVersion();

    @Nonnull
    String getNukkitVersion();

    @Nonnull
    EventManager getEventManager();

    @Nonnull
    PluginManager getPluginManager();

    @NonNull
    BungeeScheduler getScheduler();

    @Nonnull
    ConsoleCommandSender getConsoleCommandSender();

    @Nonnull
    Configuration getConfiguration();

    @Nonnull
    PermissionManager getPermissionManager();

    Optional<Player> getPlayer(String name);

    Optional<Player> getPlayerExact(String name);

    void shutdown();

    void shutdown(String reason);

    @Nonnull
    Collection<Player> getOnlinePlayers();

    @NonNull
    HashMap<String, Server> getServers();

}
