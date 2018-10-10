
import java.util.Comparator;


public class Teherautó extends Autó {
        
    private int maxSzállíthatóTeher;
    

    public Teherautó( String Rendszám, int maxSzállíthatóTeher, int MotorTeljesítmény) {
        super(Rendszám, MotorTeljesítmény);
        this.maxSzállíthatóTeher = maxSzállíthatóTeher;
    }

    public int getMaxSzállíthatóTeher() {
        return maxSzállíthatóTeher;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Teherautó other = (Teherautó) obj;
        if (this.maxSzállíthatóTeher != other.maxSzállíthatóTeher) {
            return false;
        }
        return true;
    }
    
   public class MaximálisSzállíthatóTeher implements Comparator<Teherautó>{

    @Override
    public int compare(Teherautó t1, Teherautó t2) {
        int max1= t1.getMaxSzállíthatóTeher();
        int max2=t2.getMaxSzállíthatóTeher();
        
        if(max1<max2){
            return 1;
        }
        if(max1==max2){
            return 0;
        }
      
            return -1;
            
        }
 
    }
    
}
