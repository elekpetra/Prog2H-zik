
import java.util.Arrays;

public class Katona {
    
    private int tamadoero;
    private int vedoero;

    public Katona() {
        this.tamadoero=5;
        this.vedoero=5;
    }

    public Katona(int tamadoero, int vedoero) {
        this.tamadoero = tamadoero;
        this.vedoero = vedoero;
    }

    public int getTamadoero() {
        return tamadoero;
    }

    public int getVedoero() {
        return vedoero;
    }
    
    

    @Override
    public String toString() {
        return "TE:" + tamadoero + "VE:" + vedoero;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || ! (obj instanceof Katona)) {
            return false;
        }
        Katona k=(Katona)obj;
        
        return this.vedoero==(k.getVedoero())&&this.tamadoero==(k.getTamadoero());
        
    
    }
    
    
    
}
