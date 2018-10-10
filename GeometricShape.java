
import java.util.Date;


public class GeometricShape {
    private String colour;
    private boolean filled;
    public Date dateCreated;

    public GeometricShape() {
        this("white",false);
    }

    public GeometricShape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
        this.dateCreated = new Date();
    
    
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricShape{" + "colour=" + colour + ", filled=" + filled + ", dateCreated=" + dateCreated + '}';
    }


}
