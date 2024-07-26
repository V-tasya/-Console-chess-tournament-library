package Chess;

import java.util.Scanner;

public class Black extends Chess{
    @Override public void theoryFrenchdefense() {
        System.out.println("The French Defense is a solid and strategic chess opening that arises after the moves 1.e4 e6.");
    }

    @Override public void practiceFrenchdefense() {
        System.out.println("Choose the variant");
        System.out.println("1 - Nimtsovichs Defense");
        System.out.println("2 - Rubinsteins Verson");
        Scanner scn = new Scanner(System.in);
        int variant = scn.nextInt();
        switch (variant) {
            case 1:
                FrenchDefense frenchdefense = new NimtsovichsDefense();
                frenchdefense.playFrenchDefense();
                break;
            case 2:
                FrenchDefense frenchdifense = new RubinsteinsVerson();
                frenchdifense.playFrenchDefense();
                break;
            default:
                System.out.println("Wrong option. Try one more time");
        }
    }

    @Override public void theoryLondonSystem() {}

    @Override public void practiceLondonSystem() {}
}
