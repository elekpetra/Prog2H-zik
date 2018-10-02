
import java.util.Date;
import java.util.Objects;


public class Ital {
 
    protected String név;
    protected String kiszerelés;
    private static int ár=10;
    protected Date gyártásiDátum;
    public static int Euro=300;
    public Ital(String név, String kiszerelés) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.gyártásiDátum=new Date();
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public static int getÁr() {
        return ár;
    }
    
    public static int setÁr(){
        return ár;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }

    @Override
    public String toString() {
        return getNév()+","+getKiszerelés()+","+getÁr()+"Ft";
             
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Ital other = (Ital) obj;
        if (!Objects.equals(this.név, other.név)) {
            return false;
        }
        if (!Objects.equals(this.kiszerelés, other.kiszerelés)) {
            return false;
        }
        if (!Objects.equals(this.gyártásiDátum, other.gyártásiDátum)) {
            return false;
        }
        return true;
    }
    public void setÁr(int ár){
         Ital.ár = ár;
     }
    public double getAktuálisÁr(){
         return ár/Euro;
         
             }
    
    
   

    
 
}
