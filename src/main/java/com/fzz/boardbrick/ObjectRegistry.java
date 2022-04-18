package com.fzz.boardbrick;

import com.fzz.boardbrick.Blocks.*;
import com.fzz.boardbrick.Items.BoardBrick_Food;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.fzz.boardbrick.Items.BoardBrick;

public class ObjectRegistry {

    //Registry Item Final
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, boardbrick.MODID);
    //Registry Block Final
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, boardbrick.MODID);

    //注册，返回的是一个根方法类，用第一个BoardBrick举例
    public static RegistryObject<Item> BoardBrick = ITEMS.register("board_brick", () -> new BoardBrick()); //Return mod BUS
    public static RegistryObject<Item> BoardBrick_Item = ITEMS.register("board_brick_food", () -> new BoardBrick_Food()); //Return mod BUS

    /*
     * Registry Block and BlockItem
     */

    //Registry Block

    public static RegistryObject<Block> A = BLOCKS.register("board_block_first", () -> new BoardBlockFirst());
    public static RegistryObject<Block> B = BLOCKS.register("board_block_second", () -> new BoardBlockSecond());
    public static RegistryObject<Block> C = BLOCKS.register("board_block_third", () -> new BoardBlockThird());
    public static RegistryObject<Block> D = BLOCKS.register("board_block_fourth", () -> new BoardBlockFourth());
    public static RegistryObject<Block> E = BLOCKS.register("board_block_fifth", () -> new BoardBlockFifth());
    public static RegistryObject<Block> F = BLOCKS.register("board_block_fourth", () -> new BoardBlockSixth());
    public static RegistryObject<Block> G = BLOCKS.register("board_block_fourth", () -> new BoardBlockSeventh());
    public static RegistryObject<Block> H = BLOCKS.register("board_block_fourth", () -> new BoardBlockEighth());
    public static RegistryObject<Block> I = BLOCKS.register("board_block_fourth", () -> new BoardBlockNinth());
    public static RegistryObject<Block> J = BLOCKS.register("board_block_fourth", () -> new BoardBlockSuper());
    //Registry BlockItem

    public static RegistryObject<Item> a = ITEMS.register("board_block_first", () -> new BlockItem(A.get(), new Item.Properties().tab(boardbrick.BoardGroup)));
    public static RegistryObject<Item> b = ITEMS.register("board_block_second", () -> new BlockItem(B.get(), new Item.Properties().tab(boardbrick.BoardGroup)));
    public static RegistryObject<Item> c = ITEMS.register("board_block_third", () -> new BlockItem(C.get(), new Item.Properties().tab(boardbrick.BoardGroup)));
    public static RegistryObject<Item> d = ITEMS.register("board_block_fourth", () -> new BlockItem(D.get(), new Item.Properties().tab(boardbrick.BoardGroup)));
    public static RegistryObject<Item> e = ITEMS.register("board_block_fifth", () -> new BlockItem(E.get(), new Item.Properties().tab(boardbrick.BoardGroup)));

}
