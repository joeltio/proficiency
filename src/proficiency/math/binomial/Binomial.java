import java.util.ArrayList;

public class Binomial {
    public static long factorial(int n) {
        long x = 1;
        for (int i=1; i<=n; i++) {
            x *= i;
        }
        return x;
    }

    public static long choose(int n, int k) {
        return factorial(n)/(factorial(k) * factorial(n-k));
    }

    public static void main (String[] args) {
        int n = Integer.parseInt(args[0]);
        
        String values = "";
        for (int k=0; k<=n; k++) {
            long coefficient = choose(n, k);
            int aExponent = n-k;
            int bExponent = k;

            values += String.format("%da^%db^%d",
                    coefficient, aExponent, bExponent);
            values += " + ";
        }

        values = values.substring(0, values.length()-3);
        System.out.println(values);
    }
}
