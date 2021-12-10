# fabric-sign-example
This repo is a quick example on how to set up custom sign types on 1.18 fabric.

Created by nyuppo and [dopadream](https://github.com/dopadream) with help from the Fabric discord server: https://discord.gg/v6v4pMv

---

This example assumes you know how to set up a fabric mod, work with mixins, and create models/blockstates for blocks and items. Textures are provided.
While textures for the boat item and planks are found under the `example_mod` namespace, **the boat texture must be under the `minecraft` namespace.**

Also, this example makes use of adding to a vanilla enum. While it works here and will work with any other mod that does the same thing, it is recommended to use [Fabric-ASM](https://github.com/Chocohead/Fabric-ASM) instead going forward. Just something to keep in mind.
