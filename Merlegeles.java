
import java.util.Objects;


public class Merlegeles implements Comparable<Merlegeles>{
    
    public String cégnév;
    public String telephely;
    public int év;
    public int árbevétel;

    public Merlegeles(String cégnév, String telephely, int év, int árbevétel) {
        this.cégnév = cégnév;
        this.telephely = telephely;
        this.év = év;
        this.árbevétel = árbevétel;
    }

    public String getCégnév() {
        return cégnév;
    }

    public void setCégnév(String cégnév) {
        this.cégnév = cégnév;
    }

    public String getTelephely() {
        return telephely;
    }

    public void setTelephely(String telephely) {
        this.telephely = telephely;
    }

    public int getÉv() {
        return év;
    }

    public void setÉv(int év) {
        this.év = év;
    }

    public int getÁrbevétel() {
        return árbevétel;
    }

    public void setÁrbevétel(int árbevétel) {
        this.árbevétel = árbevétel;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Merlegeles)) {
           
            return false;
        
        }
        
         Merlegeles other = (Merlegeles) obj;
        
                
        return this.cégnév.equals(other.getCégnév()) && this.telephely.equals(other.getTelephely())
                 ;
    }
    
    

    @Override
    public int compareTo(Merlegeles t) {
        if(this.cégnév.equals(t.getCégnév())){
            if(this.telephely.equals(t.getTelephely())){
                if(this.árbevétel==t.getÁrbevétel()){
                    return Integer.compare(this.év, t.getÉv());
                }
                
                else{
                    return Integer.compare(this.árbevétel, t.getÁrbevétel());
                }
            
            }
            else{
                return this.telephely.compareTo(t.getTelephely());
                        }
        }
        else{
            return this.cégnév.compareTo(t.getCégnév());
        }
    }

    @Override
    public String toString() {
        return  cégnév + " (" + telephely + "): " + árbevétel;
    }
    
    
    
}
