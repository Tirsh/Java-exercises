import java.util.Arrays;
import java.util.Random;

public class Task02 {

    public static void main(String[] args) {
        int[] array = Arrays.stream(new int[100]).map(a -> new Random().nextInt(0,10000)).toArray();
        System.out.println(Task01.printArray(array));
        int max = array[0], min = array[0], count = 0;
        long sum = 0;
        for (int element:array){
            max = Math.max(element, max);
            min = Math.min(element, min);
            if(element % 10 == 0){
                count++;
                sum += element;
            }
        }
        System.out.printf("%d %d %d %d", max, min, count, sum);
    }
}
