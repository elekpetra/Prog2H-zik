
package  iskola;

import java.util.Objects;

public class Ora {
    private int Tárgykód;
    private int Kezdet;
    private String név;

    public Ora(int Tárgykód, int Kezdet, String név) {
        this.Tárgykód = Tárgykód;
        this.Kezdet = Kezdet;
        this.név = név;
        
        if(this.Kezdet<8){
            this.Kezdet=8;
        }
        else if(this.Kezdet>19){
        this.Kezdet=19;
    }
        
    }

    public int getTárgykód() {
        return Tárgykód;
    }

    public void setTárgykód(int Tárgykód) {
        this.Tárgykód = Tárgykód;
    }

    public int getKezdet() {
        return Kezdet;
    }

    public void setKezdet(int Kezdet) {
        this.Kezdet = Kezdet;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    @Override
    public String toString() {
        return "Ora{" + "T\u00e1rgyk\u00f3d=" + Tárgykód + ", Kezdet=" + Kezdet + ", n\u00e9v=" + név + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.Tárgykód;
        hash = 79 * hash + this.Kezdet;
        hash = 79 * hash + Objects.hashCode(this.név);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ora other = (Ora) obj;
        if (this.Tárgykód != other.Tárgykód) {
            return false;
        }
        if (this.Kezdet != other.Kezdet) {
            return false;
        }
        if (!Objects.equals(this.név, other.név)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
