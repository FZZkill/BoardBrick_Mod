package com.fzz.boardbrick.Tools.Super;

import com.fzz.boardbrick.Tools.Super.Tools.*;
import com.fzz.boardbrick.boardbrick;
import net.minecraft.item.Item;

public class Items {

    public static class Sword extends BoardBrickSwordItem {
        public Sword() {
            super(ToolTier.BoardBrickTool, boardbrick.MaxInt, boardbrick.MaxInt, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class Hoe extends BoardBrickHoeItem {
        public Hoe() {
            super(ToolTier.BoardBrickTool, boardbrick.MaxInt, boardbrick.MaxInt, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class Shovel extends BoardBrickShovelItem {
        public Shovel() {
            super(ToolTier.BoardBrickTool, boardbrick.MaxInt, boardbrick.MaxInt, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class Pickaxe extends BoardBrickPickaxeItem {
        public Pickaxe() {
            super(ToolTier.BoardBrickTool, boardbrick.MaxInt, boardbrick.MaxInt, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class Axe extends BoardBrickAxeItem {
        public Axe() {
            super(ToolTier.BoardBrickTool, boardbrick.MaxInt, boardbrick.MaxInt, new Item.Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class Bow extends BoardBrickBowItem {
        public Bow() {
            super(new Item.Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class Shears extends BoardBrickShearsItem {
        public Shears() {
            super(new Item.Properties().tab(boardbrick.BoardGroup));
        }
    }
}
