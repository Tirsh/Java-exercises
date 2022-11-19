import java.io.*;
import java.util.*;

public class Polynomial {
    private int[] polinomElements;
    private int rang;
    private Random random;

    public Polynomial(int rang) {
        this.rang = rang;
        random = new Random();
        polinomElements = new int[rang+1];
        for (int i = 0; i <= rang; i ++) polinomElements[i] = random.nextInt(-100,100);
    }
    public Polynomial(int rang, int bound) {
        this.rang = rang;
        random = new Random();
        polinomElements = new int[rang+1];
        for (int i = 0; i <= rang; i ++) polinomElements[i] = random.nextInt(bound);
    }
    public Polynomial(int rang, int origin, int bound) {
        this.rang = rang;
        random = new Random();
        polinomElements = new int[rang+1];
        for (int i = 0; i < rang; i ++) polinomElements[i] = random.nextInt(origin,bound);
    }
    public Polynomial(int[] pol) {
        this.rang = pol.length - 1;
        polinomElements = pol;
    }
    public Polynomial(String fileName) throws IOException {
        FileReader file = new FileReader(fileName);
        Scanner scanner = new Scanner(file);
        String text = scanner.nextLine();
        file.close();
        String findRang = text.replaceAll(" ", "")
                        .replaceAll("\\d*x\\^*", "")
                        .replaceAll("[+-]\\d=0", "");
        this.rang = (int)Arrays.stream(findRang.split("[-+]"))
                .map(Integer::parseInt).max(Comparator.comparingInt(a -> a)).get();
        String[] pol = text.replaceAll(" ", "")
                .replaceAll("x\\^*\\d*\\+*", "|")
                .replaceAll("=0", "")
                .split("\\|");
        Collections.reverse(Arrays.asList(pol));
        this.polinomElements = Arrays.stream(pol).map(Integer::parseInt).mapToInt(i->i).toArray();
    }


    public int[] getPolinomAsArray() {
        return polinomElements;
    }


    public Polynomial makeSum(Polynomial another){
        int[] first, second;
        if (another.rang >= this.rang){
            first = another.polinomElements.clone();
            second = this.polinomElements.clone();
        }
        else {
            first = this.polinomElements.clone();
            second = another.polinomElements.clone();
        }
        for (int i = 0; i <= first.length; i++){
            if (i < second.length){
                first[i] += second[i];
            }
        }
        return new Polynomial(first);
    }
    public void saveToFile(String fileName) throws IOException{
        File file = new File(fileName);
        PrintWriter pw = new PrintWriter(file);
        pw.println(this.toString());
        pw.close();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = rang; i >= 0; i--) {
            if (polinomElements[i] != 0) {
                char sign = polinomElements[i] > 0 ? result.length() == 0 ? ' ':'+' : '-';
                String iks;
                if (i > 1) iks = "x^" + i;
                else if (i == 1) iks = "x";
                else iks = "";
                result.append(String.format("%c %d%s ", sign, Math.abs(polinomElements[i]), iks));
            }
        }
        result.append("= 0");
        return result.toString().stripLeading();
    }
}
