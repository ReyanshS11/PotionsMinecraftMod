package reyansh.minecraftmod;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.alchemy.Potion;

public class ModPotionIds {
    public static final ResourceKey<Potion> FLYING_POTION = create("flying");
    public static final ResourceKey<Potion> FIRE_POTION = create("fire");
    public static final ResourceKey<Potion> ARMOR_DECAY_1_POTION = create("armor_decay_1");
    public static final ResourceKey<Potion> ARMOR_DECAY_2_POTION = create("armor_decay_2");
    public static final ResourceKey<Potion> REACH_POTION = create("reach");
    public static final ResourceKey<Potion> FEATHER_FOOT_POTION = create("feather_foot");

    private static ResourceKey<Potion> create(String name) {
        Identifier id = MinecraftMod.id(name);
        return ResourceKey.create(Registries.POTION, id);
    }
}
