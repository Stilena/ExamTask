
import java.util.Scanner;

public class easterbakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOfKgBrashno=Double.parseDouble(scanner.nextLine());
        double kgBrashno=Double.parseDouble(scanner.nextLine());
        double kgSugar=Double.parseDouble(scanner.nextLine());
        int koriEggs=Integer.parseInt(scanner.nextLine());
        int packetOfMaq=Integer.parseInt(scanner.nextLine());
        double sumOfBrashno=kgBrashno*priceOfKgBrashno;
        double priceOfSugar=priceOfKgBrashno-priceOfKgBrashno*0.25;
        double totalPriceOfSugar=priceOfSugar*kgSugar;
        double priceOfKoriEggs=priceOfKgBrashno+priceOfKgBrashno*0.1;
        double totalPriceOfKoriEggs=priceOfKoriEggs*koriEggs;
        double priceOfMaq=priceOfSugar-priceOfSugar*0.8;
        double totalPriceOfMaq=priceOfMaq*packetOfMaq;
        double totalSum=sumOfBrashno+totalPriceOfSugar+totalPriceOfKoriEggs+totalPriceOfMaq;
        System.out.printf("%.2f",totalSum);
    }
}
