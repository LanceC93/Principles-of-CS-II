//Name: Lance Cross Date: 10/4/2021 ID: 002634761
//adds players to the heat and spurs teams, then simulates a game between them
import java.util.Scanner;

public class NBA {
  public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		String ifAddPlayer;
		String playerName;
		
		//construct Team Heat
		System.out.println("Create the NBA team \"Heats\" ...... ");
		NBATeam heat = new NBATeam("Heats");
		System.out.print("Add a player to Heats? (yes/no): ");
		ifAddPlayer= input.next();
		
		while(ifAddPlayer.equalsIgnoreCase("yes")) {
	    	System.out.print("What is the name to be added? ");
		    playerName=input.next();
		    heat.addAPlayer(playerName);
			
	    	System.out.print("Add one more player to Heats? (yes/no): ");
			ifAddPlayer= input.next();
		}

		//construct Team spurs
        System.out.println("Create the NBA team \"Spurs\" ...... ");
        NBATeam spurs = new NBATeam("Spurs");
        System.out.print("Add a player to Spurs? (yes/no): ");
		ifAddPlayer= input.next();
	
        while(ifAddPlayer.equalsIgnoreCase("yes")) {
            System.out.print("What is the name to be added? ");
            playerName=input.next();
            spurs.addAPlayer(playerName);
        
            System.out.print("Add one more player to Spurs? (yes/no): ");
            ifAddPlayer= input.next();
        }
        System.out.println("GAME ON!!!!");

		//simulates the game
        double randInt = Math.random();
        while(heat.getWins() < 4 && spurs.getWins() < 4) {
			if(randInt > .5) {
				heat.addWin();
				spurs.addLoss();
			} else {
				spurs.addWin();
				heat.addLoss();
			}
			randInt = Math.random();
		}
		//prints Winner
		if(heat.getWins() == 4) {
			System.out.println("The Heat Wins.");
		} else {
			System.out.println("The Spurs Win.");
		}
		
		System.out.println(heat);
		System.out.println(spurs);

	}
}
