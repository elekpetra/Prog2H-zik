
public class Circle extends GeometricShape{

    public Circle(String colour, boolean filled) {
        super(colour, filled);
    }
    
    private double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    

    public Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
       return Math.pow(radius,2)*Math.PI;
    }

    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }
    
    public double getDiameter(){
        return 2* this.radius;
    }
}
