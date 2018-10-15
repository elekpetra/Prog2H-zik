
public class Landzsas extends Katona{

    public Landzsas() {
    }

    public Landzsas(int tamadoero, int vedoero) {
        super(tamadoero, vedoero);
    }
    
    @Override
    public String toString() {
        return super.toString()+"Landzas: TE: " +getTamadoero()+ "VE: "+getVedoero();
    }
    
}
