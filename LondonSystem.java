package Chess;

interface LondonSystem {
    void playLondonSystem();
}

class AttackOnTheRoyalFlank implements LondonSystem {
    @Override public void playLondonSystem() {
        System.out.println("1. d4  - d5");
        System.out.println("2. sf4 - kf6");
        System.out.println("3. e3  - e6");
        System.out.println("4. kf3 - sd6");
        System.out.println("5. ke5 - 0-0");
        System.out.println("6. kd2 - b6");
        System.out.println("7. sd3 - sb7");
        System.out.println("8. ff3 - kbd7");
        System.out.println("9. fh3");
    }
}

class AttackOnTheFarFlank implements LondonSystem {
    @Override public void playLondonSystem() {
        System.out.println("1.  d4   -  d5");
        System.out.println("2.  sf4  -  sf5");
        System.out.println("3.  e3   -  e6");
        System.out.println("4.  sd3  -  sd3");
        System.out.println("5.  fd3  -  c6");
        System.out.println("6.  kd2  -  kf6");
        System.out.println("7.  kgf3 -  se7");
        System.out.println("8.  0-0  -  0-0");
        System.out.println("9.  h3   -  kbd7");
        System.out.println("10. a4   -  c5");

    }
}