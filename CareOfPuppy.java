import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int food=Integer.parseInt(scanner.nextLine());
        int foodInGram=food*1000;
        int counter=0;
        String text=scanner.nextLine();
        while(!text.equals("Adopted")){
            int eatenFood=Integer.parseInt(text);
            counter+=eatenFood;

            text=scanner.nextLine();
        }
        if(counter>foodInGram){
            int more=counter-foodInGram;
            System.out.printf("Food is not enough. You need %d grams more. ",more);
        }else{
            int need=foodInGram-counter;
             System.out.printf("Food is enough! Leftovers: %d grams.",need);
        }
    }
}
