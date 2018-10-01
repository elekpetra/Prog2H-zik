
public class Faktoriális {
    
  static int faktorialis(int n){    
  if (n == 0) {   
    return 1;
  }  
  else {
    return(n * faktorialis(n-1));    
   }
  }
 
 public static void main(String args[]){  
  int fakt;  
  int szam=6;    
  fakt = faktorialis(szam);   
  System.out.println(szam+" faktoriálisa: "+fakt);    
 }  
} 

