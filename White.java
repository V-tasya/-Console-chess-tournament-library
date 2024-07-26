package Chess;

import java.util.Scanner;

public class White extends Chess{
    @Override public void theoryLondonSystem() {
        System.out.println("London System is one of the openings that has become increasingly popular over the past few years.");
    }

    @Override public void practiceLondonSystem() {

        System.out.println("Choose the variant");
        System.out.println("1 - Attack On The Royal Flank");
        System.out.println("2 - Attack On The Far Flank");
        Scanner scn = new Scanner(System.in);
        int choice = scn.nextInt();
       switch (choice) {
           case 1:
              LondonSystem londonsystem = new AttackOnTheRoyalFlank();
              londonsystem.playLondonSystem();
              break;
           case 2:
               LondonSystem landonsystem = new AttackOnTheFarFlank();
               landonsystem.playLondonSystem();
               break;
           default:
               System.out.println("Wrong option. Try one more time");
       }
    }

    @Override public void theoryFrenchdefense() {}

    @Override public void practiceFrenchdefense() {}
}
