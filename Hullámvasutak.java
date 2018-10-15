import java.util.Arrays;
import java.util.Scanner;

public class Hullámvasutak{
    
    public static void main(String[] args) {
    
        Scanner sc=new Scanner (System.in);
        
        int db = Integer.parseInt(sc.nextLine());
        
        Hullámvasút[] tömb = new Hullámvasút[db];
        
        for (int i=0; i<tömb.length; ++i){
            
            Scanner sor=new Scanner(sc.nextLine()).useDelimiter(";");
            String név=sor.next();
            String hely=sor.next();
            
            int magasság=sor.nextInt();
            int várakozásiidő=sor.nextInt();
            
           tömb[i]=new Hullámvasút(név, hely, magasság, várakozásiidő);
        }
        
        Arrays.sort(tömb);
        
        for(Hullámvasút hullámvasút:tömb){
            
            System.out.println(hullámvasút);
    }
  }  
}

    
    
    
    
    

