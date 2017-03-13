import java.util.Scanner;

/**
 * This Java class allows a user to approximate pi from randomly generated
 *     points.
 * @author Ben Templin
 * @version 1.0
 */
public class Pi {
    /**
     * Main method. When run, asks the user to input a number of trials and
     *     prints the resulting value of pi.
     * 
     * @param args String[] that takes in parameters, but these aren't used in
     *     the program.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many powers of 10 would you like to use?: ");
        int num = scan.nextInt();
        multiCalc(num);
    }

    /**
     * Calculates pi using random points.
     * @param num Integer for the number of points to generate.
     * @return Approximate value of pi as a double.
     */
    public static double makePi(int num) {
        int nIn = 0;
        RandPoint[] points = new RandPoint[num];
        for (int i = 0; i < num; i++) {
            points[i] = new RandPoint();
            if (points[i].getR() < 1) {
                nIn++;
            }
        }
        return (4*nIn) / ((double) num);
    }

    /**
     * Calculates the percent error of the calculation.
     * 
     * @param num The number that was calculated.
     * @return Decimal representation of the percent error.
     */
    public static double calcError(double num) {
        final double PI = 3.141592653589793238462643383279;
        return (num - PI) / PI;
    }

    /**
     * Calculates several approximations of pi to show the trend.
     * @param order The power of 10 to use in the number of trials.
     */
    public static void multiCalc(int order) {
        for (int i = 1; i <= order; i++) {
            int num = (int) Math.pow(10, i);
            double pi = 0;
            for (int j = 0; j < 5; j++) {
                pi += makePi(num);
            }
            pi /= 5.0;
            double error = calcError(pi);
            System.out.println("N = " + num);
            System.out.println("Pi: " + pi);
            System.out.println("Error: " + (100 * error) + "%");
            System.out.println();
        }
    }
}