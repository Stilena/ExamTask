import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        String command=scanner.nextLine();
        int count=0;
        double sum=0;
        while(!command.equals("Stop")){
            double price=Double.parseDouble(scanner.nextLine());
            count++;
            if(count%3==0){
                price=price/2;
            }
            sum+=price;
            if(sum>budget){
                double need=sum-budget;
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!",need);
                break;
            }



            command=scanner.nextLine();
        }
        if(command.equals("Stop")){
            System.out.printf("You bought %d products for %.2f leva.",count,sum);
        }

    }
}
