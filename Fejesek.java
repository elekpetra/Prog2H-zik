
import java.util.Scanner;

public class Fejesek {

    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        String[] sor=sc.nextLine().split(";");
        
        int db=Integer.parseInt(sor[0]);
        
        Tanuló[] rendezetlen=new Tanuló[db];
        Tanuló[] rendezett=new Tanuló[rendezetlen.length];
        rendezetlen[0]=new Tanuló(sor[1]);
        rendezett[0]=rendezetlen[0];
        String keresendő=sor[2];
       
        for (int i=1; i<rendezetlen.length; ++i){
            sor=sc.nextLine().split(";");
            rendezetlen[i]=new Tanuló(sor[0], sor[1]);
        }
        
        String keresett=rendezett[0].név;
        int j=0;
        int piros=0;
        int kék=0;
        int index=-1;
        boolean talált=true;
        
        while(talált){
            talált=false;
            
            for (int i=0; i<rendezetlen.length; ++i){
                
                if (rendezetlen[i].előtte.equals(keresett)){
                    talált=true;
                    ++j;
                    
                    rendezett[j]=rendezetlen[i];
                    keresett=rendezetlen[i].név;
                    
                    if(rendezett[j].név.equals(keresendő)){
                        index=j;
                    }
                    
                    break;
                }
            }
        }
        
        for (int i=(index-1); i>=0; --i){
            if(i%2==0){
                ++piros;
            }  
            
            else{
                ++kék;
            }   
        }
        
        System.out.println("\n");
        System.out.println(piros + " " + kék);
    }
}
