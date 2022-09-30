package P_07;

public class MainApp {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing", 2020, 320, 130000);
        Airplane airplane2 = new Airplane("Airbus", 2018, 370, 110000);
        Airplane.compareAirplanes(airplane1, airplane2);
        Player[] players = new Player[8];
        for(int i = 0; i < 8; i++){
            players[i] = new Player();
        }
        Player.info();
        for (int i = 0; i < 95; i++) {
            for (int j = 0; j < 8; j++) {
                players[j].run();
            }
        }
        Player.info();
    }
}
