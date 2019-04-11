/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mark
 */
import java.util.ArrayList;

public class Team {

    private final String name;
    private final ArrayList<Player> players = new ArrayList<Player>();
    private int size;
    private int goals;

    public Team(String name) {
        this.name = name;
        this.size = 16;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player p) {
        if (players.size() < size) {
            players.add(p);
        }
    }

    public void printPlayers() {
        for (Player player : players) {
            System.out.println("FUCKIN HSI");
            System.out.println(player.toString());
        }
    }

    public void setMaxSize(int size) {
        this.size = size;
    }

    public int size() {
        return players.size();
    }

    public int goals() {

        for (Player player : players) {
            goals += player.goals();
        }

        return goals;
    }
}
