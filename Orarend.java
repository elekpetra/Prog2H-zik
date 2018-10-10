
package iskola;


public class Orarend {
    private String Nap;
    private Ora[] órák;
    private int számláló;

    public Orarend(String Nap, Ora[] órák, int számláló) {
        this.Nap = Nap;
        this.órák = new Ora[12];
        this.számláló = 0;
    }

    Orarend(String st) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getNap() {
        return Nap;
    }

    public void setNap(String Nap) {
        this.Nap = Nap;
    }

    public Ora[] getÓrák() {
        return órák;
    }

    public void setÓrák(Ora[] órák) {
        this.órák = órák;
    }

    public int getSzámláló() {
        return számláló;
    }

    public void setSzámláló(int számláló) {
        this.számláló = számláló;
    }

    @Override
    public String toString() {
        return "Orarend{" + "Nap=" + Nap + ", \u00f3r\u00e1k=" + órák + ", sz\u00e1ml\u00e1l\u00f3=" + számláló + '}';
    }

    public boolean oratHozzáad(Ora ujora){
            if(számláló>=12){
                return false;
            }
            
            for(int i=0;i<=this.számláló;i++) {
                if(this.órák[i].getKezdet()==ujora.getKezdet())
                    return false;
            
            
            }
            
            int kezdés=ujora.getKezdet();
            
            
                
                this.órák[számláló]=ujora;
                this.számláló++;
                
                return true;
               }    
            
               
            
    

}
