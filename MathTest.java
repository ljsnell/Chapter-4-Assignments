import static java.lang.Math.sqrt;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.floor;
import static java.lang.Math.ceil;
import static java.lang.Math.round;
import static java.lang.Math.random;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class MathTest {
    public static void main(String[] args) {
        // The square root of 37
        System.out.println(sqrt(37));

        // The sine and cosine of 300
        int valueForCosAndSin = 300;
        System.out.println(cos(valueForCosAndSin));
        System.out.println(sin(valueForCosAndSin));

        // The value of the floor, ceiling, and round of 22.8
        double valueForRange = 22.8;
        System.out.println(floor(valueForRange));
        System.out.println(ceil(valueForRange));
        System.out.println(round(valueForRange));

        // The larger and the smaller of the character 'D' and the integer 71
        System.out.println(max('D', 71));
        System.out.println(min('D', 71));

        // A random number between 0 and 20.
        System.out.println(random() * 20);
    }
}
