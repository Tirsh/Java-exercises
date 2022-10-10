package P_08;

public class Airplane {
    static void compareAirplanes(Airplane air1, Airplane air2){
        if(air1.length > air2.length) System.out.println("?????? ??????? ???????");
        if(air2.length > air1.length) System.out.println("?????? ??????? ???????");
    }
    private String producer;
    private  int year;
    private int length;
    private  int weight;
    private  int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public int getFuel() {
        return fuel;
    }
    public void fillUp(int fuel){
        this.fuel += fuel;
    }
    public void info(){
        System.out.printf("Марка: %s , Год: %d , Длинна: %d, Вес: %d, Остаток топлива: %d",
                this.producer, this.year, this.length, this.weight, this.fuel);
    }

    @Override
    public String toString() {
        return String.format("Марка: %s , Год: %d , Длинна: %d, Вес: %d, Остаток топлива: %d",
                this.producer, this.year, this.length, this.weight, this.fuel);
    }
}
