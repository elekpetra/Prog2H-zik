import java.util.Objects;


public class Megrendeles {

    private String fajta;
    private int ar;

    public Megrendeles(String fajta, int ar) {
        this.fajta = fajta;
        this.ar = ar;
    }

    public String getFajta() {
        return fajta;
    }

    public int getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return "FagyiMegrendeles{" + "fajta=" + fajta + ", ar=" + ar + '}';
    }

}