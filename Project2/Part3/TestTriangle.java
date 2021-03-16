/**
 * Design a class named Triangle.java that extends GeometricObject.java. The Triangle.java class
 * should contain:
 * • Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of
 * the triangle.
 * • A no-arg constructor that creates a default triangle.
 * • A constructor that creates a triangle with the specified side1, side2, and side3.
 * • The accessor methods (set and get methods) for all three data fields.
 * • A method named getArea() that returns the area of this triangle.
 * • A method named getPerimeter() that returns the perimeter of this triangle.
 * • A method named toString() that returns a string description for the triangle.
 */

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 1.5, 1);
        triangle.setColor("yellow");
        triangle.setFilled(true);
        System.out.println(triangle);
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is "
                + triangle.getPerimeter());
        System.out.println(triangle);
    }
}