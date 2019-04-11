/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mark
 */
public class Player {
    
    private final String name;
    private int goals;
    
    
    public Player(String name) {
        this.name = name;
    }
    
    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }
    
    public int goals() {
        return this.goals;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return String.format("%s, goals %d", this.name, this.goals);
    }
}
