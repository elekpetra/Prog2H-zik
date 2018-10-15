public class Hullámvasút implements Comparable <Hullámvasút> {
    
    private String név;
    private String hely;
    private int magasság;
    private int várakozásiidő;

    public Hullámvasút(String név, String hely, int magasság, int várakozásiidő) {
        this.név=név;
        this.hely=hely;
        this.magasság=magasság;
        this.várakozásiidő=várakozásiidő;
    }

    public String getNév() {
        return név;
    }

    public String getHely() {
        return hely;
    }

    public int getMagasság() {
        return magasság;
    }

    public int getVárakozásiidő() {
        return várakozásiidő;
    }

    public void setNév(String nev) {
        this.név=név;
    }

    public void setHely(String hely) {
        this.hely=hely;
    }

    public void setMagasság(int magasság) {
        this.magasság=magasság;
    }

    public void setVárakozásiidő(int várakozásiidő) {
        this.várakozásiidő=várakozásiidő;
    }

    @Override
    public String toString() {
        return név + " (" + hely + "): " + várakozásiidő;
    }
    
    

    @Override
    public int compareTo(Hullámvasút h){
        int különbség=this.várakozásiidő-h.várakozásiidő;
        
        if(különbség!=0){
            return különbség;
        }
        
        különbség=h.magasság-this.magasság;
        
        if(különbség!=0){
            return különbség;
        }
        
        System.out.println("\n");
        
        return név.compareTo(h.név);
    }
  

} 
    
    
    
    

