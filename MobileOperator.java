import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dogovor=scanner.nextLine();
        String typeOfDogovor=scanner.nextLine();
        String mobInt=scanner.nextLine();
        int months=Integer.parseInt(scanner.nextLine());
        double sum=0;
        if(dogovor.equals("one")){
            if(typeOfDogovor.equals("Small")){
               sum=9.98;
                if(mobInt.equals("yes")){
                    sum+=5.50;
                }
                sum*=months;
                System.out.printf("%.2f lv.",sum);
            }else if(typeOfDogovor.equals("Middle")){
                sum=18.99;
                if(mobInt.equals("yes")){
                    sum+=4.35;
                }
                sum*=months;
                System.out.printf("%.2f lv.",sum);
            }else if(typeOfDogovor.equals("Large")){
                sum=25.98;
                if(mobInt.equals("yes")){
                    sum+=4.35;
                }
                sum*=months;
                System.out.printf("%.2f lv.",sum);
            }else if(typeOfDogovor.equals("ExtraLarge")){
                sum=35.99;
                if(mobInt.equals("yes")){
                    sum+=3.85;
                }
                sum*=months;
                System.out.printf("%.2f lv.",sum);
            }
        }
       else if(dogovor.equals("two")){
            if(typeOfDogovor.equals("Small")){
                sum=8.58;
                if(mobInt.equals("yes")){
                    sum+=5.50;
                }
                sum*=months;
                sum=sum-sum*0.0375;
                System.out.printf("%.2f lv.",sum);
            }else if(typeOfDogovor.equals("Middle")){
                sum=17.09;
                if(mobInt.equals("yes")){
                    sum+=4.35;
                }
                sum*=months;
                sum=sum-sum*0.0375;
                System.out.printf("%.2f lv.",sum);
            }else if(typeOfDogovor.equals("Large")){
                sum=23.59;
                if(mobInt.equals("yes")){
                    sum+=4.35;
                }
                sum*=months;
                sum=sum-sum*0.0375;
                System.out.printf("%.2f lv.",sum);
            }else if(typeOfDogovor.equals("ExtraLarge")){
                sum=31.79;
                if(mobInt.equals("yes")){
                    sum+=3.85;
                }
                sum*=months;
                sum=sum-sum*0.0375;
                System.out.printf("%.2f lv.",sum);
            }
        }
    }
}
