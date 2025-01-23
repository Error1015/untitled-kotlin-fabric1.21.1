package org.error1015.examplemod.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class PlayerMixin extends LivingEntity {
    protected PlayerMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "getHurtSound", at = @At("HEAD"), cancellable = true)
    public void hurtSound(DamageSource source, CallbackInfoReturnable<SoundEvent> cir) {
        cir.setReturnValue(SoundEvents.BLOCK_ANVIL_USE);
    }

    @Inject(method = "getDeathSound", at = @At("HEAD"), cancellable = true)
    public void deathSound(CallbackInfoReturnable<SoundEvent> cir) {
        cir.setReturnValue(SoundEvents.BLOCK_ANVIL_LAND);
    }
}