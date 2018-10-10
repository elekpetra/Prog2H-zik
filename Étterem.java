
import java.util.Date;


public class Étterem extends VendéglátóipariEgység{
    private String [] étlap;

    

    public Étterem(String név, int férőhelyekSzáma, String[] étlap, boolean dohányzó) {
        super(név, férőhelyekSzáma, false);
        this.étlap = étlap;
    }

    public String[] getÉtlap() {
        return étlap;
    }

    @Override
    public String toString() {
        return "\u00c9tterem{" + "\u00e9tlap=" + étlap + '}';
    }
    
    
    
    
}
