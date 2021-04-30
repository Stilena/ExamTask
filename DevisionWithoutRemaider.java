import java.util.Scanner;

public class DevisionWithoutRemaider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int count1=0;
        int count2=0;
        int count3=0;
        for (int i = 1; i <=n ; i++) {
            int number=Integer.parseInt(scanner.nextLine());
            if(number%2==0){
                count1++;
            }
            if(number%3==0){
                count2++;
            }
            if(number%4==0){
                count3++;
            }
        }
        System.out.printf("%.2f%%%n",count1*1.0/n*100);
        System.out.printf("%.2f%%%n",count2*1.0/n*100);
        System.out.printf("%.2f%%",count3*1.0/n*100);
    }
}
