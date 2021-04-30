import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        StringBuilder builder=new StringBuilder(text);
        String command=scanner.nextLine();
        while (!command.equals("Travel")){
            String[] tokens=command.split(":");
            String commandText=tokens[0];
            if (commandText.equals("Add Stop")){
                int index=Integer.parseInt(tokens[1]);
                String string=tokens[2];
                if (text.length()>=index){
                    builder.insert(index,string);
                }
                System.out.println(builder);
            }else if(commandText.equals("Remove Stop")){
                int stringIndex=Integer.parseInt(tokens[1]);
                int endIndex=Integer.parseInt(tokens[2]);
             //String remove=   builder.substring(stringIndex,endIndex+1);
                builder.replace(stringIndex,endIndex+1,"");
                System.out.println(builder);
            }else if (commandText.equals("Switch")){
                String oldString=tokens[1];
                String newString=tokens[2];

                    if (text.contains(oldString)) {
                        int indexOfOldString=oldString.indexOf(oldString);
                        int lastIndex=oldString.length();
                        builder.replace(indexOfOldString,lastIndex,"");
                        builder.replace(0,indexOfOldString,newString);
                    }
                System.out.println(builder);
            }
            command=scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + builder);
    }

}
