// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class bomb_vest_A<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "bomb_vest_a"), "main");
	private final ModelPart global;

	public bomb_vest_A(ModelPart root) {
		this.global = root.getChild("global");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition global = partdefinition.addOrReplaceChild("global", CubeListBuilder.create(), PartPose.offset(-8.0F, 24.0F, 8.0F));

		PartDefinition vest = global.addOrReplaceChild("vest", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = vest.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(11, 34).addBox(-4.5F, -18.5F, -2.0F, 0.5F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(4.0F, -18.5F, -2.0F, 0.5F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(7, 34).addBox(-3.75F, -22.5F, -2.5F, 2.0F, 2.4F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(13, 17).addBox(1.75F, -22.5F, -2.5F, 2.0F, 2.4F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 11).addBox(-3.7F, -24.1F, -2.3F, 1.9F, 3.0F, 4.6F, new CubeDeformation(0.0F))
		.texOffs(29, 29).addBox(1.8F, -24.1F, -2.3F, 1.9F, 3.0F, 4.6F, new CubeDeformation(0.0F))
		.texOffs(44, 2).addBox(-4.0F, -18.5F, -2.5F, 3.75F, 6.0F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(45, 15).addBox(-3.75F, -20.1F, -2.5F, 3.5F, 1.6F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(16, 48).addBox(0.05F, -20.0F, -2.4F, 0.5F, 7.4F, 0.4F, new CubeDeformation(0.0F))
		.texOffs(34, 46).addBox(-0.25F, -20.0F, -2.375F, 0.5F, 7.4F, 0.4F, new CubeDeformation(0.0F))
		.texOffs(37, 46).addBox(-0.55F, -20.0F, -2.4F, 0.5F, 7.4F, 0.4F, new CubeDeformation(0.0F))
		.texOffs(44, 34).addBox(0.25F, -20.1F, -2.5F, 3.5F, 1.6F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(40, 44).addBox(0.25F, -18.5F, -2.5F, 3.75F, 6.0F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(25, 0).addBox(-4.0F, -21.9F, 2.0F, 8.0F, 9.4F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, 0.025F, -0.7F, 0.5F, 5.95F, 0.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -18.5F, -2.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(51, 44).addBox(0.0F, 0.025F, 0.0F, 0.5F, 5.95F, 0.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -18.5F, 2.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(25, 11).addBox(-2.0F, 0.0F, 0.025F, 2.0F, 2.6F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, -22.5F, -2.5F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 48).addBox(0.0F, 0.0F, 0.025F, 2.0F, 2.6F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -22.5F, -2.5F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(5, 51).addBox(0.0F, 0.025F, -0.7F, 0.5F, 5.95F, 0.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -18.5F, -2.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 52).addBox(-0.5F, 0.025F, 0.0F, 0.5F, 5.95F, 0.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -18.5F, 2.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition stripes = vest.addOrReplaceChild("stripes", CubeListBuilder.create().texOffs(52, 55).addBox(4.45F, -19.65F, -10.6F, 3.0F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(55, 51).addBox(8.45F, -19.65F, -10.6F, 3.0F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(55, 34).addBox(4.45F, -18.95F, -10.6F, 3.0F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(60, 14).addBox(4.45F, -18.3F, -10.6F, 1.0F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(6, 60).addBox(10.45F, -18.3F, -10.6F, 1.0F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(55, 7).addBox(8.45F, -18.95F, -10.6F, 3.0F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(59, 59).addBox(10.45F, -16.675F, -10.6F, 1.4F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(51, 19).addBox(8.45F, -15.975F, -10.6F, 3.4F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(34, 22).addBox(4.2F, -16.225F, -5.85F, 7.65F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(44, 0).addBox(4.2F, -16.975F, -5.85F, 7.65F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(40, 42).addBox(4.2F, -15.475F, -5.85F, 7.65F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(36, 40).addBox(4.2F, -14.725F, -5.85F, 7.65F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(40, 13).addBox(4.2F, -13.975F, -5.85F, 7.65F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(40, 11).addBox(4.2F, -17.975F, -5.85F, 7.65F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(39, 32).addBox(4.2F, -18.725F, -5.85F, 7.65F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(39, 30).addBox(4.2F, -19.475F, -5.85F, 7.65F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(39, 28).addBox(4.2F, -20.225F, -5.85F, 7.65F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(36, 38).addBox(4.2F, -20.975F, -5.85F, 7.65F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(34, 26).addBox(4.2F, -21.725F, -5.85F, 7.65F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(34, 24).addBox(4.2F, -13.225F, -5.85F, 7.65F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(45, 52).addBox(8.45F, -15.275F, -10.6F, 3.4F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(52, 25).addBox(8.45F, -14.575F, -10.6F, 3.4F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(52, 23).addBox(8.45F, -13.85F, -10.6F, 3.4F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(52, 21).addBox(8.45F, -13.15F, -10.6F, 3.4F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(54, 39).addBox(4.15F, -13.15F, -10.6F, 3.3F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(54, 37).addBox(4.15F, -13.85F, -10.6F, 3.3F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(54, 9).addBox(4.15F, -14.575F, -10.6F, 3.3F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(53, 53).addBox(4.15F, -15.275F, -10.6F, 3.3F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(19, 53).addBox(4.15F, -15.975F, -10.6F, 3.3F, 0.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(54, 59).addBox(4.15F, -16.675F, -10.6F, 1.4F, 0.4F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = stripes.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 22).addBox(-2.15F, -1.075F, -0.85F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -14.0F, -5.25F, 0.218F, 0.0094F, -0.0426F));

		PartDefinition bandes = global.addOrReplaceChild("bandes", CubeListBuilder.create().texOffs(29, 46).addBox(10.25F, -23.9F, -6.3F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 45).addBox(4.75F, -23.9F, -6.3F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 2).addBox(4.75F, -23.9F, -10.8F, 1.0F, 1.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(10.25F, -23.9F, -10.8F, 1.0F, 1.4F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(21, 0).addBox(6.3F, -18.975F, -10.75F, 1.0F, 0.9F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(8.7F, -18.975F, -10.75F, 1.0F, 0.9F, 0.5F, new CubeDeformation(0.0F))
		.texOffs(52, 57).addBox(10.0F, -17.75F, -10.75F, 2.0F, 1.0F, 0.25F, new CubeDeformation(0.0F))
		.texOffs(57, 27).addBox(4.0F, -17.75F, -10.75F, 2.0F, 1.0F, 0.25F, new CubeDeformation(0.0F))
		.texOffs(34, 20).addBox(3.975F, -17.75F, -5.5F, 8.05F, 1.0F, 0.25F, new CubeDeformation(0.0F))
		.texOffs(29, 38).addBox(4.75F, -24.6F, -10.1F, 1.0F, 1.0F, 4.1F, new CubeDeformation(0.0F))
		.texOffs(22, 34).addBox(10.25F, -24.6F, -10.1F, 1.0F, 1.0F, 4.1F, new CubeDeformation(0.0F))
		.texOffs(0, 45).addBox(3.25F, -17.75F, -10.0F, 0.5F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(18, 42).addBox(12.25F, -17.75F, -10.0F, 0.5F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bandes.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(44, 59).addBox(-0.5F, 0.775F, 0.0F, 0.5F, 0.95F, 1.025F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.75F, -18.5F, -6.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r9 = bandes.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(14, 59).addBox(-0.5F, 0.775F, -1.05F, 0.5F, 0.95F, 1.05F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.75F, -18.5F, -10.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r10 = bandes.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(31, 59).addBox(0.0F, 1.025F, -1.05F, 0.5F, 0.95F, 1.05F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.25F, -18.75F, -10.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r11 = bandes.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(36, 59).addBox(0.0F, 1.025F, 0.0F, 0.5F, 0.95F, 1.05F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.25F, -18.75F, -6.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r12 = bandes.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(18, 34).addBox(-1.0F, 1.025F, -0.125F, 1.0F, 2.0F, 0.575F, new CubeDeformation(0.0F))
		.texOffs(18, 34).addBox(-1.1F, 1.05F, -0.075F, 1.175F, 1.95F, 0.575F, new CubeDeformation(0.0F))
		.texOffs(26, 48).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.25F, 0.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.25F, -22.5F, -10.775F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r13 = bandes.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(10, 56).addBox(0.0F, 1.8F, -0.2F, 1.0F, 2.0F, 0.575F, new CubeDeformation(0.0F))
		.texOffs(10, 56).addBox(-0.1F, 1.875F, -0.075F, 1.175F, 1.875F, 0.575F, new CubeDeformation(0.0F))
		.texOffs(32, 11).addBox(0.0F, 0.0F, 0.0F, 1.0F, 4.25F, 0.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.75F, -22.5F, -10.775F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r14 = bandes.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(56, 15).addBox(2.025F, -1.0F, 0.0F, 0.95F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(25, 56).addBox(-3.475F, -1.0F, 0.0F, 0.95F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.25F, -23.9F, -10.8F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bandes.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(56, 44).addBox(-2.975F, -1.0F, -1.0F, 0.95F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(56, 47).addBox(2.525F, -1.0F, -1.0F, 0.95F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.75F, -23.9F, -5.3F, 0.7854F, 0.0F, 0.0F));

		PartDefinition boucledumilieu = bandes.addOrReplaceChild("boucledumilieu", CubeListBuilder.create().texOffs(3, 34).addBox(6.175F, -1.3F, -8.125F, 0.2F, 1.5F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(3, 20).addBox(5.675F, -1.3F, -8.125F, 0.5F, 0.2F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(10, 53).addBox(5.6F, -1.1F, -8.125F, 0.25F, 1.1F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(0, 47).addBox(5.0F, -0.85F, -8.125F, 0.6F, 0.6F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(19, 17).addBox(5.675F, 0.0F, -8.125F, 0.5F, 0.2F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(26, 42).addBox(6.425F, -1.3F, -8.125F, 0.2F, 1.5F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(13, 17).addBox(6.625F, 0.0F, -8.125F, 0.5F, 0.2F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(7, 45).addBox(7.2F, -0.85F, -8.125F, 0.6F, 0.6F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(10, 51).addBox(6.95F, -1.1F, -8.125F, 0.25F, 1.1F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(3, 3).addBox(6.625F, -1.3F, -8.125F, 0.5F, 0.2F, 0.1F, new CubeDeformation(0.0F)), PartPose.offset(1.6F, -16.7F, -2.7F));

		PartDefinition cube_r16 = boucledumilieu.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(14, 37).addBox(-0.125F, -0.2F, 0.05F, 0.125F, 0.2F, 0.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.2F, -1.1F, -8.175F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r17 = boucledumilieu.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(36, 38).addBox(-0.125F, 0.0F, 0.05F, 0.125F, 0.2F, 0.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.2F, 0.0F, -8.175F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r18 = boucledumilieu.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(39, 28).addBox(0.0F, 0.0F, 0.05F, 0.125F, 0.2F, 0.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 0.0F, -8.175F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r19 = boucledumilieu.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(39, 30).addBox(0.0F, -0.2F, 0.05F, 0.125F, 0.2F, 0.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, -1.1F, -8.175F, 0.0F, 0.0F, 0.3927F));

		PartDefinition lock = boucledumilieu.addOrReplaceChild("lock", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, -0.35F, -8.125F, 0.0689F, 0.0115F, -0.1654F));

		PartDefinition cube_r20 = lock.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(10, 45).addBox(-0.175F, -1.75F, 0.075F, 0.2F, 1.05F, 0.2F, new CubeDeformation(0.0F))
		.texOffs(23, 35).addBox(-0.075F, -1.85F, 0.075F, 0.85F, 0.2F, 0.2F, new CubeDeformation(0.0F))
		.texOffs(16, 45).addBox(0.675F, -1.75F, 0.075F, 0.2F, 1.05F, 0.2F, new CubeDeformation(0.0F))
		.texOffs(0, 17).addBox(-0.275F, -0.7F, -0.025F, 1.25F, 1.2F, 0.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.375F, 0.875F, -0.6F, -0.3927F, 0.0F, 0.0F));

		PartDefinition group = bandes.addOrReplaceChild("group", CubeListBuilder.create().texOffs(14, 34).addBox(8.45F, -1.3F, -7.925F, 0.2F, 1.5F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(25, 11).addBox(8.075F, -1.3F, -7.925F, 0.375F, 0.2F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(28, 53).addBox(8.0F, -1.1F, -7.925F, 0.25F, 1.1F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(7, 47).addBox(7.4F, -0.85F, -7.925F, 0.6F, 0.6F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(25, 0).addBox(8.075F, 0.0F, -7.925F, 0.375F, 0.2F, 0.1F, new CubeDeformation(0.0F)), PartPose.offset(1.6F, -16.7F, -2.7F));

		PartDefinition cube_r21 = group.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(39, 32).addBox(0.0F, 0.0F, 0.05F, 0.125F, 0.2F, 0.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 0.0F, -7.975F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r22 = group.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(40, 11).addBox(0.0F, -0.2F, 0.05F, 0.125F, 0.2F, 0.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -1.1F, -7.975F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group2 = bandes.addOrReplaceChild("group2", CubeListBuilder.create().texOffs(24, 3).addBox(5.7F, -17.7F, -10.625F, 0.375F, 0.2F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(10, 47).addBox(5.9F, -17.5F, -10.625F, 0.25F, 1.1F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(0, 45).addBox(6.15F, -17.25F, -10.625F, 0.6F, 0.6F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(20, 20).addBox(5.7F, -16.4F, -10.625F, 0.375F, 0.2F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(25, 42).addBox(5.5F, -17.7F, -10.625F, 0.2F, 1.5F, 0.1F, new CubeDeformation(0.0F)), PartPose.offset(0.25F, -0.3F, 0.0F));

		PartDefinition cube_r23 = group2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(34, 26).addBox(-0.125F, 0.0F, 0.05F, 0.125F, 0.2F, 0.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.15F, -16.4F, -10.675F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r24 = group2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(3, 37).addBox(-0.125F, -0.2F, 0.05F, 0.125F, 0.2F, 0.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.15F, -17.5F, -10.675F, 0.0F, 0.0F, -0.3927F));

		PartDefinition group3 = bandes.addOrReplaceChild("group3", CubeListBuilder.create().texOffs(34, 28).addBox(7.35F, -18.525F, -10.725F, 1.5F, 0.2F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(13, 34).addBox(8.65F, -18.325F, -10.725F, 0.2F, 0.375F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(0, 35).addBox(7.55F, -18.125F, -10.725F, 1.1F, 0.25F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(7, 34).addBox(7.35F, -18.325F, -10.725F, 0.2F, 0.375F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(23, 36).addBox(7.8F, -17.875F, -10.725F, 0.6F, 0.6F, 0.1F, new CubeDeformation(0.0F)), PartPose.offset(-1.3F, 0.2F, 0.0F));

		PartDefinition cube_r25 = group3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(34, 24).addBox(-0.2F, -0.125F, 0.0F, 0.2F, 0.125F, 0.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.55F, -17.875F, -10.725F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r26 = group3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(25, 34).addBox(0.0F, -0.125F, 0.0F, 0.2F, 0.125F, 0.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.65F, -17.875F, -10.725F, 0.0F, 0.0F, -0.3927F));

		PartDefinition group4 = bandes.addOrReplaceChild("group4", CubeListBuilder.create().texOffs(25, 16).addBox(9.75F, -18.525F, -10.725F, 1.5F, 0.2F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(33, 20).addBox(11.05F, -18.325F, -10.725F, 0.2F, 0.375F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(22, 34).addBox(9.95F, -18.125F, -10.725F, 1.1F, 0.25F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(31, 11).addBox(9.75F, -18.325F, -10.725F, 0.2F, 0.375F, 0.1F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(10.2F, -17.875F, -10.725F, 0.6F, 0.6F, 0.1F, new CubeDeformation(0.0F)), PartPose.offset(-1.3F, 0.2F, 0.0F));

		PartDefinition cube_r27 = group4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(18, 34).addBox(-0.2F, -0.125F, 0.0F, 0.2F, 0.125F, 0.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.95F, -17.875F, -10.725F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r28 = group4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(34, 22).addBox(0.0F, -0.125F, 0.0F, 0.2F, 0.125F, 0.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.05F, -17.875F, -10.725F, 0.0F, 0.0F, -0.3927F));

		PartDefinition C4 = global.addOrReplaceChild("C4", CubeListBuilder.create().texOffs(49, 59).addBox(4.45F, -13.6F, -10.7F, 0.8F, 1.2F, 0.7F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition explosif = C4.addOrReplaceChild("explosif", CubeListBuilder.create().texOffs(45, 54).addBox(-0.75F, -1.6F, -0.1F, 1.5F, 3.2F, 0.6F, new CubeDeformation(0.0F))
		.texOffs(24, 59).addBox(-0.8F, -1.2F, -0.15F, 1.6F, 0.4F, 0.65F, new CubeDeformation(0.0F))
		.texOffs(21, 2).addBox(-0.3F, -1.7F, 0.0F, 0.6F, 0.4F, 0.4F, new CubeDeformation(0.0F))
		.texOffs(59, 18).addBox(-0.8F, 0.8F, -0.15F, 1.6F, 0.4F, 0.65F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.55F, -6.425F, -11.0F, 0.0F, 0.0F, 0.0698F));

		PartDefinition explosif2 = C4.addOrReplaceChild("explosif2", CubeListBuilder.create().texOffs(34, 54).addBox(-0.675F, -1.55F, -0.1F, 1.5F, 3.2F, 0.6F, new CubeDeformation(0.0F))
		.texOffs(57, 57).addBox(-0.725F, -1.15F, -0.15F, 1.6F, 0.4F, 0.65F, new CubeDeformation(0.0F))
		.texOffs(21, 3).addBox(-0.225F, -1.65F, 0.0F, 0.6F, 0.4F, 0.4F, new CubeDeformation(0.0F))
		.texOffs(57, 31).addBox(-0.725F, 0.85F, -0.15F, 1.6F, 0.4F, 0.65F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.625F, -6.575F, -11.0F, -0.0437F, 0.048F, 0.0852F));

		PartDefinition explosif3 = C4.addOrReplaceChild("explosif3", CubeListBuilder.create().texOffs(18, 55).addBox(-0.725F, -1.625F, -0.1F, 1.5F, 3.2F, 0.6F, new CubeDeformation(0.0F))
		.texOffs(0, 59).addBox(-0.775F, -1.225F, -0.15F, 1.6F, 0.4F, 0.65F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(-0.275F, -1.725F, 0.0F, 0.6F, 0.4F, 0.4F, new CubeDeformation(0.0F))
		.texOffs(57, 29).addBox(-0.775F, 0.775F, -0.15F, 1.6F, 0.4F, 0.65F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8F, -6.475F, -11.0F, 0.0303F, 0.1204F, -0.0606F));

		PartDefinition explosif4 = C4.addOrReplaceChild("explosif4", CubeListBuilder.create().texOffs(55, 2).addBox(-0.775F, -1.575F, -0.1F, 1.5F, 3.2F, 0.6F, new CubeDeformation(0.0F))
		.texOffs(58, 41).addBox(-0.825F, -1.175F, -0.15F, 1.6F, 0.4F, 0.65F, new CubeDeformation(0.0F))
		.texOffs(30, 20).addBox(-0.325F, -1.675F, 0.0F, 0.6F, 0.4F, 0.4F, new CubeDeformation(0.0F))
		.texOffs(58, 12).addBox(-0.825F, 0.825F, -0.15F, 1.6F, 0.4F, 0.65F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.325F, -6.625F, -11.0F, 0.0F, -0.1178F, 0.0873F));

		PartDefinition cables = C4.addOrReplaceChild("cables", CubeListBuilder.create(), PartPose.offset(4.8F, -6.375F, -11.35F));

		PartDefinition cube_r29 = cables.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(63, 1).addBox(-0.6F, -8.05F, 0.75F, 0.2F, 1.05F, 0.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r30 = cables.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(63, 1).addBox(6.8F, -0.45F, 0.5F, 0.2F, 1.05F, 0.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r31 = cables.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(63, 1).addBox(2.45F, -1.95F, 0.8F, 0.2F, 1.05F, 0.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 0.0F, -0.025F, 0.0F, 0.0F, -0.4014F));

		PartDefinition cube_r32 = cables.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(63, 1).addBox(-0.3F, -2.075F, 0.475F, 0.2F, 1.05F, 0.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1396F));

		PartDefinition cube_r33 = cables.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(63, 1).addBox(-0.15F, -0.475F, 0.475F, 0.2F, 1.05F, 0.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, -1.8F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r34 = cables.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(63, 0).addBox(0.275F, -2.125F, 0.45F, 0.2F, 2.0F, 0.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, -1.8F, 0.0F, 0.0F, 0.0F, -1.6493F));

		PartDefinition cube_r35 = cables.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(63, 0).addBox(0.575F, -6.2F, 0.875F, 0.2F, 2.0F, 0.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 0.0F, -0.025F, 0.0F, 0.1178F, -0.0916F));

		PartDefinition cube_r36 = cables.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(63, 0).addBox(2.725F, -3.35F, 0.8F, 0.2F, 2.0F, 0.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 0.0F, -0.025F, 0.0F, 0.0F, -0.6283F));

		PartDefinition cube_r37 = cables.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(63, 1).addBox(6.65F, -2.675F, 0.425F, 0.2F, 1.05F, 0.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 0.0F, 0.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r38 = cables.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(63, 1).addBox(4.85F, -1.925F, 0.5F, 0.2F, 1.05F, 0.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0742F));

		PartDefinition cube_r39 = cables.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(63, 0).addBox(0.75F, 2.425F, 0.475F, 0.2F, 2.0F, 0.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.15F, -1.8F, 0.0F, 0.0F, 0.0F, -1.4573F));

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