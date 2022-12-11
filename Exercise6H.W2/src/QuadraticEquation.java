import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        double x1 = 0;
        double x2 = 0;
        System.out.println(" Please enter 3 parameter ");
        System.out.print(" paraA :");
        a = scanner.nextInt();
        System.out.print(" paraB :");
        b = scanner.nextInt();
        System.out.print(" paraC :");
        c = scanner.nextInt();
       // System.out.println(a);
       // System.out.println(b);
       // System.out.println(c);
       System.out.printf(" %dx^2 +%dx + %d \n", a, b, c );
        double d = Math.sqrt(b * b - 4 * a * c);
        //System.out.print(d);
        float res = 0;
        if (d == 0)
        {
            x1 = x2 = (-b) / 2 * a;
            System.out.printf(" x1 = x2 = %f", x1);
        }
        else if (d > 0)
        {
            x1 = (-b + d) / 2 * a;
            x2 = (-b - d) / 2 * a;
            System.out.printf(" x1 = %f , x2 = %f", x1, x2);
        }
        else
        {
            System.out.print(" The equation has no solutions ");
        }

    }
}