import java.io.FileNotFoundException;

import java.io.FileReader;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        int[] arr = new int[] {6, 2, 6, 1, 7};
        Polynomial polynomial1 = new Polynomial(5, -2, 10);
        Polynomial polynomial2 = new Polynomial(arr);
//        System.out.println(polynomial1);
//        System.out.println(polynomial1.makeSum(polynomial2));
        try {
            Polynomial fromFile = new Polynomial("newFile.txt");
            System.out.println(fromFile);
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        };
    }
}
