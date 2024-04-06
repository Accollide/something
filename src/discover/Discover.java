package discover;

import arc.*;
import arc.util.*;
import biotech.content.*;
import mindustry.content.Planets;
import mindustry.game.EventType.*;
import mindustry.game.Schematic;
import mindustry.game.Schematics;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
public class Discover extends Mod{

    public Discover(){
        //AAAAAA
    }

    @Override
    public void loadContent(){
        modItems.load();
        //BioLiquids.load();
        //BioSounds.load();
        //BioUnits.load();
        //BioBlocks.load();
        //BioPlanets.load();
        //BioSectorPresets.load();
        //BioTechTree.load();

        //Planets.erekir.hiddenItems.addAll(BioItems.andoriItems);
        //Planets.serpulo.hiddenItems.addAll(BioItems.andoriItems);
    }
}