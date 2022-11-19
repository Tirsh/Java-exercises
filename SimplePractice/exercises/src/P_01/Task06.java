import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("K = ");
        int k = in.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", i, k, i*k);
        }
    }
}