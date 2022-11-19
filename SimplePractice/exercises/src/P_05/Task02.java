public class Task02 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("BMW", 2019, "black");
        System.out.printf("%s - %d - %s", motorbike.getModel(), motorbike.getYear(), motorbike.getColor());
    }
}
