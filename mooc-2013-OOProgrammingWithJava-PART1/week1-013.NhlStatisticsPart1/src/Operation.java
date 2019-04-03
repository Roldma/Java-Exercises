/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mark
 */
public class Operation {

    public String sortOption;
    public String playerName;
    public String teamName;
    public int printNum;

    public Operation(String sortOption, int printNum, String playerName, String teamName) {
        this.sortOption = sortOption;
        this.printNum = printNum;
        this.playerName = playerName;
        this.teamName = teamName;
    }
    
}
