public class TesztKatona {
    public static  Katona megkuzd(Katona k1, Katona k2){
        Katona nyer=new Katona();
        if(k1.getTamadoero()>k2.getVedoero()){
            nyer=k1;
        }
        else if(k2.getTamadoero()>k1.getVedoero()){
            nyer=k2;
        }
        else{
            nyer=k1;
        }
        return nyer;
    }
    
    
    public static void main(String[] args) {
    Nyilas k1=new Nyilas(23,48,55);
    Nyilas k2=new Nyilas(63,47,22);
    Landzsas k3=new Landzsas(86,45);
        
        
        System.out.println("Csatázik: ");
        System.out.println(k1);
        System.out.println(k2);
        Katona nyertes=megkuzd(k1,k2);
        System.out.println("Nyertes: "+ nyertes);
        System.out.println("\n");
        
        System.out.println("Csatázik: ");
        System.out.println(nyertes);
        System.out.println(k3);
        Katona nyer=megkuzd(nyertes,k3);
        System.out.println("Életben maradt: "+ nyer);
            
}
    
}
