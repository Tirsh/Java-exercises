package P_06;

public class MainApp {
    public static void main(String[] args) {
        Motorbike moto = new Motorbike("BMW", 2015, "black");
        moto.info();
        System.out.println(moto.yearDifference(2020));
        Airplane airplane = new Airplane("Boing",2015, 350, 250000);
        airplane.fillUp(1000);
        airplane.fillUp(500);
        airplane.info();

    }
}
