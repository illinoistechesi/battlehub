package battlehub;
import battleship.core.*;
import battleship.games.*;
import battleship.ships.*;
import java.util.*;

public class TeamMain {
    
    public static void main(String[] args) {
        
        int seed = (int) Math.floor(Math.random() * 100);
        if (args.length >= 1) {
            seed = Integer.parseInt(args[0]);
        }
        
        System.out.println("Seed: " + seed);
        
        List<TeamBattle.Loyalty> c = new ArrayList<TeamBattle.Loyalty>();
        
        // Team A
        c.add(new TeamBattle.Loyalty(battleship.ships.DummyShip.class, "Team B"));
        c.add(new TeamBattle.Loyalty(battleship.ships.DummyShip.class, "Team B"));
        c.add(new TeamBattle.Loyalty(battleship.ships.DummyShip.class, "Team B"));
        
        // Team B
        c.add(new TeamBattle.Loyalty(battleship.ships.DummyShip.class, "Team B"));
        c.add(new TeamBattle.Loyalty(battleship.ships.DummyShip.class, "Team B"));
        c.add(new TeamBattle.Loyalty(battleship.ships.DummyShip.class, "Team B"));
        
        TeamBattle battle = new TeamBattle(c, seed);
        
        battle.setMaxTurns(100);
        battle.setArenaFile("files/team-arena.txt");
        battle.setTurnFile("files/team-turns.txt");
        battle.setLogFile("files/team-log.txt");
        battle.run();
        
    }
    
}