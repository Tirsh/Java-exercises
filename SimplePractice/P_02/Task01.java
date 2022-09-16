import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many floors in the house: ");
        int floors = in.nextInt();
        if(floors > 0){
            if(floors < 5) {
                System.out.println("Малоэтажный дом");
                return;
            }
            if(floors < 9){
                System.out.println("Среднеэтажный дом");
                return;
            }
            System.out.println("Многоэтажный дом");
        }else System.out.println("Ошибка ввода");
    }
}
