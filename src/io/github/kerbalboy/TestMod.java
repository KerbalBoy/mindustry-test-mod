package io.github.kerbalboy;

import arc.*;
import arc.util.*;
import io.github.kerbalboy.content.Loader;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class TestMod extends Mod{

    public TestMod(){
        Log.info("Loaded TestMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialogue = new BaseDialog("frog");
                dialogue.cont.add("SURPRISE FROG").row();
                
                dialogue.cont.image(Core.atlas.find("test-mod-frog")).pad(20f).row();
                
                dialogue.cont.add("This mod is only to test out new features.").row();
                dialogue.cont.add("Visit kerbalboy.github.io for useful mods!").row();
                
                dialogue.cont.button("Hail froggo!", dialogue::hide).size(100f, 50f);
                dialogue.show();
            });
        });
    }

    @Override
    public void loadContent(){
		Loader loader = new Loader();
		loader.load();
		
		Log.info("Loaded TestMod!");
    }
}