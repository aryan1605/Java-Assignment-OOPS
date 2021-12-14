package regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class StartNnEndJj {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter String : ");
        str = sc.nextLine();
        Pattern p = Pattern.compile("\\b[Nn]+[A-Za-z]*[jJ]+\\b");
        Matcher m = p.matcher(str);

        int ctr = 0;
        while (m.find())
        {
            System.out.println(m.group());
        }
    }
}
