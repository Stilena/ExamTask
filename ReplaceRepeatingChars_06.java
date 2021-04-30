import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         String input = scanner.nextLine();
        StringBuilder text = new StringBuilder();

        text.append(input.charAt(0));
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (i + 1 == input.length()) {
                break;
            }
            if (symbol == input.charAt(i + 1)) {
                input = input.substring(i + 1);
                i = -1;

            } else {
                text.append(input.charAt(i + 1));
            }
        }
        System.out.println(text.toString());
    }
}
