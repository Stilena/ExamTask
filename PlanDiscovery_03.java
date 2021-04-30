import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlanDiscovery_03 {
    public static void main(String[] args) {
    /*    Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String,Integer>plantsInformation= new TreeMap<>();
        Map<String,Integer>plantsRarity= new TreeMap<>();

        for (int i = 1; i <=n ; i++) {
            String[] information=scanner.nextLine().split("<->");
            String name=information[0];
            int number=Integer.parseInt(information[1]);
            plantsInformation.put(name,number);
        }
        String command=scanner.nextLine();
        while (!command.equals("Exhibition")){
            String[] input=command.split(": ");
            String informationCommand=input[0];
            String items=input[1];
            if (informationCommand.equals("Rate")){
                String[] splitItems=items.split(" - ");
                String plant=splitItems[0];
                int rating=Integer.parseInt(splitItems[1]);
                plantsInformation.put(plant,rating);
            }else if(informationCommand.equals("Update")){
                String[] splitItems=items.split(" - ");
                String plant=splitItems[0];
                int newRarity=Integer.parseInt(splitItems[1]);
                plantsRarity.put(plant,newRarity);
            }else if(informationCommand.equals("Reset")){
                plantsInformation.replace(items,0);
            }
            //System.out.println(plantsInformation);
            command=scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
    }
}*/
        Scanner scan = new Scanner(System.in);

        int receivedInfo = Integer.parseInt(scan.nextLine());

        Map<String, List<Double>> plantData = new LinkedHashMap<>();
        for (int i = 0; i < receivedInfo; i++) {
            String[] plantInfo = scan.nextLine().split("<->");
            String plant = plantInfo[0];
            double rarity = Double.parseDouble(plantInfo[1]);
            plantData.put(plant, Arrays.asList(rarity, 0.0, 0.0, 0.0));
        }
        double ratingOrRarity = 0.0;
        String commands = scan.nextLine();
        while (!commands.equals("Exhibition")) {
            String regex = "(?<command>[A-Z][a-z]+): (?<plant>[A-Z][a-z]+)( - (?<rate>\\d+))?";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(commands);

            while (matcher.find()) {
                String command = matcher.group("command");
                String plant = matcher.group("plant");
                if (command.equals("Rate") || command.equals("Update")) {
                    ratingOrRarity = Double.parseDouble(matcher.group("rate"));
                }

                switch (command) {
                    case "Rate":
                        if (plantData.containsKey(plant)) {
                            double oldRating = plantData.get(plant).get(1);
                            plantData.get(plant).set(1, (ratingOrRarity + oldRating));
                            double oldCount = plantData.get(plant).get(2);
                            plantData.get(plant).set(2, (oldCount + 1));
                            plantData.get(plant).set(3, (plantData.get(plant).get(1) / plantData.get(plant).get(2)));
                        } else {
                            System.out.println("error");
                        }
                        break;
                    case "Update":
                        if (plantData.containsKey(plant)) {
                            plantData.get(plant).set(0, ratingOrRarity);
                        } else {
                            System.out.println("error");
                        }
                        break;
                    case "Reset":
                        if (plantData.containsKey(plant)) {
                            plantData.get(plant).set(1, 0.0);
                            plantData.get(plant).set(3, 0.0);
                        } else {
                            System.out.println("error");
                        }
                        break;
                }
            }
            commands = scan.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantData.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().get(3).compareTo(e1.getValue().get(3)))
                .sorted((e1, e2) -> e2.getValue().get(0).compareTo(e1.getValue().get(0)))
                .forEachOrdered(e -> {
                    System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n", e.getKey(), e.getValue().get(0), e.getValue().get(3));
                });
    }
}