
public class KvalOszthato {
    static void oszthato(int k, int n1, int n2){
        for(int i=n1; i<n2;i++){
            if(i%k==0){
                System.out.println(i);
            }
        }
    }

    
    
    
    public static void  main(String[] args) {
        
        oszthato(2,12,39);
    }

  
}
