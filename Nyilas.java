
public class Nyilas extends Katona{
    private int lőtáv;

    public Nyilas() {
    }
    
    
    
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

    public void setLőtáv(int lőtáv) {
        this.lőtáv = getTamadoero()+lőtáv;
    }

    @Override
    public String toString() {
        return super.toString()+"Nyilas: TE: " +getTamadoero()+ "VE: "+getVedoero();
    }

    

      @Override
    public boolean equals(Object obj) {
        if (obj == null || ! (obj instanceof Nyilas)) {
            return false;
        }
        else{Nyilas k=(Nyilas)obj;
        
        return (this.getVedoero()==k.getVedoero() && this.getTamadoero()==k.getTamadoero());
        
    }
    }

    
    
    
    
}
