import java.util.Scanner;

public class easterguests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOgGuests=Integer.parseInt(scanner.nextLine());
        int budjet=Integer.parseInt(scanner.nextLine());
        double numOgKozunaci=Math.ceil(1.0*numOgGuests/3);
        int numOfEggs=numOgGuests*2;
        double priceKozunak=numOgKozunaci*4;
       double priceOfEggs=numOfEggs*0.45;
       double totalPrice=priceKozunak+priceOfEggs;
       if(budjet<=totalPrice){
           double need=totalPrice-budjet;
           System.out.printf("Lyubo doesn't have enough money.%n");
           System.out.printf("He needs %.2f lv. more.",Math.abs(need));
       }else{
            double more=budjet-totalPrice;
           System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n",Math.ceil(numOgKozunaci),numOfEggs );
           System.out.printf("He has %.2f lv. left.",Math.abs(more));
       }

    }
}
