@Mixin(BoatEntity.class)
public class BoatDropsMixin {
    @Inject(method = "asItem", at = @At("HEAD"), cancellable = true)
    public void asItem(CallbackInfoReturnable<Item> ci) {
        if (((BoatEntity)(Object)this).getBoatType() == CustomBoatType.WILLOW) {
            ci.setReturnValue(BoatItems.WILLOW_BOAT);
        }
    }
}
