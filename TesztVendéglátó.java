

public class TesztVendéglátó {
    public static Kocsma[] adottItaltKínálóKocsmák(String ital, VendéglátóipariEgység[] t){
        int count=0;
        
        for(int i=0; i<t.length; i++){
            if(t[i] instanceof Kocsma){
                Kocsma k=(Kocsma)t[i];
                
                for(int j=0; j<k.getSörlap().length; j++){
                    if(k.getSörlap()[j].equals(ital)){
                        count++;
                    }
                }
            }
        }

       Kocsma[] kocsma= new Kocsma[count];
       
       int n=0;
        for(int i=0; i<t.length; i++){
            if(t[i] instanceof Kocsma){
                Kocsma k=(Kocsma)t[i];
                
                for(int j=0; j<k.getSörlap().length; j++){
                    if(k.getSörlap()[j].equals(ital)){
                        kocsma[n]=k;
                        n++;
                    }
                }
            }
        }
        
        return kocsma;
        
    }
        
    
   public static void main(String[] args) {
       
        VendéglátóipariEgység [] t= new VendéglátóipariEgység[10];
       
            t[1]=new Étterem("Csokonai", 150, new String[]{"Tyúkhúsleves", "Bécsi szelet","Somlói galuska"}, false);
            t[2]=new Étterem("Barabás", 140, new String[]{"Szilvaleves", "Bécsi szelet","Sajttorta"}, false);     
            t[3]=new Étterem("Pálma", 120, new String[]{"Tyúkhúsleves", "Töltött káposzta","Tiramisu"}, false);    
            t[4]=new Étterem("Viktória", 100, new String[]{"Szilvaleves", "Milánói makaróni","Somlói galuska"}, false);
            t[5]=new Étterem("Belga", 110, new String[]{"Gombakrémleves", "Milánói makaróni","Tiramisu"}, false);
        
            t[6]=new Kocsma("Ibolya", 130, new String[]{"Sör", "Bor", "Pálinka"},true);
            t[7]=new Kocsma("Füredi", 90, new String[]{"Sör", "Rum", "Vodka"},true);
            t[8]=new Kocsma("Nyuszi", 60, new String[]{"Whisky", "Bor", "Vodka"},true);
            t[9]=new Kocsma("Pikoló", 70, new String[]{"Tequila", "Rum", "Gin"},true);
            t[10]=new Kocsma("Trófea", 80, new String[]{"Whisky", "Tequila", "Pálinka"},true);    
   
   Kocsma[] kocsm= adottItaltKínálóKocsmák("Bor", t);
      for(Kocsma k:kocsm){
          System.out.println(k);
      }
        }
         
      
      
      
    } 
       
  
