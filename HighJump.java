import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int highOfTihomir = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int count1 = 0;
        int totalJump = 0;
        int j=0;
        for ( j= highOfTihomir - 30; j <= highOfTihomir; j += 5) {

                int high = Integer.parseInt(scanner.nextLine());
                if (high > j) {
                    count++;
                    count1 = 0;
                } else {
                    count1++;
                    totalJump++;
                }

            if (count1 == 3) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.%n", j, totalJump);
            }
        }
       System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",j,totalJump);
    */
        int height = scanner.nextInt();

        int currentHeight = height - 30;

        int totalJumps = 0;
        boolean failed = false;

        int counterFailed = 0;

        while (!failed) {
            int jump = scanner.nextInt();
            totalJumps++;

            if (jump <= currentHeight) {
                counterFailed++;
                if (counterFailed == 3) {
                    failed = true;
                }
            } else {
                if (currentHeight >= height) {
                    break;
                }
                currentHeight += 5;
                counterFailed = 0;
            }
        }

        if (!failed) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", currentHeight, totalJumps);
        } else {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", currentHeight, totalJumps);
        }

    }
}
