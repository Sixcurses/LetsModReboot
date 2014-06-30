package com.sixcurses.letsmodreboot.configuration;

import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler {
    public static void init (File configFile){
        Configuration configuration = new Configuration(configFile);

        try{ // Load the configuration file
            configuration.load();
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
        }
        catch (Exception e){ // Log the exception

        }
        finally{ // Save the configuration file
            configuration.save();
        }
    }
}
