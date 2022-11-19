import java.util.Arrays;
import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        int[] array = Arrays.stream(new int[10]).map(a -> new Random().nextInt(0,10000)).toArray();
        System.out.println(Task01.printArray(array));
        int sum, index = 0, max = 0;
        for (int i = 0; i < array.length-2; i++) {
            sum = array[i]+array[i+1]+array[i+2];
            if(max < array[i]+array[i+1]+array[i+2]){
                max = sum;
                index = i;
            }
        }
        System.out.printf("%d  -   %d", max, index);
    }
}
