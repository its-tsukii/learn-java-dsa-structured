package DataStructures.Maps;

import DataStructures.Maps.ConcurrentHashMaps.MainConcurrentMaps;
import DataStructures.Maps.HashMaps.MainHashmaps;
import DataStructures.Maps.LinkedHashMaps.MainLinkedHashmaps;
import DataStructures.Maps.TreeMaps.MainTreesMaps;

public class Main_For_All_Maps {
    public static void main(String[] args) {
        MainHashmaps.run();
        MainLinkedHashmaps.run();
        MainTreesMaps.run();
        MainConcurrentMaps.run();
    }
}
