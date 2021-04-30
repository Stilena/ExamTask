import java.util.Scanner;

public class EasterEgssBatlle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfEggsFirst=Integer.parseInt(scanner.nextLine());
        int numOfEggsSecond=Integer.parseInt(scanner.nextLine());
        int counter=0;
        String text=scanner.nextLine();
        while(!text.equals("End of battle")){
            String winner=scanner.nextLine();
            if(winner.equals("one")){
                numOfEggsSecond-=1;
            }else if(winner.equals("two")){
                numOfEggsFirst-=1;
            }
            if(numOfEggsFirst==0 ){
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.",numOfEggsSecond);
            }
            if(numOfEggsSecond==0){
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.",numOfEggsFirst);
            }
            counter++;
            text=scanner.nextLine();
        }

            System.out.printf("Player one has %d eggs left.%n",numOfEggsFirst);
            System.out.printf("Player two has %d eggs left.%n",numOfEggsSecond);


    }
}
