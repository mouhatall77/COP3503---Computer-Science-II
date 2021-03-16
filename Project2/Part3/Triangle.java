public class Triangle extends GeometricObject {
    //Data fields
    private double side1, side2, side3;

    //No args constructor
    public Triangle(){
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    //Constructor with specified param
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(double side1){
        this.side1 = side1;
    }

    public double getSide1(){
        return this.side1;
    }

    public void setSide2(double side2){
        this.side2 = side2;
    }

    public double getSide2(){
        return this.side2;
    }

    public void setSide3(double side3){
        this.side3 = side3;
    }

    public double getSide3(){
        return this.side3;
    }

    /**
     * calculate the area of a triangle using its 3 sides
     * @return
     */
    public double getArea(){
        double p = (side1+side2+side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    /**
     * Calculate the perimeter of a triangle using its 3 sides
     * @return
     */
    public double getPerimeter(){
        return side1+side2+side3;
    }

    /**
     *
     * @return a string representation of this object
     */
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
