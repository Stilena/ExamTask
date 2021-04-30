import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numOfTurnirs=Integer.parseInt(scanner.nextLine());
        int points=Integer.parseInt(scanner.nextLine());
        int morePoints=0;
        double average=0;
        int count=0;
        double total=0;
        double procent=0;
        for (int i = 1; i <= numOfTurnirs ; i++) {
            String etap=scanner.nextLine();
            if(etap.equals("W")){
                morePoints+=2000;
                count++;
            }else if(etap.equals("F")){
                morePoints+=1200;
            }else if(etap.equals("SF")){
                morePoints+=720;
            }

        }
        total=points+morePoints;
        average=1.0*morePoints/numOfTurnirs;
        procent=1.0*count/numOfTurnirs*100;
        System.out.printf("Final points: %.0f%n",total);
        System.out.printf("Average points: %.0f%n",Math.floor(average));
        System.out.printf("%.2f%%",procent);

    }
}
