import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ourSum=Double.parseDouble(scanner.nextLine());
        String gender=scanner.nextLine();
        int age=Integer.parseInt(scanner.nextLine());
        String sport=scanner.nextLine();
        double sum=0;
        if(gender.equals("m")){
            if(sport.equals("Gym")){
                sum=42;
            }else if(sport.equals("Boxing")){
                sum=41;
            }else if(sport.equals("Yoga")){
                sum=45;
            }else if(sport.equals("Zumba")){
                sum=34;
            }else if(sport.equals("Dances")){
                sum=51;
            }else if(sport.equals("Pilates")){
                sum=39;
            }
        }else if(gender.equals("f")){
            if(sport.equals("Gym")){
                sum=35;
            }else if(sport.equals("Boxing")){
                sum=37;
            }else if(sport.equals("Yoga")){
                sum=42;
            }else if(sport.equals("Zumba")){
                sum=31;
            }else if(sport.equals("Dances")){
                sum=53;
            }else if(sport.equals("Pilates")){
                sum=37;
            }
        }
        if(age<=19){
            sum=sum-sum*0.2;
        }
        if(ourSum>sum){
            System.out.printf("You purchased a 1 month pass for %s.",sport);
        }else{
            double need=ourSum-sum;
            System.out.printf("You don't have enough money! You need $%.2f more.",Math.abs(need));
        }
    }
}
