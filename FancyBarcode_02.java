import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class FancyBarcode_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBarcode = Integer.parseInt(scanner.nextLine());
        String regex = "^@#+(?=[A-Z])(?<barcode>[A-Za-z0-9]{6,})(?<=[A-Z])@#+$";
        Pattern pattern = Pattern.compile(regex);

        //String regex1 = "[0-9]+";
        for (int i = 0; i < numberOfBarcode; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            String numberInBarcode = "";
            if (matcher.find()) {
                for (int j = 0; j <barcode.length() ; j++) {
                    char currentSymbol=barcode.charAt(j);
                    if (Character.isDigit(currentSymbol)) {
                        numberInBarcode=numberInBarcode+currentSymbol;
                    }
                }
                if (numberInBarcode.isEmpty()){
                    System.out.println("Product group: 00");
                }else{
                    System.out.println("Product group: " + numberInBarcode);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}