package P_06;

public class Car {
    String model;
    int year;
    String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info(){
        System.out.println("Это машина");
    }
    public int yearDifference(int year){
        return year - this.year;
    }
}
