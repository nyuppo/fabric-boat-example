@Mixin(BoatEntity.Type.class)
public class BoatTypeMixin {
    @SuppressWarnings("InvokerTarget")
    @Invoker("<init>")
    private static BoatEntity.Type newType(String internalName, int internalId, Block baseBlock, String name) {
        throw new AssertionError();
    }

    @SuppressWarnings("ShadowTarget")
    @Shadow
    @Final
    @Mutable
    private static BoatEntity.Type[] field_7724;

    @SuppressWarnings("UnresolvedMixinReference")
    @Inject(method = "<clinit>", at = @At(value = "FIELD",
            opcode = Opcodes.PUTSTATIC,
            target = "Lnet/minecraft/entity/vehicle/BoatEntity$Type;field_7724:[Lnet/minecraft/entity/vehicle/BoatEntity$Type;",
            shift = At.Shift.AFTER))
    private static void addCustomBoatType(CallbackInfo ci) {
        var types = new ArrayList<>(Arrays.asList(field_7724));
        var last = types.get(types.size() - 1);

        var willow = newType("WILLOW", last.ordinal() + 1, ExampleMod.WILLOW_PLANKS, "willow");
        CustomBoatType.WILLOW = willow;
        types.add(willow);

        field_7724 = types.toArray(new BoatEntity.Type[0]);
    }
}

