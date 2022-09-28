package P_06;

public class Motorbike {
    String model;
    int year;
    String color;

    public Motorbike(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
    public void info(){
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int year){
        return year - this.year;
    }
}
