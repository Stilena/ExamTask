import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        String regex="([=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        List<String>destinations=new ArrayList<>();
        int sumOfLength=0;
        while (matcher.find()){
            String currentWold=matcher.group("destination");
            destinations.add(currentWold);
            for (int i = 0; i < currentWold.length(); i++) {
               // char currentSymbol=currentWold.charAt(i);
                sumOfLength++;
            }
        }
        System.out.println("Destinations: " + String.join(", ",destinations));
        System.out.println("Travel Points: " + sumOfLength);
    }
}
