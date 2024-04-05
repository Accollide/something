package discover.content;

import arc.graphics.Color;
import arc.struct.Seq;
import mindustry.type.Item;

public class modItems {
    public static Item
        test
        

    public static final Seq<Item> moditems = new Seq<>();
    public static void load() {
        test = new Item("test",Color.valueOf("ffffff")) {{
            hardness = 1;
            cost = 0.7f;
            alwaysUnlocked = true;
        }}

        

        

        

        moditems.addAll(
                test
        );
    }
}