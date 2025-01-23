package org.error1015.examplemod.item.curios

import com.google.common.collect.Multimap
import com.mojang.authlib.minecraft.client.MinecraftClient
import dev.emi.trinkets.api.SlotReference
import dev.emi.trinkets.api.TrinketEnums
import dev.emi.trinkets.api.TrinketItem
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.attribute.EntityAttribute
import net.minecraft.entity.attribute.EntityAttributeModifier
import net.minecraft.entity.attribute.EntityAttributes
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.item.tooltip.TooltipType
import net.minecraft.registry.entry.RegistryEntry
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import net.minecraft.util.Rarity

object CursedRing : TrinketItem(Settings().maxCount(1).rarity(Rarity.EPIC)) {
    override fun getModifiers(
        stack: ItemStack?,
        slot: SlotReference?,
        entity: LivingEntity?, slotIdentifier: Identifier?,
    ): Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> {
        val modifier = super.getModifiers(stack, slot, entity, slotIdentifier)
        return modifier.apply {
            put(
                EntityAttributes.GENERIC_ARMOR,
                EntityAttributeModifier(slotIdentifier, -0.5, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            )
            put(
                EntityAttributes.GENERIC_ARMOR_TOUGHNESS,
                EntityAttributeModifier(slotIdentifier, -0.5, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
            )
        }
    }

    override fun tick(stack: ItemStack?, slot: SlotReference?, entity: LivingEntity?) {
        if (entity == null || stack == null || slot == null) return
        if (!entity.world.isClient || entity !is PlayerEntity) return
        if (entity.isCreative && entity.isSpectator) return
    }

    override fun getDropRule(stack: ItemStack?, slot: SlotReference?, entity: LivingEntity?): TrinketEnums.DropRule =
        TrinketEnums.DropRule.KEEP

    override fun canUnequip(stack: ItemStack?, slot: SlotReference?, entity: LivingEntity?): Boolean =
        entity is PlayerEntity && entity.isCreative

    override fun appendTooltip(
        stack: ItemStack?,
        context: TooltipContext?,
        tooltip: MutableList<Text>?,
        type: TooltipType?
    ) {
        tooltip?.apply {
            add(Text.empty())
            add(Text.translatable("tooltip.item.examplemod.cursed_ring1"))
            add(Text.translatable("tooltip.item.examplemod.cursed_ring2"))
            add(Text.translatable("tooltip.item.examplemod.cursed_ring3"))
            add(Text.empty())
        }
    }

    override fun canEquipFromUse(stack: ItemStack?, entity: LivingEntity?): Boolean = false
}