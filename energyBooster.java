import java.util.Scanner;

public class energyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine();
        String size=scanner.nextLine();
        double sum=0;
        int num =Integer.parseInt(scanner.nextLine());
        if(size.equals("small")){
            if(text.equals("Watermelon")){
                sum=2*56*num;
            }else if(text.equals("Mango")){
               sum=2*36.66*num;
            }else if(text.equals("Pineapple")){
               sum=2*42.10*num;
            }else if(text.equals("Raspberry")){
                sum=2*20*num;
            }
        }else if(size.equals("big")){
            if(text.equals("Watermelon")){
                sum=5*28.70*num;
            }else if(text.equals("Mango")){
                sum=5*19.60*num;
            }else if(text.equals("Pineapple")){
                sum=5*24.80*num;
            }else if(text.equals("Raspberry")){
                sum=5*15.20*num;
            }
        }
        if(sum>=400 && sum<=1000){
            sum=sum-sum*0.15;
        }else if(sum>1000){
            sum=sum/2;
        }
        System.out.printf("%.2f lv.",sum);
    }
}
