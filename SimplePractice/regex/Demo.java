import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    private Pattern pattern, pattern1;
    private Matcher m;
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+\\.[a-zA-Z]+$";
    private static final String IP_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                             "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                             "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                             "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public Demo() {
        this.pattern = Pattern.compile(EMAIL_PATTERN);
        this.pattern1 = Pattern.compile(IP_PATTERN);
    }


    boolean checkEmail(String email) {
        m = pattern.matcher(email);
        return m.matches();
    }
    boolean checkIp(String ip) {
        m = pattern1.matcher(ip);
        return m.matches();
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println("Check Email:");
        System.out.println(d.checkEmail("valeriy_vaspov@gmail.com"));
        System.out.println("Check Ip:");
        System.out.println(d.checkIp("2.222.255.02"));
    }
}
