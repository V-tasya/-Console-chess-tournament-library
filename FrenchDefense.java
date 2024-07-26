package Chess;

interface FrenchDefense {
    void playFrenchDefense();
}
class NimtsovichsDefense implements FrenchDefense {
    @Override public void playFrenchDefense() {
        System.out.println("1. e4  - e6");
        System.out.println("2. d4  - d5");
        System.out.println("3. e5  - c5");
        System.out.println("4. c3  - fb6");
        System.out.println("5. kf3 - kc6");
        System.out.println("6. a3  - sd7");
    }
}

class RubinsteinsVerson implements FrenchDefense {
    @Override public void playFrenchDefense() {
        System.out.println("1. e4  - e6");
        System.out.println("2. d4  - d5");
        System.out.println("3. kd2 - de4");
        System.out.println("4. ke4 - kd7");
        System.out.println("5. kf3 - kgf6");
        System.out.println("6. sg5 - h6");
        System.out.println("7. kf6 - kf6");
        System.out.println("8. sh4 - c5");
    }
}