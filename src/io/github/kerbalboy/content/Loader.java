package io.github.kerbalboy.content;

import java.util.ArrayList;

import mindustry.ctype.ContentList;

public class Loader implements ContentList {

	@Override
	public void load() {
		ArrayList<ContentList> content = new ArrayList<ContentList>();
		content.add(new Items());
		content.add(new Blocks());
		
		for (ContentList contentList: content) {
			contentList.load();
		}
	}
}