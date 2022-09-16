import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два  числа: ");
        System.out.print("А: ");
        int a = in.nextInt();
        System.out.print("В: ");
        int b = in.nextInt();
        if(a >= b){
            System.out.println("Некорректный ввод");
            return;
        }
        while(a <= b) {
            if (a % 5 == 0 && a % 10 != 0) System.out.print(a + " ");
            a++;
        }
    }
}
