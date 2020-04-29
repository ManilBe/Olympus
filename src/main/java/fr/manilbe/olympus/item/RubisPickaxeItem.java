
package fr.manilbe.olympus.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import fr.manilbe.olympus.OlympusElements;

@OlympusElements.ModElement.Tag
public class RubisPickaxeItem extends OlympusElements.ModElement {
	@ObjectHolder("olympus:rubis_pickaxe")
	public static final Item block = null;
	public RubisPickaxeItem(OlympusElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2509;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 1.1999999999999997f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubisItem.block, (int) (1)));
			}
		}, 1, -2.4000000000000001f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("rubis_pickaxe"));
	}
}
