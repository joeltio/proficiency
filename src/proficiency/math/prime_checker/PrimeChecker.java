import java.lang.Math;

public class PrimeChecker {
    public static boolean primeChecker(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        } else {
            double lim = Math.ceil(Math.sqrt((double) n));
            for (int i=3; i<lim; i+=2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        System.out.println(primeChecker(i));
    }
}
