package reyansh.minecraftmod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftMod implements ModInitializer {
    public static final String MOD_ID = "minecraftmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

    @Override
    public void onInitialize() {
        ModItems.initialize();
        LOGGER.info("Hello Fabric");
    }
}