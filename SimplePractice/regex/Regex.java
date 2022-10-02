import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static final String text = "Таиланд красивая страна, много людей посещают эту страну каждый год";
    public static boolean test(String str){
        Pattern pattern = Pattern.compile("^Ivan$");
        Matcher match = pattern.matcher(str);
        return match.matches();
    }
    public static boolean test2(String str){
        Pattern pattern = Pattern.compile(".+\\.(org|ru|com)");
        Matcher match = pattern.matcher(str);
        return match.matches();
    }

    public static void main(String[] args) {
        System.out.println(test("Ivan"));
        System.out.println(test("ivan"));
        System.out.println(test("IVAN"));

        System.out.println(text.replaceAll("[Тт]а[ий]ланд", "Россия"));
        System.out.println(test2("site.org"));
    }
}
