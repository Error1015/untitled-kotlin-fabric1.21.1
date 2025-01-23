package org.error1015.examplemod.item.curios

import com.google.common.collect.Multimap
import dev.emi.trinkets.api.SlotReference
import dev.emi.trinkets.api.TrinketItem
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.attribute.EntityAttribute
import net.minecraft.entity.attribute.EntityAttributeModifier
import net.minecraft.entity.attribute.EntityAttributes
import net.minecraft.item.ItemStack
import net.minecraft.registry.entry.RegistryEntry
import net.minecraft.util.Identifier
import net.minecraft.util.Rarity

object MyAglet : TrinketItem(Settings().maxDamage(100).rarity(Rarity.RARE).maxCount(1)) {
    override fun getModifiers(
        stack: ItemStack?,
        slot: SlotReference?,
        entity: LivingEntity?,
        slotIdentifier: Identifier?
    ): Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> {
        val modifier = super.getModifiers(stack, slot, entity, slotIdentifier)
        modifier.put(
            EntityAttributes.GENERIC_MOVEMENT_SPEED,
            EntityAttributeModifier(slotIdentifier, 0.5, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
        )
        return modifier
    }
}