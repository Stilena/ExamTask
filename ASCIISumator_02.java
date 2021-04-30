import java.util.Scanner;

public class ASCIISumator_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char firstSymbol=scanner.nextLine().charAt(0);
        char lastSymbol=scanner.nextLine().charAt(0);
        String text=scanner.nextLine();
        int sum=0;
        for (int i = 0; i <text.length() ; i++) {
            char currentSymbol=text.charAt(i);
            if (currentSymbol>firstSymbol && currentSymbol<lastSymbol){
                sum+=currentSymbol;
            }
        }
        System.out.println(sum);
    }
}
