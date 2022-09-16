import java.util.Scanner;

public class Task02 {
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
        for(int i = a; i < b; i++)
            if(i % 5 == 0 && i % 10 != 0) System.out.print(i + " ");
    }
}
