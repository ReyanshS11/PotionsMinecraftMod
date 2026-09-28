package reyansh.minecraftmod;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.PlaceholderLookupProvider;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import org.jspecify.annotations.Nullable;

public class ReachEffect extends MobEffect {
    protected ReachEffect() {
        // category: StatusEffectCategory - describes if the effect is helpful (BENEFICIAL), harmful (HARMFUL) or useless (NEUTRAL)
        // color: int - Color is the color assigned to the effect (in RGB)
        super(MobEffectCategory.BENEFICIAL, 0xe6e619);

        this.addAttributeModifier(
                Attributes.BLOCK_INTERACTION_RANGE,
                MinecraftMod.id("effect.reach_block"),
                1.5,
                AttributeModifier.Operation.ADD_VALUE
        );

        this.addAttributeModifier(
                Attributes.ENTITY_INTERACTION_RANGE,
                MinecraftMod.id("effect.reach_entity"),
                1.5,
                AttributeModifier.Operation.ADD_VALUE
        );
    }
}
