package battlehub;
import battleship.core.*;
import battleship.games.*;
import battleship.ships.*;
import java.util.*;

public class DroneMain {
    
    public static void main(String[] args) {
        
        int seed = (int) Math.floor(Math.random() * 100);
        if (args.length >= 1) {
            seed = Integer.parseInt(args[0]);
        }
        
        System.out.println("Seed: " + seed);
        
        List<Spawn> c = new ArrayList<Spawn>();
        
        // Team A
        c.add(new Spawn(battleship.ships.DummyShip.class, "Team A"));
        c.add(new Spawn(battleship.ships.DummyShip.class, "Team A"));
        c.add(new Spawn(battleship.ships.DummyShip.class, "Team A"));
        c.add(new Spawn(battleship.ships.DummyShip.class, "Team A"));
        
        // Team B
        c.add(new Spawn(battleship.ships.DummyShip.class, "Team B"));
        c.add(new Spawn(battleship.ships.DummyShip.class, "Team B"));
        c.add(new Spawn(battleship.ships.DummyShip.class, "Team B"));
        c.add(new Spawn(battleship.ships.DummyShip.class, "Team B"));
        
        DroneBattle battle = new DroneBattle(c, seed);
        
        battle.setMaxTurns(100);
        battle.setArenaFile("files/drone-arena.txt");
        battle.setTurnFile("files/drone-turns.txt");
        battle.setLogFile("files/drone-log.txt");
        battle.run();
        
    }
    
}