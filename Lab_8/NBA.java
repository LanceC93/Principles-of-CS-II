//Name: Lance Cross Date: 10/12/21 ID: 002634761
//simulates a game between two NBA teams

public class NBA {
    public static void main(String[] args) {
        //creates teams
        NBATeam heat = new NBATeam("Heat", 0, 0);
        NBATeam spurs = new NBATeam("Spurs", 0, 0);
        //simulates the game
        double randomNum = Math.random();
        for(int i = 0; i < 3; i++) {
            if(randomNum > .5) {
                heat.winAGame(spurs);
            } else {
                spurs.winAGame(heat);
            }
            randomNum = Math.random();
        }
        //prints final scores
        System.out.println(heat + "\n" + spurs);
    }
}
