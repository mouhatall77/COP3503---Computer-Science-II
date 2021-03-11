/**
 * Your program should validate user input for the wire gauge and wire length (i.e. prevent computation of zero
 * or negative wire gauge or length) and displays the precision of the output resistance to three decimal points.
 * Here is a sample output with no description message:
 */

import java.util.*;

public class WireResistance {
    //Takes the wire gauge and returns the corresponding wire diameter
    double computeDiameter(int wireGauge){
        return 0.127 * Math.pow(92, ((36 - (double)wireGauge) / 39) );
    }

    //Takes the length and gauge of a piece of copper wire and returns the resistance of that wire
    double computeCopperResistance(double length, int wireGauge){
        return (4 * 1.678e-8 * length) / (Math.PI * computeDiameter(wireGauge));
    }

    //Takes...
    double computeAlumResistance(double length, int wireGauge){
        return (4 * 2.82e-8 * length) / (Math.PI * computeDiameter(wireGauge));
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        System.out.println("Enter the wire gauge: ");
        int wireGauge = input.nextInt();
        System.out.println("Enter the wire length in inches: ");
        int wireLength = input.nextInt();

        validate(wireGauge, wireLength);
        WireResistance W = new WireResistance();

        double result1, result2;
        result1 = W.computeCopperResistance(wireLength, wireGauge);
        result2 = W.computeAlumResistance(wireLength, wireGauge);

        System.out.println("The resistance of an " + wireLength + " inch piece of " + wireGauge + " gauge copper wire is " + result1 + " Ohms");
        System.out.println("The resistance of an " + wireLength + " inch piece of " + wireGauge + " gauge aluminium wire is " + result2 + " Ohms");



    }

    public static void validate(int wireGauge, int wireLength)
        throws IllegalArgumentException{
        if(!(wireGauge >0 && wireLength >0)){
            throw new IllegalArgumentException("Numbers can't be negative!");
        }
    }
}
