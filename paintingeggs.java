import java.util.Scanner;

public class paintingeggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String size=scanner.nextLine();
        String color=scanner.nextLine();
        int numOfPartida=Integer.parseInt(scanner.nextLine());
        double sum=0;
        double razhodi=0;
        double total=0;
        if(size.equals("Large")){
            if (color.equals("Red")) {
                sum=numOfPartida*16;
                razhodi=sum*0.35;
                total=sum-razhodi;
                System.out.printf("%.2f leva.",total);
            }else if(color.equals("Green")){
                sum=numOfPartida*12;
                razhodi=sum*0.35;
                total=sum-razhodi;
                System.out.printf("%.2f leva.",total);
            }else if(color.equals("Yellow")){
                sum=numOfPartida*9;
                razhodi=sum*0.35;
                total=sum-razhodi;
                System.out.printf("%.2f leva.",total);
            }
        }else if(size.equals("Medium")){
            if (color.equals("Red")) {
                sum=numOfPartida*13;
                razhodi=sum*0.35;
                total=sum-razhodi;
                System.out.printf("%.2f leva.",total);
            }else if(color.equals("Green")){
                sum=numOfPartida*9;
                razhodi=sum*0.35;
                total=sum-razhodi;
                System.out.printf("%.2f leva.",total);
            }else if(color.equals("Yellow")){
                sum=numOfPartida*7;
                razhodi=sum*0.35;
                total=sum-razhodi;
                System.out.printf("%.2f leva.",total);
            }
        }else if(size.equals("Small")){
            if (color.equals("Red")) {
                sum=numOfPartida*9;
                razhodi=sum*0.35;
                total=sum-razhodi;
                System.out.printf("%.2f leva.",total);
            }else if(color.equals("Green")){
                sum=numOfPartida*8;
                razhodi=sum*0.35;
                total=sum-razhodi;
                System.out.printf("%.2f leva.",total);
            }else if(color.equals("Yellow")){
                sum=numOfPartida*5;
                razhodi=sum*0.35;
                total=sum-razhodi;
                System.out.printf("%.2f leva.",total);
            }
        }
    }
}
