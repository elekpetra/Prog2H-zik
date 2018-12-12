import java.util.ArrayList;
import java.util.List;


public class Fagyi {

    private String nev;
    private List<String> fagylalt;

    public Fagyi(String nev) {
        this.nev = nev;
        this.fagylalt = new ArrayList<>();
    }

    public String getNev() {
        return nev;
    }

    public List<String> getFagylalt() {
        return fagylalt;
    }

    @Override
    public String toString() {
        return nev + ", fagylalt=" + fagylalt;
    }

}
