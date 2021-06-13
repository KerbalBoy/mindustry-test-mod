package io.github.kerbalboy.content;

import mindustry.ctype.ContentList;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.environment.OreBlock;

import static mindustry.type.ItemStack.with;

public class TestBlocks implements ContentList {

	public static Block
		//Walls
		redWall, largeRedWall,
	
		//Ores
		red;
	
	@Override
	public void load() {
		redWall = new Wall("red-wall") {{
			size = 1;
			health = 600;
			chanceDeflect = -1;
			requirements(Category.defense, with(TestItems.red, 10));
		}};
		
		largeRedWall = new Wall("red-wall-large") {{
			size = 2;
			health = 3000;
			chanceDeflect = -1;
			requirements(Category.defense, with(TestItems.red, 50));
		}};
		
		red = new OreBlock(TestItems.red) {{
            oreDefault = true;
            oreThreshold = 0.864f;
            oreScale = 24.904762f;
		}};
	}
}