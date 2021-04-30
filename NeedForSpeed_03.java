import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NeedForSpeed_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numbersOfCars=Integer.parseInt(scanner.nextLine());
        Map<String,Integer>carMiles=new TreeMap<>();
        Map<String,Integer>carFuel=new TreeMap<>();
        for (int i = 1; i <=numbersOfCars ; i++) {
            String[] tokens=scanner.nextLine().split("\\|");
            String nameCar=tokens[0];
            int carMileage=Integer.parseInt(tokens[1]);
            int currentCarFuel=Integer.parseInt(tokens[2]);
            carMiles.put(nameCar,carMileage);
            carFuel.put(nameCar,currentCarFuel);
        }
        String command=scanner.nextLine();
        while (!command.equals("Stop")){
            String [] input=command.split(" : ");
            String nameCommand=input[0];
            String car=input[1];
            switch (nameCommand){
                case "Drive":
                    int fuel=carFuel.get(car);
                    int mileage=carMiles.get(car);
                    int currentDistance=Integer.parseInt(input[2]);
                    int currentFuel=Integer.parseInt(input[3]);
                    if (currentFuel>fuel){
                        System.out.println("Not enough fuel to make that ride");
                    }else{

                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",car,currentDistance,currentFuel);
                    }
                   // int decrease=fuel-currentFuel;
                    int increase=mileage+currentDistance;
                        if (increase>100000){
                            System.out.printf("Time to sell the %s!%n",car);
                            carMiles.remove(car);
                        }

                    break;
                case "Refuel":
                    int fuelCar=Integer.parseInt(input[2]);
                    int fuelEnough=carFuel.get(car);
                  //  int differenceFuel=fuelEnough-fuelCar;
                    fuelEnough+=fuelCar;
                    if (fuelEnough>=75){
                        fuelCar=(fuelEnough-75)-fuelCar;
                                fuelCar=75;
                    }
                    carFuel.replace(car,fuelEnough);
                    System.out.printf("%s refueled with %d liters%n",car,fuelCar);
                    break;
                case"Revert":
                    int kilometers=Integer.parseInt(input[2]);
                    int mileageCar=carMiles.get(car);
                    mileageCar=mileageCar-kilometers;

                    if (mileageCar<10000){
                        mileageCar=10000;
                        carMiles.replace(car,mileageCar);
                    }else {
                        System.out.printf("%s mileage decreased by %d kilometers%n",car,kilometers);
                    }
                    //carFuel.replace(car,mileageCar);
                    break;
            }
            command=scanner.nextLine();
        }
        carMiles.entrySet().stream().sorted((n1, n2) -> n2.getValue().compareTo(n1.getValue()))
                .forEach(n->{
                    String name=n.getKey();
                    int mileage=carMiles.get(name);
                    int fuel=carFuel.get(name);
                    System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",name,mileage,fuel);
                });
    }
}
