package io.github.kerbalboy.block.wall;

import mindustry.world.blocks.defense.Wall;
import mindustry.world.meta.BlockGroup;

public class RedWall extends Wall {

	public RedWall(String name) {
		super(name);
		solid = true;
        destructible = true;
        group = BlockGroup.walls;
        buildCostMultiplier = 6f;
        canOverdrive = false;
        drawDisabled = false;
	}

}