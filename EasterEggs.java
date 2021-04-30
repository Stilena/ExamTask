import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfEggs=Integer.parseInt(scanner.nextLine());
        int brRed=0;
        int brOrange=0;
        int brBlue=0;
        int brGreene=0;
        for (int i = 1; i <=numOfEggs ; i++) {
            String color=scanner.nextLine();
            if(color.equals("red")){
                brRed++;
            }
            if(color.equals("orange")){
               brOrange+=1;
            }
            if(color.equals("blue")){
                brBlue++;
            }
            if(color.equals("green")){
                brGreene++;
            }
        }
        System.out.printf("Red eggs: %d%n",brRed);
        System.out.printf("Orange eggs: %d%n",brOrange);
        System.out.printf("Blue eggs: %d%n",brBlue);
        System.out.printf("Green eggs: %d%n",brGreene);

        if(brRed> brBlue && brRed>brGreene && brRed>brOrange){
            System.out.printf("Max eggs: %d -> red",brRed);
        }else if(brOrange>brRed && brOrange>brBlue && brOrange>brGreene){
            System.out.printf("Max eggs: %d -> orange",brOrange);
        }else if(brBlue>brRed && brBlue>brOrange && brBlue>brGreene){
            System.out.printf("Max eggs: %d -> blue",brBlue);
        }else {
            System.out.printf("Max eggs: %d -> green",brGreene);
        }
    }
}
