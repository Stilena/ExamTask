import java.util.Scanner;

public class EASTERBAKE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfKozunaci=Integer.parseInt(scanner.nextLine());
        int totalSugar=0;
        int totalBrashno=0;
        double numOfPacketSugar=0;
        double numOfPacketBrashno=0;
        int maxSuger=Integer.MIN_VALUE;
        int maxBRASHNO=Integer.MIN_VALUE;
        for (int i = 1; i <=numOfKozunaci ; i++) {
            int amoutOfSugarInGram=Integer.parseInt(scanner.nextLine());
            int amoutOfBrashnoInGram=Integer.parseInt(scanner.nextLine());
            totalSugar+=amoutOfSugarInGram;
            totalBrashno+=amoutOfBrashnoInGram;
            if(amoutOfBrashnoInGram>maxBRASHNO){
                maxBRASHNO=amoutOfBrashnoInGram;
            }
            if (amoutOfSugarInGram>maxSuger) {
                maxSuger = amoutOfSugarInGram;
            }

        }
        numOfPacketSugar=Math.ceil(1.0*totalSugar/950);
        numOfPacketBrashno=Math.ceil(1.0*totalBrashno/750);
        System.out.printf("Sugar: %.0f%n",numOfPacketSugar);
        System.out.printf("Flour: %.0f%n",numOfPacketBrashno);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.",maxBRASHNO,maxSuger);
    }
}
