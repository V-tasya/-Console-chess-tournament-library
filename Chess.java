package Chess;

abstract class Chess {
    protected String algorithminfolondon;
    protected String algorithminfofrench;
    public String getAlorithmInfoLondon() {
        return algorithminfolondon;
    }
    public void setAlorithmInfoLondon(String algorithminfolondon) {
        this.algorithminfolondon = algorithminfolondon;
    }
    public String getAlorithmInfoFrench() {
        return algorithminfofrench;
    }
    public void setAlorithmInfoFrench(String algorithminfofrench) {
        this.algorithminfofrench = algorithminfofrench;
    }

    public abstract void theoryLondonSystem();

    public abstract void theoryFrenchdefense();

    public abstract void practiceLondonSystem();

    public abstract void practiceFrenchdefense();
}
