import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String ured = scanner.nextLine();
        double total = 0;
        double procent = 0;

        if (country.equals("Russia")) {
            if (ured.equals("ribbon")) {
                total = 9.100 + 9.400;
                procent = (20 - total) / 20 * 100;
                System.out.printf("The team of %s get %.3f on %s.%n", country, total, ured);
                System.out.printf("%.2f%%", procent);
            } else if (ured.equals("hoop")) {
                total = 9.300 + 9.800;
                procent = (20 - total) / 20 * 100;
                System.out.printf("The team of %s get %.3f on %s.%n", country, total, ured);
                System.out.printf("%.2f%%", procent);
            } else if (ured.equals("rope")) {
                total = 9.600 + 9.000;
                procent = (20 - total) / 20 * 100;
                System.out.printf("The team of %s get %.3f on %s.%n", country, total, ured);
                System.out.printf("%.2f%%", procent);
            }
        } else if (country.equals("Bulgaria")) {
            if (ured.equals("ribbon")) {
                total = 9.600 + 9.400;
                procent = (20 - total) / 20 * 100;
                System.out.printf("The team of %s get %.3f on %s.%n", country, total, ured);
                System.out.printf("%.2f%%", procent);
            } else if (ured.equals("hoop")) {
                total = 9.550 + 9.750;
                procent = (20 - total) / 20 * 100;
                System.out.printf("The team of %s get %.3f on %s.%n", country, total, ured);
                System.out.printf("%.2f%%", procent);
            } else if (ured.equals("rope")) {
                total = 9.500 + 9.400;
                procent = (20 - total) / 20 * 100;
                System.out.printf("The team of %s get %.3f on %s.%n", country, total, ured);
                System.out.printf("%.2f%%", procent);
            }
        } else if (country.equals("Italy")) {
            if (ured.equals("ribbon")) {
                total = 9.200 + 9.500;
                procent = (20 - total) / 20 * 100;
                System.out.printf("The team of %s get %.3f on %s.%n", country, total, ured);
                System.out.printf("%.2f%%", procent);
            } else if (ured.equals("hoop")) {
                total = 9.450 + 9.350;
                procent = (20 - total) / 20 * 100;
                System.out.printf("The team of %s get %.3f on %s.%n", country, total, ured);
                System.out.printf("%.2f%%", procent);
            } else if (ured.equals("rope")) {
                total = 9.700 + 9.150;
                procent = (20 - total) / 20 * 100;
                System.out.printf("The team of %s get %.3f on %s.%n", country, total, ured);
                System.out.printf("%.2f%%", procent);
            }
        }
    }
}


