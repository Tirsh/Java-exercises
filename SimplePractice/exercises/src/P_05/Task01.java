public class Task01 {

    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Tesla");
        car.setYear(2020);
        car.setColor("red");
        System.out.printf("%s - %d - %s", car.getModel(), car.getYear(), car.getColor());
    }
}
