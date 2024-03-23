
package net.mcreator.chillermod.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;

public class ChillerChickenEntity extends PathfinderMob {

	public ChillerChickenEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ChillerModModEntities.CHILLER_CHICKEN.get(), world);
	}

	public ChillerChickenEntity(EntityType<ChillerChickenEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(1f);
		xpReward = 0;
		setNoAi(false);

	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {

			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new FloatGoal(this));

	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.FALL))
			return false;
		return super.hurt(damagesource, amount);
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level().isClientSide());

		super.mobInteract(sourceentity, hand);

		sourceentity.startRiding(this);

		return retval;
	}

	@Override
	public void travel(Vec3 dir) {
		Entity entity = this.getPassengers().isEmpty() ? null : (Entity) this.getPassengers().get(0);
		if (this.isVehicle()) {
			this.setYRot(entity.getYRot());
			this.yRotO = this.getYRot();
			this.setXRot(entity.getXRot() * 0.5F);
			this.setRot(this.getYRot(), this.getXRot());
			this.yBodyRot = entity.getYRot();
			this.yHeadRot = entity.getYRot();

			if (entity instanceof LivingEntity passenger) {
				this.setSpeed((float) this.getAttributeValue(Attributes.MOVEMENT_SPEED));

				float forward = passenger.zza;

				float strafe = passenger.xxa;

				super.travel(new Vec3(strafe, 0, forward));
			}

			double d1 = this.getX() - this.xo;
			double d0 = this.getZ() - this.zo;
			float f1 = (float) Math.sqrt(d1 * d1 + d0 * d0) * 4;
			if (f1 > 1.0F)
				f1 = 1.0F;
			this.walkAnimation.setSpeed(this.walkAnimation.speed() + (f1 - this.walkAnimation.speed()) * 0.4F);
			this.walkAnimation.position(this.walkAnimation.position() + this.walkAnimation.speed());
			this.calculateEntityAnimation(true);
			return;
		}

		super.travel(dir);
	}

	public static void init() {
		SpawnPlacements.register(ChillerModModEntities.CHILLER_CHICKEN.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8));

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		return builder;
	}

}
