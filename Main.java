
public class Main {
    public static void main(String[] args) {
        Pont p1=new Pont(1,3);
        Pont p2=new Pont(4,7);
        
        p1.setY(p1.getY()+5);
        p2.setX(p2.getX()-3.4);
        
        System.out.println("első pont: "+p1.getX()+","+p1.getY());
        System.out.println("második pont: "+p2.getX()+","+p2.getY());
    }
}
