import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        double count = 0;
        count = capacity;
        double neew = 0;
        int br = 0;
        String text = scanner.nextLine();
        while (!text.equals("End")) {
            double volume = Double.parseDouble(text);
            if (volume > count) {
                System.out.println("No more space!");
                System.out.printf("Statistic: %d suitcases loaded.", br);
                break;
            }
            if (br % 3 == 0) {
                double uvelichenie = 0;
                uvelichenie += volume + volume * 0.1;

                neew += count - uvelichenie;
            }
            count -= volume;

            br += 1;

            text = scanner.nextLine();
        }
        if (text.equals("End")) {
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.", br);
        }
    }
}
