import java.lang.Math;

public class Herons {
    public static double semiperimeter(int a, int b, int c) {
        return (double) (a + b + c)/2;
    }

    public static double areaOfTriangle(int a, int b, int c) {
        double s = semiperimeter(a, b, c);
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        double area = areaOfTriangle(a, b, c);
        System.out.println(area);
    }
}
