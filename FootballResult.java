import java.util.Scanner;

public class FootballResult {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String firstMach=scanner.nextLine();
        String secondMach=scanner.nextLine();
        String thirdMach=scanner.nextLine();
        int won=0;
        int lost=0;
        int drawn=0;
        if (firstMach.charAt(0)>firstMach.charAt(2)){
            won++;
        }else if(firstMach.charAt(0)==firstMach.charAt(2)){
            drawn++;
        }else{
            lost++;
        }
        if (secondMach.charAt(0)>secondMach.charAt(2)){
            won++;
        }else if(secondMach.charAt(0)==secondMach.charAt(2)){
            drawn++;
        }else{
            lost++;
        }
        if (thirdMach.charAt(0)>thirdMach.charAt(2)){
            won++;
        }else if(thirdMach.charAt(0)==thirdMach.charAt(2)){
            drawn++;
        }else{
            lost++;
        }
        System.out.printf("Team won %d games.%n",won);
        System.out.printf("Team lost %d games.%n",lost);
        System.out.printf("Drawn games: %d ",drawn);
    }
}
