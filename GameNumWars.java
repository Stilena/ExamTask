import java.util.Scanner;

public class GameNumWars {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String text1=scanner.nextLine();
        String text2=scanner.nextLine();
        String command=scanner.nextLine();
        int count1=0;
        int count2=0;
        while(!command.equals("End of game")){
            int card1=Integer.parseInt(command);
            int card2=Integer.parseInt(scanner.nextLine());
            if(card1>card2){
                count1+=card1-card2;
            }else if(card1<card2){
                count2+=card2-card1;
            }else if(card1==card2){
                System.out.println("Number wars!");
                card1=Integer.parseInt(scanner.nextLine());
                card2=Integer.parseInt(scanner.nextLine());
                if(card1>card2){
                    System.out.printf("%s is winner with %d points",text1,count1);
                }else{
                    System.out.printf("%s is winner with %d points",text2,count2);

                }
                break;
            }
            command=scanner.nextLine();

        }
        if(command.equals("End of game")){
            System.out.printf("%s has %d points%n",text1,count1);
            System.out.printf("%s has %d points",text2,count2);
        }

    }
}
