//Name: Lance Cross Date: 10/12/21 ID: 002634761
//allows creation of a NBATeam object to represent an NBA Team
public class NBATeam {

    //instance variabls of NBATeam
    private String teamName;
    private int numWins;
    private int numLosses;

    //constructor
    public NBATeam(String s, int w, int l) {
        teamName = s;
        numWins = w;
        numLosses = l;
    }

    //adds a win to the team
    public void winAGame() {
        numWins++;
    }

    //adds a loss to the team
    public void loseAGame() {
        numLosses++;
    }

    //adds a win to the this team and adds a loss to the oppsoing team
    public void winAGame(NBATeam teamB) {
        numWins++;
        teamB.loseAGame();
    }

    //adds a loss to the this team and adds a win to the oppsoing team
    public void loseAGame(NBATeam teamB) {
        numLosses++;
        teamB.winAGame();
    }

    //return string representation of an NBATeam object
    public String toString() {
        return teamName + ": W: " + numWins + ", L: " + numLosses;
    }
}