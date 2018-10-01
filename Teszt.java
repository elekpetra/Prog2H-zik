
public class Teszt {
    public static void main(String[] args) {
        RegularPolygon p1=new RegularPolygon();
        RegularPolygon p2=new RegularPolygon(6,4);
        RegularPolygon p3=new RegularPolygon(10,4,5.6,7.8);
        
        System.out.println("P1 sokszög kerülete: "+p1.getPerimeter()+"\nP1 sokszög területe: "+p1.getArea());
        System.out.println("P2 sokszög kerülete: "+p2.getPerimeter()+"\nP2 sokszög területe: "+p2.getArea());
        System.out.println("P3 sokszög kerülete: "+p3.getPerimeter()+"\nP3 sokszög területe: "+p3.getArea());

    }
}
