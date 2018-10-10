
public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(1.0,1.5,1.0);
        triangle.setColour("yellow");
        
        System.out.println("terület: "+triangle.getArea());
        System.out.println("kerület: "+triangle.getPerimeter());
        System.out.println("színe: "+triangle.getColour());
        System.out.println("kitöltve? : "+triangle.isFilled());

        
    }
}
