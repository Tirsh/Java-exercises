import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 5;
        while(counter > 0) {
            System.out.println("Delimoe - Delitel:");
            double divisible = in.nextDouble();
            double divider = in.nextDouble();
            if (divider == 0){
                System.out.println("Деление на 0");
                counter --;
                continue;
            }
            System.out.printf("%.2f\n", divisible / divider);
            counter --;
        }

    }
}
