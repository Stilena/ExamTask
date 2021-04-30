import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int numOfGuests=Integer.parseInt(scanner.nextLine());
        double priceForPerson=Double.parseDouble(scanner.nextLine());
        double budjet=Double.parseDouble(scanner.nextLine());
        if(numOfGuests>=10 && numOfGuests<=15){
            priceForPerson=priceForPerson-priceForPerson*0.15;
        }else if(numOfGuests>15 && numOfGuests<=20){
            priceForPerson=priceForPerson-priceForPerson*0.20;
        }else if(numOfGuests>20){
            priceForPerson=priceForPerson-priceForPerson*0.25;
        }
        double priceForCake=budjet*0.1;
        double totalPrice=priceForCake+priceForPerson*numOfGuests;
        if(budjet>=totalPrice){
            double more=budjet-totalPrice;
            System.out.printf("It is party time! %.2f leva left.",more);
        }else{
            double need=totalPrice-budjet;
            System.out.printf("No party! %.2f leva needed.",need);
        }
    }
}
