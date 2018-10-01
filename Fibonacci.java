public class Fibonacci {

    public Fibonacci(int n) {
        int a=0;
        int b=1;
        int c = 0;
        
        if(n==1){
            System.out.println(a);
        }
        
        else {
            
            if(n==2)
                System.out.println(a+" "+b);
            
            
            else
                c=a+b;
                System.out.println(a+"\n"+b+"\n"+c);
                
                int k=3;
                while(k<n){
                    a=b;
                    b=c;
                    c=a+b;
                    
                    System.out.println(c);
                    k=k+1;
                }
            
        }
    }
    
    
    public static void main(String[] args) {
        Fibonacci n=new Fibonacci(9);
        System.out.println(n);
}
}

