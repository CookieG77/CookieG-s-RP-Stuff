package net.cookieg.cookiegrpstuff.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbullet_proof_vest_light_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cookieg_rp_stuff", "modelbullet_proof_vest_light_converted"), "main");
	public final ModelPart global;

	public Modelbullet_proof_vest_light_Converted(ModelPart root) {
		this.global = root.getChild("global");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition global = partdefinition.addOrReplaceChild("global", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition body = global.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(34, 10).addBox(-3.25F, -13.5F, -2.5F, 6.5F, 1.25F, 5.0F, new CubeDeformation(0.0F)).texOffs(8, 0).addBox(-3.75F, -12.25F, -2.5F, 7.5F, 7.75F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 16)
						.addBox(3.5F, -9.5F, -2.0F, 0.75F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(11, 35).mirror().addBox(-4.25F, -9.5F, -2.0F, 0.75F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(7, 30)
						.addBox(-3.5F, -16.1F, -2.25F, 1.5F, 3.85F, 4.5F, new CubeDeformation(0.0F)).texOffs(16, 30).addBox(2.0F, -16.1F, -2.25F, 1.5F, 3.85F, 4.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition sideplates_right_angle_r1 = body.addOrReplaceChild("sideplates_right_angle_r1", CubeListBuilder.create().texOffs(16, 35).addBox(0.0F, 2.0F, 0.0F, 0.75F, 5.0F, 0.65F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, -11.5F, 2.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition sideplates_left_angle_r1 = body.addOrReplaceChild("sideplates_left_angle_r1", CubeListBuilder.create().texOffs(12, 35).addBox(-0.75F, 2.0F, 0.0F, 0.75F, 5.0F, 0.65F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.25F, -11.5F, 2.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition sideplates_right_angle_r2 = body.addOrReplaceChild("sideplates_right_angle_r2", CubeListBuilder.create().texOffs(8, 35).addBox(0.0F, 2.0F, -0.65F, 0.75F, 5.0F, 0.65F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, -11.5F, -2.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition sideplates_left_angle_r2 = body.addOrReplaceChild("sideplates_left_angle_r2", CubeListBuilder.create().texOffs(3, 23).addBox(-0.75F, 2.0F, -0.65F, 0.75F, 5.0F, 0.65F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.25F, -11.5F, -2.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition strips = body.addOrReplaceChild("strips",
				CubeListBuilder.create().texOffs(40, 58).mirror().addBox(-11.25F, -14.05F, 5.35F, 6.5F, 0.6F, 5.3F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 58).addBox(-11.25F, -15.05F, 5.35F, 6.5F, 0.6F, 5.3F, new CubeDeformation(0.0F))
						.texOffs(40, 58).mirror().addBox(-11.25F, -16.05F, 5.35F, 6.5F, 0.6F, 5.3F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 58).addBox(-11.25F, -17.05F, 5.35F, 6.5F, 0.6F, 5.3F, new CubeDeformation(0.0F)).texOffs(40, 58)
						.addBox(-11.25F, -18.05F, 5.35F, 6.5F, 0.6F, 5.3F, new CubeDeformation(0.0F)).texOffs(40, 58).addBox(-11.25F, -19.05F, 5.35F, 6.5F, 0.6F, 5.3F, new CubeDeformation(0.0F)).texOffs(40, 58)
						.addBox(-11.25F, -20.05F, 5.35F, 6.5F, 0.6F, 5.3F, new CubeDeformation(0.0F)).texOffs(42, 58).addBox(-10.75F, -21.05F, 5.35F, 5.5F, 0.6F, 5.3F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 8.0F, -8.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		global.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
