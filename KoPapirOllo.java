import java.util.Random;
import java.util.Scanner;


public class KoPapirOllo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        
       while(true){
          
         String x;
        x = sc.nextLine();
        if(x.equals("vege")){
            break;
        }
        if(!x.equals("ko") && !x.equals("papir") && !x.equals("ollo")){
            continue;
        }
        Random random = new Random();
        int gepValaszt=random.nextInt(3);
           System.out.println("Gép ezt adta:" );
        if (gepValaszt==0){
            System.out.println("Kő");
         }
        if (gepValaszt==1){
            System.out.println("Papír");
         }
        if (gepValaszt==2){
            System.out.println("olló");
         }
        
        if(x.equals("ko") && gepValaszt==0 ){
            System.out.println("Döntetlen");
        }
        else if(x.equals("ko") && gepValaszt==1){
            System.out.println("Gép nyert");
        }
        else if(x.equals("ko") && gepValaszt==2){
            System.out.println("Ön nyert");
        }
       }
        
        
        
    }
}
