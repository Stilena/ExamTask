import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int days=Integer.parseInt(scanner.nextLine());
        double amountOfFood=Double.parseDouble(scanner.nextLine());
        double totalFood=0;
        double biscuits=0;
        double currentBis=0;
        int procentCat=0;
        int procentDog=0;
        for (int i = 1; i <= days ; i++) {
            int foodDog=Integer.parseInt(scanner.nextLine());
            int foodCat=Integer.parseInt(scanner.nextLine());
            procentDog=procentDog+foodDog;
            procentCat=procentCat+foodCat;
            totalFood+=foodCat+foodDog;
            if(i%3==0){
                currentBis=(foodCat+foodDog)*0.1;
                biscuits+=currentBis;
            }
        }
        System.out.printf("Total eaten biscuits: %dgr.%n",Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n",totalFood*100/amountOfFood);
        System.out.printf("%.2f%% eaten from the dog.%n",procentDog*100/totalFood);
        System.out.printf("%.2f%% eaten from the cat.",procentCat*100/totalFood);
    }
}
