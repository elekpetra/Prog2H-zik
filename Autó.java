
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Autó {
    private String Rendszám;
    private int MotorTeljesítmény;
    private Date GyártásDátuma;

    public Autó(String Rendszám, int MotorTeljesítmény) {
        this.Rendszám = Rendszám;
        this.MotorTeljesítmény = MotorTeljesítmény;
        this.GyártásDátuma=new Date();
    }
    
    public String getRendszám() {
        return Rendszám;
    }

    public void setRendszám(String Rendszám) {
        this.Rendszám = Rendszám;
    }

    public int getMotorTeljesítmény() {
        return MotorTeljesítmény;
    }

    public Date getGyártásiDátuma() {
        return GyártásDátuma;
    }

    @Override
    public String toString() {
        return "Aut\u00f3{" + "rendsz\u00e1m=" + Rendszám + ", motorTeljes\u00edtm\u00e9ny=" + MotorTeljesítmény + ", gy\u00e1rt\u00e1sD\u00e1tuma=" + GyártásDátuma + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Autó other = (Autó) obj;
        if (!Objects.equals(this.Rendszám, other.Rendszám)) {
            return false;
        }
        if (this.MotorTeljesítmény != other.MotorTeljesítmény) {
            return false;
        }
        if (!Objects.equals(this.GyártásDátuma, other.GyártásDátuma)) {
            return false;
        }
        return true;
    }

    public class MotorTeljesítmény implements Comparator<Autó> {

    @Override
    public int compare(Autó a1, Autó a2) {
        int Max1 = a1.getMotorTeljesítmény();
        int Max2 = a2.getMotorTeljesítmény();
        if(Max1 < Max2){
            return 1;
        }
        else if(Max1 == Max2){
            return 0;
        }
        
            return -1;
        }
    }
    
}


    
    
    

