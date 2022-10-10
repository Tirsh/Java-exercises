package P_08;

public class MainApp {
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 20000; i++) {
            s.append(" ").append(i);
        }
        Long end = System.currentTimeMillis();
        System.out.printf("StringBuilder %d\n", end-start);
        Long start1 = System.currentTimeMillis();
        String s1 = new String();
        for (int i = 0; i < 20000; i++) {
            s1 += " " + i;
        }
        Long end1 = System.currentTimeMillis();
        System.out.printf("String concatenation %d\n", end1-start1);
        Airplane airplane = new Airplane( "Boeing" , 2000 , 150 , 10000 );
        System.out.println (airplane);

    }
}
