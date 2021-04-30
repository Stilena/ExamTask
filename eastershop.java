import java.util.Scanner;

public class eastershop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfEggs = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();
        int count = 0;
        int sum = 0;
        int sumSold = 0;
        int total = 0;
        while (!text.equals("Close")) {
            String command = text;
            int numOfEggs = Integer.parseInt(scanner.nextLine());
            if (text.equals("Buy")) {
                sumSold += amountOfEggs - numOfEggs;
            }
            if (text.equals("Fill")) {
                sum = sumSold + numOfEggs;
            }
            if (sumSold > numOfEggs) {
                System.out.println("Not enough eggs in store!");
                System.out.printf("You can buy only %d.", sum);
                break;
            }
            text = scanner.nextLine();
            count++;
            total = sum + sumSold;
        }
        if (text.equals("Close")) {
            System.out.printf("Store is closed!%n");
            System.out.printf("%d eggs sold.", total);
        }
    }
}