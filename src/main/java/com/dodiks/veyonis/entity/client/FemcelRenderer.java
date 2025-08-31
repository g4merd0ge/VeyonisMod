package com.dodiks.veyonis.entity.client;

import com.dodiks.veyonis.VeyonisMod;
import com.dodiks.veyonis.entity.custom.FemcelEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class FemcelRenderer extends MobEntityRenderer<FemcelEntity, FemcelModel<FemcelEntity>> {

    public FemcelRenderer(EntityRendererFactory.Context context) {
        super(context, new FemcelModel<>(context.getPart(FemcelModel.FEMCEL)), 0.5f);
    }

    @Override
    public Identifier getTexture(FemcelEntity entity) {
        return Identifier.of(VeyonisMod.MOD_ID, "textures/entity/femcel/femcel.png");
    }

    @Override
    public void render(FemcelEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.scale(1f, 1f, 1f);

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
