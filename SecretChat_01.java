import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String message=scanner.nextLine();

        String command=scanner.nextLine();
        while (!command.equals("Reveal")){
            String [] tokens=command.split(":\\|:");
            String messageCommand=tokens[0];
            if (messageCommand.equals("InsertSpace")){
                int index=Integer.parseInt(tokens[1]);
             message=   message.substring(0,index) + " " + message.substring(index);
                System.out.println(message);
            }else if (messageCommand.equals("Reverse")){
                String substring=tokens[1];
                if (message.contains(substring)){
                    message=message.replace(substring,"").concat(new StringBuilder(substring)
                            .reverse().toString());
                    System.out.println(message);
                }else {
                    System.out.println("error");
                }
            }else if (messageCommand.equals("ChangeAll")){
                String substring=tokens[1];
                String replacement=tokens[2];
                message=message.replace(substring,replacement);
                System.out.println(message);
            }
            command=scanner.nextLine();
        }
        System.out.println("You have a new text message: " + message);
    }
}
