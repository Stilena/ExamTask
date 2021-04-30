import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPersonInfo_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String regexName="([@](?<name>[A-Za-z][a-z]+)[|])";
        Pattern pattern=Pattern.compile(regexName);
        String regexAge="[#](?<age>([0-9]+))[*]";
        Pattern pattern1=Pattern.compile(regexAge);
        for (int i = 1; i <=n ; i++) {
            String information=scanner.nextLine();
            Matcher matcher=pattern.matcher(information);
            Matcher matcher1=pattern1.matcher(information);
            if (matcher.find() && matcher1.find()){
                System.out.printf("%s is %s years old.%n",matcher.group("name"),matcher1.group("age"));
            }

        }
    }
}
