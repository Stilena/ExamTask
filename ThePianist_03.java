import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ThePianist_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        Map<String,String>pieceComposer=new TreeMap<>();
        Map<String,String>pieceKey=new TreeMap<>();

        for (int i = 0; i <n ; i++) {
            String[] input=scanner.nextLine().split("\\|");
            String name=input[0];
            String composer=input[1];
            String key=input[2];
            pieceComposer.put(name,composer);
            pieceKey.put(name,key);
        }
        String command=scanner.nextLine();
        while (!command.equals("Stop")){
            String [] tokens=command.split("\\|");
            String currentCommand=tokens[0];
            String pieceCommand=tokens[1];
            if (currentCommand.equals("Add")){
                String composer=tokens[2];
                String keyPiece=tokens[3];
                if (pieceComposer.containsKey(pieceCommand) || pieceKey.containsKey(pieceCommand)){
                    System.out.printf("%s is already in the collection!%n",pieceCommand);
                }else {
                    pieceComposer.put(pieceCommand,composer);
                    pieceKey.put(pieceCommand,keyPiece);
                    System.out.printf("%s by %s in %s added to the collection!%n",pieceCommand
                    ,composer,keyPiece);
                }
            }else if (currentCommand.equals("Remove")){
                if (pieceComposer.containsKey(pieceCommand) || pieceKey.containsKey(pieceCommand)){
                    pieceComposer.remove(pieceCommand);
                    pieceKey.remove(pieceCommand);
                    System.out.printf("Successfully removed %s!%n",pieceCommand);
                }else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceCommand);
                }
            }else if (currentCommand.equals("ChangeKey")){
                String newKey=tokens[2];
                if ( pieceKey.containsKey(pieceCommand)){
                    String oldKey=pieceKey.get(pieceCommand);
                   pieceKey.remove(oldKey);
                   pieceKey.put(pieceCommand,newKey);
                    System.out.printf("Changed the key of %s to %s!%n",pieceCommand,newKey);
                }else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceCommand);
                }
            }
            command=scanner.nextLine();
        }
        pieceComposer.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry->{
            String printTokens=entry.getKey();
            String composerPrint=pieceComposer.get(printTokens);
            String keyPrint=pieceKey.get(printTokens);
            System.out.printf("%s -> Composer: %s, Key: %s%n",printTokens,composerPrint,keyPrint);
        });
    }
}
