import java.util.Scanner;

public class MountainRoutine {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double record=Double.parseDouble(scanner.nextLine());
        double road=Double.parseDouble(scanner.nextLine());
        double timePer1m=Double.parseDouble(scanner.nextLine());
        double timeOfGeorgi=road*timePer1m;
        double zabavqqne=Math.floor(road/50)*30;
        double totalTime=timeOfGeorgi+zabavqqne;
        if(totalTime<record){
            System.out.printf("Yes! The new record is %.2f seconds.",totalTime);
        }else{
            double need=totalTime-record;
            System.out.printf("No! He was %.2f seconds slower.",need);
        }
    }
}
