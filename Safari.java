import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        double gorivo=Double.parseDouble(scanner.nextLine());
        String day=scanner.nextLine();
        double sumOfGorivo=gorivo*2.10;
        double total=0;
        total=sumOfGorivo+100;
        if(day.equals("Saturday")){
            total=total-total*0.1;
            if(budget>=total){
                double left=0;
                left=budget-total;
                System.out.printf("Safari time! Money left: %.2f lv. ",left);
            }else{
                double need=0;
                need=total-budget;
                System.out.printf("Not enough money! Money needed: %.2f lv.",need);
            }
        }else if(day.equals("Sunday")){
            total=total-total*0.2;
            if(budget>=total){
                double left=0;
                left=budget-total;
                System.out.printf("Safari time! Money left: %.2f lv. ",left);
            }else{
                double need=0;
                need=total-budget;
                System.out.printf("Not enough money! Money needed: %.2f lv.",need);
            }
        }

    }
}
