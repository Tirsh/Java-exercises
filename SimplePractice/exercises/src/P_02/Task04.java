import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("X = ");
        double x = in.nextDouble();
        double y = 0;
        if(x >= 5) y = (Math.pow(x, 2) - 10) / (x + 7);
        if(x < 5 && x > -3) y = (x + 3) * (Math.pow(x, 2) - 2);
        if(x <= -3) y = 420;
        System.out.printf("y = %.2f", y);
    }
}

