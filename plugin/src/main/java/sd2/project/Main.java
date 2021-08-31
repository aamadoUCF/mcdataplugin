package sd2.project;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Hello world!
 *
 */
public class Main extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getLogger().info("DataCollection has been enabled.");
    }

    @Override
    public void onDisable()
    {
        getLogger().info("DataCollection has been disabled.");
    }
}
