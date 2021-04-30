import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfGroup=Integer.parseInt(scanner.nextLine());
        int total=0;
        double prMusala=0;
        double prMonblan=0;
        double prKilimandjaro=0;
        double prK2=0;
        double prEverest=0;
        for (int i = 1; i <=numOfGroup ; i++) {
            int numOfPeople=Integer.parseInt(scanner.nextLine());
            total+=numOfPeople;
            if(numOfPeople<=5){
                prMusala+=numOfPeople;

            }else if(numOfPeople>=6 && numOfPeople<=12){
                prMonblan+=numOfPeople;

            }else if(numOfPeople>=13 && numOfPeople<=25){
                prKilimandjaro+=numOfPeople;

            }else if(numOfPeople>=26 && numOfPeople<=40){
                prK2+=numOfPeople;

            }else if(numOfPeople>=41 ){
                prEverest+=numOfPeople;

            }
        }
        System.out.printf("%.2f%%%n",prMusala/total*100);
        System.out.printf("%.2f%%%n",prMonblan/total*100);
        System.out.printf("%.2f%%%n",prKilimandjaro/total*100);
        System.out.printf("%.2f%%%n",prK2/total*100);
        System.out.printf("%.2f%%",prEverest/total*100);
    }
}
