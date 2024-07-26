package Chess;
import java.util.Scanner;
public class Round1 extends Chess {
    public void Number1() {
        System.out.println("Round1");
    }
    public void Information() {
        System.out.println("Choose the colour");
        System.out.println("1 - White");
        System.out.println("2 - Black");
        Scanner scn = new Scanner(System.in);
        int choose = scn.nextInt();
        switch (choose) {
            case 1:
                White white = new White();
               white.theoryLondonSystem();
               white.practiceLondonSystem();
                break;
            case 2:
                Black black= new Black();
                black.theoryFrenchdefense();
                black.practiceFrenchdefense();
                break;
            default:
                System.out.println("Wrong option. Try one more time");
        }
    }
    @Override public void theoryLondonSystem() {}

    @Override public void practiceLondonSystem() {}

    @Override public void theoryFrenchdefense() {}

    @Override public void practiceFrenchdefense() {}
}
