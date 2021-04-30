import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "([|#])(?<food>[A-Za-z ]+)\\1(?<data>([0-9][0-9])\\/([0-9][0-9])\\/([0-9][0-9]))\\1(?<calories>[0-9]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int totalSum = 0;
        while (matcher.find()) {
            int calories = Integer.parseInt(matcher.group("calories"));
            totalSum += calories;
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n",matcher.group(2),matcher.group(3),matcher.group("calories"));
        }
        int days = totalSum / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);



    }

}
