import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days=Integer.parseInt(scanner.nextLine());
        int hours=Integer.parseInt(scanner.nextLine());

        double total=0;
        for (int i = 1; i <=days ; i++) {
            double sum=0;
            for (int j = 1; j <=hours ; j++) {
                if(i%2==0){
                    if(j%2==1){
                        sum+=2.5;
                    }else{
                        sum+=1;
                    }

                }
                if(i%2==1){
                    if(j%2==0){
                        sum+=1.25;
                    }else{
                        sum+=1;
                    }
                }
            }
            System.out.printf("Day: %d - %.2f leva%n",i,sum);
            total+=sum;
        }
        System.out.printf("Total: %.2f leva",total);
    }
}
