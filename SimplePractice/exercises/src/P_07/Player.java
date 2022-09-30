package P_07;

import java.util.Random;

public class Player {
    final int MAX_STAMINA = 100;
    final int MIN_STAMINA = 0;
    private int stamina;
    private boolean onField = false;
    static int countPlayer;

    public Player() {
        this.stamina = new Random().nextInt(90, MAX_STAMINA);
        if(countPlayer < 6){
            countPlayer += 1;
            this.onField = true;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run(){
        if(this.stamina != MIN_STAMINA)
            this.stamina -= 1;
        else {
            System.out.println("Игрок устал, ему нужен отдых");
            if(this.onField){
                this.onField = false;
                System.out.println("Игрок уходит с поля!");
                countPlayer -= 1;
            }
        }
    }
    public static void info(){
        if(countPlayer < 6) System.out.printf("Команды неполные. На поле еще есть %d свободных мест\n", 6 - countPlayer);
        else System.out.println("На поле нет свободных мест");
    }
}
