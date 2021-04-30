import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String textCommand = scanner.nextLine();
        String newText="";
        while (!textCommand.equals("Complete")) {
          //  String[] tokens = command.split("\\s+");
           // String textCommand = tokens[0];
            if (textCommand.equals("Make Upper")){
                text=text.toUpperCase();
                System.out.println(text);
            }else if(textCommand.equals("Make Lower")){
                text=text.toLowerCase();
                System.out.println(text);
            }else if(textCommand.equals("GetDomain")){
                String[] tokens = textCommand.split("\\s+");
                int count=Integer.parseInt(tokens[1]);

            }else if (textCommand.equals("GetUsername")){
                String[] tokens = textCommand.split("\\s+");
                for (int i = 0; i <text.length() ; i++) {
                    char currentSymbol=text.charAt(i);
                    if (currentSymbol=='@'){
                        break;
                    }else{
                        newText+=currentSymbol;
                    }
                }
                if (!text.contains("@")){
                    System.out.printf("The email %s doesn't contain the @ symbol.",text);
                }else {
                    System.out.println(newText);
                }
            }else if(textCommand.equals("Replace")){
                String[] tokens = textCommand.split("\\s+");
                String symbol=tokens[1];
                for (int i = 0; i < text.length(); i++) {
                    char currentSymbol=text.charAt(i);
                    if (symbol.equals(currentSymbol)) {
                        text=text.replace(currentSymbol, '-');
                    }
                }
                System.out.println(text);
            }else if (textCommand.equals("Encrypt")){
                for (int i = 0; i <text.length() ; i++) {
                    char currentSymbol=text.charAt(i);
                    int sum=currentSymbol;
                    System.out.printf("%d ",sum);
                }
            }
            textCommand = scanner.nextLine();
        }
    }
}
