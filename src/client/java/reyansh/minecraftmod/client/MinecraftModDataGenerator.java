package reyansh.minecraftmod.client;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.data.recipes.BrewingRecipeBuilder;
import net.minecraft.world.item.Items;
import reyansh.minecraftmod.MinecraftModRecipeProvider;
import reyansh.minecraftmod.ModItems;

public class MinecraftModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(MinecraftModRecipeProvider::new);
    }
}