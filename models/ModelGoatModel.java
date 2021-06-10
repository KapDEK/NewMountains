/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.blackgear.cavesandcliffs.common.entities.passive.goat.GoatEntity
 *  com.google.common.collect.ImmutableList
 *  net.minecraft.client.renderer.entity.model.AgeableModel
 *  net.minecraft.client.renderer.model.Model
 *  net.minecraft.client.renderer.model.ModelRenderer
 *  net.minecraft.util.math.MathHelper
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 */

@OnlyIn(value = Dist.CLIENT)
public static class ModelGoatModel<T extends GoatEntity> extends AgeableModel<T> {
	private final ModelRenderer headModel;
	private final ModelRenderer leftHorn;
	private final ModelRenderer rightHorn;
	private final ModelRenderer nose;
	private final ModelRenderer body;
	private final ModelRenderer legBackLeft;
	private final ModelRenderer legBackRight;
	private final ModelRenderer legFrontLeft;
	private final ModelRenderer legFrontRight;

	public ModelGoatModel() {
		super(true, 19.0f, 1.0f, 2.5f, 2.0f, 24.0f);
		this.field_78090_t = 64;
		this.field_78089_u = 64;
		this.headModel = new ModelRenderer((Model) this);
		this.headModel.func_78793_a(1.0f, 14.0f, 0.0f);
		this.headModel.func_78784_a(2, 61).func_228300_a_(2.0f, -11.0f, -10.0f, 3.0f, 2.0f, 1.0f);
		this.headModel.func_78784_a(2, 61).func_228300_a_(-6.0f, -11.0f, -10.0f, 3.0f, 2.0f, 1.0f);
		this.headModel.func_78784_a(23, 52).func_228300_a_(-0.5f, -3.0f, -14.0f, 0.0f, 7.0f, 5.0f);
		this.leftHorn = new ModelRenderer((Model) this);
		this.leftHorn.func_78793_a(0.0f, 0.0f, 0.0f);
		this.leftHorn.func_78784_a(12, 55).func_228300_a_(-0.01f, -16.0f, -10.0f, 2.0f, 7.0f, 2.0f);
		this.headModel.func_78792_a(this.leftHorn);
		this.rightHorn = new ModelRenderer((Model) this);
		this.rightHorn.func_78793_a(0.0f, 0.0f, 0.0f);
		this.rightHorn.func_78784_a(12, 55).func_228300_a_(-2.99f, -16.0f, -10.0f, 2.0f, 7.0f, 2.0f);
		this.headModel.func_78792_a(this.rightHorn);
		this.nose = new ModelRenderer((Model) this);
		this.nose.func_78793_a(0.0f, -8.0f, -8.0f);
		this.setRotationAngle(this.nose, 0.9599f, 0.0f, 0.0f);
		this.nose.func_78784_a(34, 46).func_228300_a_(-3.0f, -4.0f, -8.0f, 5.0f, 7.0f, 10.0f);
		this.headModel.func_78792_a(this.nose);
		this.body = new ModelRenderer((Model) this);
		this.body.func_78793_a(0.0f, 12.0f, 0.0f);
		this.body.func_78784_a(1, 1).func_228300_a_(-4.0f, -5.0f, -7.0f, 9.0f, 11.0f, 16.0f);
		this.body.func_78784_a(0, 28).func_228300_a_(-5.0f, -6.0f, -8.0f, 11.0f, 14.0f, 11.0f);
		this.legBackLeft = new ModelRenderer((Model) this);
		this.legBackLeft.func_78793_a(1.0f, 14.0f, 4.0f);
		this.legBackLeft.func_78784_a(36, 29).func_228300_a_(0.0f, 4.0f, 0.0f, 3.0f, 6.0f, 3.0f);
		this.legBackRight = new ModelRenderer((Model) this);
		this.legBackRight.func_78793_a(-3.0f, 14.0f, 4.0f);
		this.legBackRight.func_78784_a(49, 29).func_228300_a_(0.0f, 4.0f, 0.0f, 3.0f, 6.0f, 3.0f);
		this.legFrontLeft = new ModelRenderer((Model) this);
		this.legFrontLeft.func_78793_a(-3.0f, 14.0f, -6.0f);
		this.legFrontLeft.func_78784_a(49, 2).func_228300_a_(0.0f, 0.0f, 0.0f, 3.0f, 10.0f, 3.0f);
		this.legFrontRight = new ModelRenderer((Model) this);
		this.legFrontRight.func_78793_a(1.0f, 14.0f, -6.0f);
		this.legFrontRight.func_78784_a(35, 2).func_228300_a_(0.0f, 0.0f, 0.0f, 3.0f, 10.0f, 3.0f);
	}

	protected Iterable<ModelRenderer> func_225602_a_() {
		return ImmutableList.of((Object) this.headModel);
	}

	protected Iterable<ModelRenderer> func_225600_b_() {
		return ImmutableList.of((Object) this.body, (Object) this.legBackRight, (Object) this.legBackLeft,
				(Object) this.legFrontRight, (Object) this.legFrontLeft);
	}

	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		this.leftHorn.field_78806_j = !entityIn.func_70631_g_();
		this.rightHorn.field_78806_j = !entityIn.func_70631_g_();
		this.headModel.field_78795_f = headPitch * ((float) Math.PI / 180);
		this.headModel.field_78796_g = netHeadYaw * ((float) Math.PI / 180);
		this.legBackRight.field_78795_f = MathHelper.func_76134_b((float) (limbSwing * 0.6662f)) * 1.4f
				* limbSwingAmount;
		this.legBackLeft.field_78795_f = MathHelper.func_76134_b((float) (limbSwing * 0.6662f + (float) Math.PI)) * 1.4f
				* limbSwingAmount;
		this.legFrontRight.field_78795_f = MathHelper.func_76134_b((float) (limbSwing * 0.6662f + (float) Math.PI))
				* 1.4f * limbSwingAmount;
		this.legFrontLeft.field_78795_f = MathHelper.func_76134_b((float) (limbSwing * 0.6662f)) * 1.4f
				* limbSwingAmount;
		float rotation = entityIn.getRammingXHeadRot();
		if (rotation != 0.0f) {
			this.headModel.field_78800_c = rotation;
		}
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.field_78795_f = x;
		modelRenderer.field_78796_g = y;
		modelRenderer.field_78808_h = z;
	}
}
