

public class Main {
    public static int Osztás(int a, int b){
        int hanyados=0;
        do{
            hanyados=hanyados+1;
            a=a-b;
        }while(a>=b);
        return hanyados;
    }
    public static void main(String[] args) {
        
        
        System.out.println(Osztás(122,32));
    }
}
