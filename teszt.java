public class teszt {

    
    public static void main(String[] args) {
       int a=0;
       int t[]=new int[]{1,2,3,4}; //tomb helyben definiálálsa
       try{
       for(int i=0; i<5; i++){
           a=3/t[i];
        }
           System.out.println("try vége"); //nem hajtódik végre
        }
       catch(ArithmeticException e){
            a=1;
            e.printStackTrace();
            }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("uppsz túlindexelted a tömböt");
       }
       catch(Exception e){
           
       }
       finally{   //nem kötelező,mindeképp lefut, ha dobódik kivétel, ha nem, fájbezárás pl
           System.out.println("mindeképp lefut, ha dobódik kivétel, ha nem");
       }
       
       System.out.println("a program vége "+a);
}
}


//első kivétel után nem fut tovább