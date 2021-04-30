import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String regex="(U\\$)(?<username>[A-Z][a-z]{2,})\\1(P@\\$)(?<pass>[A-Za-z]{5,}[0-9]+)\\3";
        Pattern pattern=Pattern.compile(regex);
        int count=0;
        for (int i = 1; i <=n ; i++) {
            String text=scanner.nextLine();
            Matcher matcher=pattern.matcher(text);
            if (matcher.find()){
                count++;
                System.out.println("Registration was successful");
                System.out.printf("Username: %s, Password: %s%n",matcher.group("username"),matcher.group("pass"));
            }else{
                System.out.println("Invalid username or password");
            }
        }
        System.out.printf("Successful registrations: %d",count);
    }
}
