package io.github.kerbalboy.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.type.Item;

public class TestItems implements ContentList {

	public static Item
		red;
	
	@Override
	public void load() {
		red = new Item("red", Color.valueOf("AA0000"));
	}
}