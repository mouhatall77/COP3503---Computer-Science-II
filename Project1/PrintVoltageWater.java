/*
 *Create a new Java class PrintVoltageWater that prints a table showing the meter voltage corresponding to
 *water temperatures varying from 0 &deg;C to 100 &deg;C in increments of 10 degrees.
 */

public class PrintVoltageWater {
    public static void main(String[] args){


        System.out.printf("%5s %10s\n", "T", "Vm");
        System.out.println("-------     -------");

        int T = 0;
        for(int i=0; i<=10; i++){

            double Vm = findVoltmeter(T);
            System.out.printf("%5d %10.2f\n", T, Vm);
            T += 10;
        }
    }

    //Calculate the Resistor and Volmeter
    public static double findVoltmeter(int temperature){
        double r = 50 + (0.5 * temperature);
        double v = ((r)/(75 + r)) * 20;

        return v;
    }

}
