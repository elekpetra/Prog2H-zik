public class Kocsma extends VendéglátóipariEgység{
    private String [] sörlap;

    public Kocsma( String név, int férőhelyekSzáma, String[] sörlap, boolean dohányzó) {
        super(név, férőhelyekSzáma, true);
        this.sörlap = sörlap;
    }

    

    public String[] getSörlap() {
        return sörlap;
    }

    @Override
    public String toString() {
        return "Kocsma{" + "s\u00f6rlap=" + sörlap + '}';
    }

    

    
    
    
}
