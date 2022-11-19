public class Task04 {
    public static void main(String[] args) {
        int year = 1980, step = 4, finish = 2020;
        while (year <= finish){
            System.out.println("Олимпиада " + year + " года");
            year += step;
        }
    }
}
