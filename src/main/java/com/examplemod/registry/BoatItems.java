public class BoatItems {
    public static final Item WILLOW_BOAT = new BoatItem(CustomBoatType.WILLOW, new Item.Settings().maxCount(1).group(ItemGroup.TRANSPORTATION));

    public static void registerBoats() {
        Registry.register(Registry.ITEM, new Identifier(ExampleMod.MOD_ID, "willow_boat"), WILLOW_BOAT);
    }
}
