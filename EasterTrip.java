import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String date = scanner.nextLine();
        double totalSum = 0;
        int numOfNights = Integer.parseInt(scanner.nextLine());
        if (text.equals("France")) {
            if (date.equals("21-23")) {
                totalSum += numOfNights * 30;
                System.out.printf("Easter trip to %s : %.2f leva.", text, totalSum);

            } else if (date.equals("24-27")) {
                totalSum += numOfNights * 35;
                System.out.printf("Easter trip to %s : %.2f leva.", text, totalSum);

            } else if (date.equals("28-31")) {
                totalSum += numOfNights * 40;
                System.out.printf("Easter trip to %s : %.2f leva.", text, totalSum);

            }
        } else if (text.equals("Italy")) {
            if (date.equals("21-23")) {
                totalSum += numOfNights * 28;
                System.out.printf("Easter trip to %s : %.2f leva.", text, totalSum);

            } else if (date.equals("24-27")) {
                totalSum += numOfNights * 32;
                System.out.printf("Easter trip to %s : %.2f leva.", text, totalSum);

            } else if (date.equals("28-31")) {
                totalSum += numOfNights * 39;
                System.out.printf("Easter trip to %s : %.2f leva.", text, totalSum);

            }
        } else if (text.equals("Germany")) {
            if (date.equals("21-23")) {
                totalSum += numOfNights * 32;
                System.out.printf("Easter trip to %s : %.2f leva.", text, totalSum);

            } else if (date.equals("24-27")) {
                totalSum += numOfNights * 37;
                System.out.printf("Easter trip to %s : %.2f leva.", text, totalSum);

            } else if (date.equals("28-31")) {
                totalSum += numOfNights * 43;
                System.out.printf("Easter trip to %s : %.2f leva.", text, totalSum);

            }
        }
    }
}
