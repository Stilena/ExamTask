import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();


        String regex = "(?<string>[\\D]*)(?<count>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            int n = Integer.parseInt(matcher.group("count"));
            String word = matcher.group("string").toUpperCase();
            for (int i = 0; i < n; i++) {
                sb.append(word);
            }
        }

        System.out.printf("Unique symbols used: %d%n", sb.chars().distinct().count());
        System.out.println(sb);
     /*  int count=-1;
        String text="";

        StringBuilder builder=new StringBuilder();
        for (int i = 0; i <input.length() ; i++) {
            char currentSymbol=input.charAt(i);
            if (Character.isDigit(currentSymbol)) {
               // int number= Integer.parseInt(String.format("%s ", currentSymbol));

                for (int j = 0; j <number ; j++) {
                    builder.append(text.toUpperCase());
                }
                    text="";
            }else{
                count++;
               text+=currentSymbol;
            }

        }
        System.out.printf("Unique symbols used: %d%n%s",count,builder);*/
    }
}
