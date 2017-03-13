import java.util.Random;

/**
 * This class generates a random point with x and y values between 0 and 1.
 */
public class RandPoint {
    private double x,y,r;
    private Random gen = new Random();

    /**
     * Basic constructor for a RandPoint. Takes no arguments and makes a random
     *     point.
     */
    public RandPoint() {
        x = gen.nextDouble();
        y = gen.nextDouble();
        r = Math.sqrt(x * x + y * y);
    }

    /**
     * Gets the x coordinate of a RandPoint.
     * 
     * @return Double of the point's x coordinate.
     */
    public double getX() {
        return x;
    }

    /**
     * Gets the y coordinate of a RandPoint.
     * 
     * @return Double of the point's y coordinate
     */
    public double getY() {
        return y;
    }

    /**
     * Gets the RandPoint's distance from the origin (0,0).
     * 
     * @return Double of the point's distance from the origin.
     */
    public double getR() {
        return r;
    }
}