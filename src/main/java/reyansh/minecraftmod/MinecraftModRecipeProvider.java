package reyansh.minecraftmod;

import java.util.concurrent.CompletableFuture;

import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.BrewingProvider;
import net.minecraft.data.recipes.BrewingRecipeBuilder;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionIds;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Recipe;
import reyansh.minecraftmod.MinecraftMod;
import reyansh.minecraftmod.ModItems;

public class MinecraftModRecipeProvider extends FabricRecipeProvider {
    public MinecraftModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(
            HolderLookup.Provider provider,
            BootstrapContext<Recipe<?>> recipeContext,
            BootstrapContext<Advancement> advancementContext
    ) {
        return new RecipeProvider(recipeContext, advancementContext) {
            @Override
            public void buildRecipes() {
                // Splash Potions
                BrewingRecipeBuilder.brewingContainerTransform(
                        Items.POTION,
                        ModItems.FEATHER_FOOT,
                        Items.GUNPOWDER,
                        Items.SPLASH_POTION
                ).save(output, ResourceKey.create(
                        Registries.RECIPE,
                        MinecraftMod.id("feather_foot_splash")
                ));

                BrewingRecipeBuilder.brewingContainerTransform(
                        Items.POTION,
                        ModItems.REACH,
                        Items.GUNPOWDER,
                        Items.SPLASH_POTION
                ).save(output, ResourceKey.create(
                        Registries.RECIPE,
                        MinecraftMod.id("reach_splash")
                ));

                BrewingRecipeBuilder.brewingContainerTransform(
                        Items.POTION,
                        ModItems.ARMOR_DECAY_1,
                        Items.GUNPOWDER,
                        Items.SPLASH_POTION
                ).save(output, ResourceKey.create(
                        Registries.RECIPE,
                        MinecraftMod.id("armor_decay_1_splash")
                ));

                BrewingRecipeBuilder.brewingContainerTransform(
                        Items.POTION,
                        ModItems.ARMOR_DECAY_2,
                        Items.GUNPOWDER,
                        Items.SPLASH_POTION
                ).save(output, ResourceKey.create(
                        Registries.RECIPE,
                        MinecraftMod.id("armor_decay_2_splash")
                ));

                BrewingRecipeBuilder.brewingContainerTransform(
                        Items.POTION,
                        ModItems.FLYING,
                        Items.GUNPOWDER,
                        Items.SPLASH_POTION
                ).save(output, ResourceKey.create(
                        Registries.RECIPE,
                        MinecraftMod.id("flying_splash")
                ));

                BrewingRecipeBuilder.brewingContainerTransform(
                        Items.POTION,
                        ModItems.FIRE,
                        Items.GUNPOWDER,
                        Items.SPLASH_POTION
                ).save(output, ResourceKey.create(
                        Registries.RECIPE,
                        MinecraftMod.id("fire_splash")
                ));

                // Lingering Potions
                BrewingRecipeBuilder.brewingContainerTransform(
                        Items.SPLASH_POTION,
                        ModItems.FLYING,
                        Items.DRAGON_BREATH,
                        Items.LINGERING_POTION
                ).save(output, ResourceKey.create(
                        Registries.RECIPE,
                        MinecraftMod.id("flying_lingering")
                ));

                BrewingRecipeBuilder.brewingContainerTransform(
                        Items.SPLASH_POTION,
                        ModItems.FIRE,
                        Items.DRAGON_BREATH,
                        Items.LINGERING_POTION
                ).save(output, ResourceKey.create(
                        Registries.RECIPE,
                        MinecraftMod.id("fire_lingering")
                ));

                BrewingRecipeBuilder.brewingContainerTransform(
                        Items.SPLASH_POTION,
                        ModItems.ARMOR_DECAY_1,
                        Items.DRAGON_BREATH,
                        Items.LINGERING_POTION
                ).save(output, ResourceKey.create(
                        Registries.RECIPE,
                        MinecraftMod.id("armor_decay_1_lingering")
                ));

                BrewingRecipeBuilder.brewingContainerTransform(
                        Items.SPLASH_POTION,
                        ModItems.ARMOR_DECAY_2,
                        Items.DRAGON_BREATH,
                        Items.LINGERING_POTION
                ).save(output, ResourceKey.create(
                        Registries.RECIPE,
                        MinecraftMod.id("armor_decay_2_lingering")
                ));

                BrewingRecipeBuilder.brewingContainerTransform(
                        Items.SPLASH_POTION,
                        ModItems.REACH,
                        Items.DRAGON_BREATH,
                        Items.LINGERING_POTION
                ).save(output, ResourceKey.create(
                        Registries.RECIPE,
                        MinecraftMod.id("reach_lingering")
                ));

                BrewingRecipeBuilder.brewingContainerTransform(
                        Items.SPLASH_POTION,
                        ModItems.FEATHER_FOOT,
                        Items.DRAGON_BREATH,
                        Items.LINGERING_POTION
                ).save(output, ResourceKey.create(
                        Registries.RECIPE,
                        MinecraftMod.id("feather_foot_lingering")
                ));
            }
        };
    }

    @Override
    public String getName() {
        return "MinecraftModRecipeProvider";
    }
}