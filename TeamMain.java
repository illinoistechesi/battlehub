package battlehub;
import battleship.core.*;
import battleship.games.*;
import battleship.ships.*;
import java.util.*;

public class TeamMain {
    
    public static void main(String[] args) {
        
        int seed = 42;
        if (args.length >= 2) {
            seed = Integer.parseInt(args[0]);
        }
        
        List<TeamBattle.Loyalty> c = new ArrayList<TeamBattle.Loyalty>();
        
        
        c.add(new TeamBattle.Loyalty(esi17.cs.RandomShip.class, "Team A"));
        //c.add(new TeamBattle.Loyalty(battleship.ships.DummyShip.class, "Team A"));
        c.add(new TeamBattle.Loyalty(battleship.ships.DummyShip.class, "Team A"));
        c.add(new TeamBattle.Loyalty(battleship.ships.DummyShip.class, "Team A"));
        c.add(new TeamBattle.Loyalty(battleship.ships.CustomShip.class, "Team B"));
        c.add(new TeamBattle.Loyalty(battleship.ships.CustomShip.class, "Team B"));
        c.add(new TeamBattle.Loyalty(battleship.ships.CustomShip.class, "Team B"));
        
        TeamBattle battle = new TeamBattle(c, seed);
        
        battle.setMaxTurns(100);
        battle.setArenaFile("files/team-arena.txt");
        battle.setTurnFile("files/team-turns.txt");
        battle.setLogFile("files/team-log.txt");
        battle.run();
        
    }
    
}