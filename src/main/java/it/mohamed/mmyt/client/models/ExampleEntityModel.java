package it.mohamed.mmyt.client.models;// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import it.mohamed.mmyt.TutorialMod;
import it.mohamed.mmyt.entity.ExampleEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class ExampleEntityModel extends EntityModel<ExampleEntity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(TutorialMod.MOD_ID, "exmaple_entity"), "main");
	private final ModelPart body;
	private final ModelPart legs;

	public ExampleEntityModel(ModelPart root) {
		this.body = root.getChild("body");
		this.legs = root.getChild("legs");
	}

	public static LayerDefinition createBodyLayer() {
		var mesh  = new MeshDefinition();
		PartDefinition parts = mesh.getRoot();

		PartDefinition body = parts.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 88).addBox(-3.0F, -16.0F, 12.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 88).addBox(-3.0F, -16.0F, 12.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(42, 88).addBox(1.0F, -16.0F, 12.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(50, 88).addBox(-3.0F, -21.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 88).addBox(1.0F, -21.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(72, 88).addBox(-3.0F, -19.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(88, 80).addBox(1.0F, -19.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 56).addBox(-1.0F, -17.0F, 0.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(44, 56).addBox(-3.0F, -17.0F, 0.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(11, 63).addBox(1.0F, -17.0F, 0.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(33, 63).addBox(3.0F, -17.0F, 0.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(55, 63).addBox(-1.0F, -17.0F, 2.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(66, 0).addBox(1.0F, -17.0F, 2.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(66, 14).addBox(3.0F, -17.0F, 2.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(66, 28).addBox(3.0F, -17.0F, 4.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(66, 42).addBox(3.0F, -17.0F, 6.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(66, 56).addBox(1.0F, -17.0F, 4.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 70).addBox(1.0F, -17.0F, 6.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(22, 70).addBox(-1.0F, -17.0F, 4.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(44, 70).addBox(-1.0F, -17.0F, 6.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(66, 70).addBox(-3.0F, -17.0F, 4.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(77, 7).addBox(-3.0F, -17.0F, 6.0F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, -17.0F, 2.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(11, 7).addBox(-5.0F, -17.0F, 0.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(0, 14).addBox(-5.0F, -17.0F, 2.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(11, 21).addBox(-5.0F, -17.0F, 4.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(22, 0).addBox(-5.0F, -17.0F, 6.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(22, 14).addBox(3.0F, -17.0F, -4.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(0, 28).addBox(3.0F, -17.0F, -2.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(22, 28).addBox(1.0F, -17.0F, -2.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(33, 7).addBox(1.0F, -17.0F, -4.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(33, 21).addBox(-1.0F, -17.0F, -4.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(11, 35).addBox(-1.0F, -17.0F, -2.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(33, 35).addBox(-3.0F, -17.0F, -4.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(0, 42).addBox(-3.0F, -17.0F, -2.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(22, 42).addBox(-5.0F, -17.0F, -2.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(44, 0).addBox(-5.0F, -17.0F, -4.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(44, 14).addBox(-5.0F, -17.0F, -6.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(44, 28).addBox(-3.0F, -17.0F, -6.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(44, 42).addBox(-1.0F, -17.0F, -6.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(11, 49).addBox(1.0F, -17.0F, -6.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(33, 49).addBox(3.0F, -17.0F, -6.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(55, 7).addBox(-5.0F, -17.0F, -8.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(55, 21).addBox(-1.0F, -17.0F, -8.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(55, 35).addBox(1.0F, -17.0F, -8.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(55, 49).addBox(3.0F, -17.0F, -8.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(0, 56).addBox(-3.0F, -17.0F, -8.0F, 2.0F, 7.0F, 7.2F, new CubeDeformation(0.0F))
		.texOffs(11, 3).addBox(3.0F, -12.0F, -4.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(19, 3).addBox(3.0F, -12.0F, -2.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(33, 0).addBox(1.0F, -12.0F, -2.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(39, 2).addBox(1.0F, -12.0F, -4.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(55, 0).addBox(-1.0F, -12.0F, -4.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(61, 2).addBox(-1.0F, -12.0F, -2.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(77, 0).addBox(-3.0F, -12.0F, -4.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(77, 28).addBox(-3.0F, -12.0F, -2.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(77, 42).addBox(-5.0F, -12.0F, -2.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(77, 56).addBox(-5.0F, -12.0F, -4.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(77, 70).addBox(-5.0F, -12.0F, -6.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(16, 82).addBox(-3.0F, -12.0F, -6.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(38, 82).addBox(-1.0F, -12.0F, -6.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(60, 82).addBox(1.0F, -12.0F, -6.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(82, 82).addBox(3.0F, -12.0F, -6.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(83, 2).addBox(-5.0F, -12.0F, -8.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(83, 26).addBox(-1.0F, -12.0F, -8.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(83, 30).addBox(1.0F, -12.0F, -8.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(83, 40).addBox(3.0F, -12.0F, -8.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(83, 44).addBox(-3.0F, -12.0F, -8.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(83, 54).addBox(-5.0F, -12.0F, 2.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(83, 58).addBox(-3.0F, -12.0F, 2.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(88, 84).addBox(-1.0F, -12.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(83, 68).addBox(-5.0F, -12.0F, 0.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(86, 88).addBox(-1.0F, -12.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(89, 0).addBox(1.0F, -12.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(89, 28).addBox(3.0F, -12.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(89, 38).addBox(-3.0F, -12.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(89, 42).addBox(-5.0F, -12.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(89, 52).addBox(3.0F, -12.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(11, 0).addBox(-3.0F, -12.0F, 12.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(89, 56).addBox(1.0F, -12.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(89, 66).addBox(3.0F, -12.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(83, 72).addBox(-5.0F, -12.0F, 4.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(89, 70).addBox(-1.0F, -12.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(14, 90).addBox(1.0F, -12.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(90, 23).addBox(3.0F, -12.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(90, 32).addBox(-3.0F, -12.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(34, 90).addBox(-3.0F, -12.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(90, 46).addBox(-1.0F, -12.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(56, 90).addBox(1.0F, -12.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 84).addBox(-5.0F, -12.0F, 6.0F, 2.0F, 2.0F, 2.2F, new CubeDeformation(0.0F))
		.texOffs(90, 60).addBox(3.0F, -12.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition legs = parts.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		
		PartDefinition cube_r2 = legs.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 84).addBox(3.0F, -4.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(84, 21).addBox(-5.0F, -8.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 84).addBox(-5.0F, -10.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 84).addBox(-5.0F, -10.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(84, 34).addBox(-5.0F, -8.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(44, 84).addBox(3.0F, -8.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(84, 48).addBox(-5.0F, -6.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(52, 84).addBox(3.0F, -2.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(84, 62).addBox(3.0F, -8.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(66, 84).addBox(-5.0F, -6.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(74, 84).addBox(-5.0F, -2.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(84, 76).addBox(-5.0F, -4.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(14, 86).addBox(3.0F, -6.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(36, 86).addBox(3.0F, -4.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(58, 86).addBox(-5.0F, -2.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(80, 86).addBox(-5.0F, -4.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 88).addBox(3.0F, -2.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(88, 6).addBox(3.0F, -6.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(8, 88).addBox(3.0F, -10.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(88, 10).addBox(3.0F, -10.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		return LayerDefinition.create(mesh, 128, 128);
	}

	@Override
	public void setupAnim(@NotNull ExampleEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}