package P_06;

public class Airplane {
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
        System.out.printf("Изготовитель: %s , год выпуска: %d , длина: %d, вес: %d, количество топлива в баке: %d",
                this.producer, this.year, this.length, this.weight, this.fuel);
    }
}
