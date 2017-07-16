package battlehub;
import battleship.core.*;
import battleship.games.*;
import battleship.ships.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        int seed = 42;
        Battle.Mode mode = Battle.Mode.ZONE_SPAWN;
        if (args.length >= 1) {
            switch (args[0]) {
                case "random":
                    mode = Battle.Mode.RANDOM_SPAWN;
                    break;
                case "zone":
                    mode = Battle.Mode.ZONE_SPAWN;
                    break;
            }
        }
        if (args.length >= 2) {
            seed = Integer.parseInt(args[1]);
        }
        
        List<Class<? extends Ship>> c = new ArrayList<Class<? extends Ship>>();
        
        c.add(battleship.ships.CustomShip.class);
        c.add(esi17.vkannan3.KannanShip.class);
        c.add(battleship.ships.CustomShip.class);
        
        Battle battle = new Battle(c, seed, mode);
        
        battle.setMaxTurns(100);
        battle.setArenaFile("files/battle-arena.txt");
        battle.setTurnFile("files/battle-turns.txt");
        battle.run();
        
    }
    
}