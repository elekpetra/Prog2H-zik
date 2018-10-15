
public class Nyilas extends Katona{
    private int lőtáv;

    public Nyilas(int lőtáv) {
        this.lőtáv = lőtáv;
    }

    public Nyilas(int lőtáv, int tamadoero, int vedoero) {
        super(tamadoero, vedoero);
        this.lőtáv = lőtáv;
    }
    
    
    
    public int getLőtáv() {
        return lőtáv;
    }

    
    
    
    
}
