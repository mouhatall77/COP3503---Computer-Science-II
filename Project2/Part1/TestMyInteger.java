  
/*
    Design a class named MyInteger. The class contains:
     An int data field named value that stores the int value represented by this
     object.
     A constructor that creates a MyInteger object for the specified int value.
     A getter method that returns the int value.
     The methods isEven(), isOdd(), and isPrime() that return true if the
     value in this object is even, odd, or prime, respectively.
     The static methods isEven(int), isOdd(int), and isPrime(int) that
     return true if the specified value is even, odd, or prime, respectively.
     The static methods isEven(MyInteger), isOdd(MyInteger), and
     isPrime(MyInteger) that return true if the specified value is even, odd,
     or prime, respectively.
     The methods equals(int) and equals(MyInteger) that return true if
     the value in this object is equal to the specified value.
     A static method parseInt(char[]) that converts an array of numeric
     characters to an int value.
     A static method parseInt(String) that converts a string into an int
     value.
*/

import java.util.*;

public class TestMyInteger {
    public static void main(String[] args){
        MyInteger n1 = new MyInteger(5);
        MyInteger n2 = new MyInteger(24);


        System.out.println(n1.getValue() + " is even? " + n1.isEven());
        System.out.println(n1.getValue() + " is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));
        System.out.println("15 is even? " + MyInteger.isEven(15));

        System.out.println(n2.getValue() + " is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println(n1.getValue() + " is equal to n2? " + n1.equals(n2));
        System.out.println(n1.getValue() + " is equal to 5? " + n1.equals(5));

        System.out.println(n2.getValue() + " is even? " + MyInteger.isEven(n2.getValue()));
        System.out.println(n2.getValue() + " is odd? " + MyInteger.isOdd(n2.getValue()));
        System.out.println(n2.getValue() + " is prime? " + MyInteger.isPrime(n2.getValue()));
    }
}
