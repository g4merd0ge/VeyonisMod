package com.dodiks.veyonis;

import com.dodiks.veyonis.entity.ModEntities;
import com.dodiks.veyonis.entity.client.FemcelModel;
import com.dodiks.veyonis.entity.client.FemcelRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class VeyonisModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(FemcelModel.FEMCEL, FemcelModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.FEMCEL, FemcelRenderer::new);
    }
}
