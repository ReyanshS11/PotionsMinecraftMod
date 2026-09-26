package reyansh.minecraftmod;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class FlyingEffect extends MobEffect {
    protected FlyingEffect() {
        // category: StatusEffectCategory - describes if the effect is helpful (BENEFICIAL), harmful (HARMFUL) or useless (NEUTRAL)
        // color: int - Color is the color assigned to the effect (in RGB)
        super(MobEffectCategory.BENEFICIAL, 0x5fd7f5);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
        if (entity instanceof Player) {
            ((Player) entity).getAbilities().mayfly = true;
            ((Player) entity).onUpdateAbilities();
        }

        return super.applyEffectTick(level, entity, amplifier);
    }
}
