package regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EndWithJj {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter string : ");
        str = sc.nextLine();
        Pattern p = Pattern.compile("\\b[A-Za-z]+[jJ]+\\b");
        Matcher m =  p.matcher(str);
        int ctr = 0;
        while(m.find())
        {
            System.out.println(m.group());
            ctr++;
        }

    }
}
