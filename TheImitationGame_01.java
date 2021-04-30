import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String command = scanner.nextLine();
        StringBuilder builder = new StringBuilder(text);

        while (!command.equals("Decode")) {
            String[] input = command.split("\\|");
            String operation = input[0];
            if (operation.equals("Move")) {
                int numberOfLetters = Integer.parseInt(input[1]);
                for (int i = 0; i < numberOfLetters; i++) {
                    char currentSymbol = builder.charAt(i);
                    text = (builder.append(currentSymbol)).toString();
                }
                builder.replace(0, numberOfLetters, "");

            } else if (operation.equals("Insert")) {
                int index = Integer.parseInt(input[1]);
                String value = input[2];
                text = (builder.insert(index, value)).toString();
            } else if (operation.equals("ChangeAll")) {
                String substring = input[1];
                String replacement = input[2];
                builder.delete(0,text.length());
                    if (text.contains(substring)) {
                        text = text.replace(substring, replacement);
                    }

                    builder.append(text);
            }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + builder);
    }

}

