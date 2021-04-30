import java.util.Scanner;

public class catWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minForWalk=Integer.parseInt(scanner.nextLine());
        int numOfWalk=Integer.parseInt(scanner.nextLine());
        int prietiCalorii=Integer.parseInt(scanner.nextLine());
        int izgoreniKalorii=numOfWalk*5*minForWalk;
        if(izgoreniKalorii>=(prietiCalorii/2)){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",izgoreniKalorii);
        }else{
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",izgoreniKalorii);
        }
    }
}
