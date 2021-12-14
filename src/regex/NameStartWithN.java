package regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class NameStartWithN {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String target;
        System.out.print("Enter Name : ");
        target = sc.nextLine();
        Pattern p = Pattern.compile("\\b[Nn][a-z]+\\b");
        Matcher m = p.matcher(target);

        int ctr = 0;
        while(m.find())
        {
            System.out.println(m.group());
            ctr++;
        }
    }
}
