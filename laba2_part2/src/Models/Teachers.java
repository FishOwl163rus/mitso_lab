package Models;

public class Teachers {
    private final String[] names;

    public Teachers(String... names) {

        this.names = names;
    }

    public String[] getNames() {
        return this.names;
    }
}
