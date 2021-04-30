import java.util.Scanner;

public class SecretChatProblem_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        String command=scanner.nextLine();

        while (!command.equals("Reveal")){
            String[]tokens=command.split(":\\|:");
            String input=tokens[0];
            if (input.equals("InsertSpace")){
                int index=Integer.parseInt(tokens[1]);

                text=text.substring(0,index)+" "+text.substring(index);
                System.out.println(text);
            }else if (input.equals("Reverse")){
                String substring=tokens[1];
                if (text.contains(substring)){
                text=  text.replace(substring,"").
                        concat(new StringBuilder(substring).reverse().toString());
                    System.out.println(text);

                }else {
                    System.out.println("error");
                }
            }else if (input.equals("ChangeAll")){
                String substring=tokens[1];
                String replacement=tokens[2];
               text= text.replace(substring,replacement);
                System.out.println(text);
            }
            command=scanner.nextLine();
        }
        System.out.println("You have a new text message: " + text);
    }
}
