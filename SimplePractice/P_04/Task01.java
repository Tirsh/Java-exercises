import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task01 {
    private static int inputNumber(String msg){
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextInt();
    }
    private static String printArray(int[] arr){
        String str = "[ ";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + " ";
        }
        return str + "]";
    }
    public static void main(String[] args) {
        int numbers = inputNumber("Input N: ");
        int[] numArray = new int[numbers];
        Random rnd = new Random();
        for (int i = 0; i < numbers; i++) {
            numArray[i] = rnd.nextInt(0,10);
        }
        System.out.println(printArray(numArray));
        System.out.println("Length: " + numbers);
        System.out.println("More then 8: " + Arrays.stream(numArray).filter(a -> a > 8).count());
        System.out.println("Equals 1: " + Arrays.stream(numArray).filter(a -> a == 1).count());
        System.out.println("Even elements: " + printArray(Arrays.stream(numArray).filter(a -> a % 2 == 0).toArray()));
        System.out.println("Odd elements: " + printArray(Arrays.stream(numArray).filter(a -> a % 2 == 1).toArray()));
        System.out.println("Sum: " + Arrays.stream(numArray).sum());
    }
}
