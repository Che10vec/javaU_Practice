//Exercise 1

public class GravityCalculator {
    static final double GRAVITY = -9.81; // Earth's gravity in m / s ^ 2
    static int fallingTime;
    static double initialPosition = 0;
    static double initialVelocity = 0;

    public static double finalPosition(int fallingTime){
        return (Math.pow(fallingTime, 2) * GRAVITY * (0.5) + initialVelocity * fallingTime + initialPosition);
    }
}
