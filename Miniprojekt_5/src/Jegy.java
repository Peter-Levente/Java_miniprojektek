public class Jegy {
    protected final String tantargy_neve;
    protected final int jegy;

    public Jegy(String tantargy_neve, int jegy) {
        this.tantargy_neve = tantargy_neve;
        this.jegy = jegy;
    }

    public String getTantargy_neve() {
        return tantargy_neve;
    }

    public int getJegy() {
        return jegy;
    }

    @Override
    public String toString() {
        return "Tantargy neve: " + tantargy_neve +
                ", Jegy: " + jegy;
    }
}
