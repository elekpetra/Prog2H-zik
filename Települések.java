public class Települések implements Comparable <Települések> { 
     
    public int hőmérséklet;
    public String név;
   
    public Települések(String név, int hőmérséklet){
        this.név = név;
        this.hőmérséklet = hőmérséklet;
    }

    @Override
    public String toString(){
        return név + " (" + hőmérséklet + ")";
    }

    @Override
    public int compareTo(Települések t){
        int különbség = t.hőmérséklet - this.hőmérséklet;
        
        if (különbség != 0){
            return különbség;
        }
        

        return this.név.compareTo(t.név);
    }
}

