import java.util.Arrays;

//Name: Lance Cross Date: 10/4/2021 ID: 002634761
//allows the creation of an NBATeam object
public class NBATeam {
	private String sTeamName;
	private int nWin;
	private int nLoss;
	private String [] playerArray;

    public NBATeam(String name) {
        sTeamName = name;
        nWin = 0;
        nLoss = 0;
        playerArray = new String[0];
    }
    //gets sTeamName
    public String getName() {
        return sTeamName;
    }
    //gets number of wins
    public int getWins() {
        return nWin;
    }
    //gets number of losses
    public int getLosses() {
        return nLoss;
    }
    //adds a win to the team object
    public void addWin() {
        nWin += 1;
    }
    //adds a loss to the team object
    public void addLoss() {
        nLoss += 1;
    }
    //adds a player to the team array
    public void addAPlayer(String name) {
        playerArray = Arrays.copyOf(playerArray, playerArray.length + 1);
        playerArray[playerArray.length - 1] = name;
    }
    //return String representation of the team
    public String toString() {
        return sTeamName + Arrays.toString(playerArray).replaceAll(",", "") + " wins: " + nWin + " losses: " + nLoss;
    }
}
