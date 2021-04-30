import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPen=Integer.parseInt(scanner.nextLine());
        int numOfMarker=Integer.parseInt(scanner.nextLine());
        double literPreparat=Double.parseDouble(scanner.nextLine());
        int procentNamalenie=Integer.parseInt(scanner.nextLine());
        double sumOfPen=numOfPen*5.80;
        double sumOfMarker=numOfMarker*7.20;
        double sumOfPreparat=literPreparat*1.20;
        double totalSum=sumOfMarker+sumOfPen+sumOfPreparat;
        double realSum=totalSum-totalSum*procentNamalenie/100;
        System.out.printf("%.3f",realSum);
    }
}
