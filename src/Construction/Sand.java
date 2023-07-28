package Construction;

public class Sand {
    private String level;
    private int numer_of_troops;
    private int x;

    public Sand() {
    }

    public Sand(String level, int numer_of_troops) {
        this.level = level;
        this.numer_of_troops = numer_of_troops;
    }

    public Sand(String level) {
        this.level = level;
    }

    public Sand(String level, int numer_of_troops, int x) {
        this.level = level;
        this.numer_of_troops = numer_of_troops;
        this.x = x;
    }
}
