
public class Circle2D {
    //Data fields
    private double x, y;
    private double radius;

    /* No arg constructor with specified values */
    public Circle2D(){
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    /* Constructor with specific values */
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /* Setter for x */
    public void setX(double x) {
        this.x = x;
    }

    /* Setter for y */
    public void setY(double y) {
        this.y = y;
    }

    /* Getter for x */
    public double getX(double x){
        return x;
    }

    /* Getter for y */
    public double getY(double y){
        return y;
    }

    /* Setter for Radius */
    public void setRadius(double radius){
        this.radius = radius;
    }

    /* Getter for radius */
    public double getRadius(double radius){
        return radius;
    }

    /* Returns the area of the circle */
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    /* Return perimeter of the circle */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /* Return true if the specified is inside the circle */
    public boolean contains(double x, double y) {
        if (Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius){
            return true;
        }
        else {
            return false;
        }
    }

    /* Return true if the specified circle is inside this circle */
    public boolean contains(Circle2D circle) {
        if (Math.sqrt(Math.pow(x - circle.x, 2) + Math.pow(y - circle.y, 2)) < radius){
            return true;
        }
        else {
            return false;
        }
    }

    /* Returns true if the specified circle overlaps this circle */
    public boolean overlaps(Circle2D circle) {
        if (Math.sqrt(Math.pow(x - circle.x, 2) + Math.pow(y - circle.y, 2)) > radius) {
            return true;
        } else {
            return false;
        }
    }
}
