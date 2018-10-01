public class Rectangle {
    public double width;
    public double height;

    public Rectangle() {
        this.width=1.0;
        this.height=1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
    public double getArea(){
        return this.height*this.width;
    }
    
    public double getPrimeter(){
        return 2*(this.height+this.width);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
