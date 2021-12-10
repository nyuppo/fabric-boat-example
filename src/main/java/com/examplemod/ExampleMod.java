public class ExampleMod implements ModInitializer {
    public static final String MOD_ID = "example_mod";
  
    public static final Block WILLOW_PLANKS = new Block(AbstractBlock.Settings.of(Material.WOOD, MapColor.PALE_GREEN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
  
    @Override
    public void onInitialize() {
        // Register our boat item
        BoatItems.registerBoats();
      
        // Register our planks block
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "willow_planks"), WILLOW_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "willow_planks"), new BlockItem(WILLOW_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        FlammableBlockRegistry.getDefaultInstance().add(WILLOW_PLANKS, 5, 20);
    }
}
    
