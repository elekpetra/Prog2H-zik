
import java.util.Scanner;

public class Szavak {
    
    public static AngolMagyarSzótár szavak[];
    
    public static void rendez(AngolMagyarSzótár [] sz){
        
        for(int i=0; i<sz.length-1; ++i){
            
            for(int j=i+1; j<sz.length; ++j){
                
                if(sz[i].getAngol().compareTo(sz[j].getAngol())==0){
                    
                    if(sz[i].getMagyar().compareTo(sz[j].getMagyar())>0){
                        
                        AngolMagyarSzótár tmp=sz[i];
                        sz[i]=sz[j];
                        sz[j]=tmp;
                    }
                }
                
                else if(sz[i].getAngol().compareTo(sz[j].getAngol())>0){
                    
                    AngolMagyarSzótár tmp=sz[i];
                    sz[i]=sz[j];
                    sz[j]=tmp;
                }
            }
            
        }
        
    }
    
    
    
    public static void kiir(AngolMagyarSzótár [] sz){
        for(int i=0; i<sz.length; ++i) {
            System.out.println(sz[i]);
        }
       
    }
    
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=Integer.parseInt(sc.nextLine());
        
        szavak=new AngolMagyarSzótár[n];
        
        for(int i=0; i<n; ++i){
            String sor=sc.nextLine();
            String st[]=sor.split(":");
            
            szavak[i]=new AngolMagyarSzótár(st[0],st[1]);
            
        }
        
        System.out.println("\n");
        rendez(szavak);
        kiir(szavak);
    }
    
}
