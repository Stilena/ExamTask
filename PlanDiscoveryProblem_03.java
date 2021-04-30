import java.util.*;

public class PlanDiscoveryProblem_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countPants = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> plantsList = new LinkedHashMap<>();
        for (int i = 0; i < countPants; i++) {
            String[] input = scanner.nextLine().split("<->");
            String plant = input[0];
            Double rarity = Double.parseDouble(input[1]);
            plantsList.put(plant, new ArrayList<>());
            plantsList.get(plant).add(0, rarity);


        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String[] commandSplit = command.split(": ");
            String typeCommand = commandSplit[0];
            String plant = commandSplit[1];

            switch (typeCommand) {

                case "Rate":
                    String[] input=plant.split(" - ");
                    double rating = Double.parseDouble(input[1]);

                    if (plantsList.containsKey(plant)) {
                        plantsList.get(plant).add(rating);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    input=plant.split(" - ");
                    double rarity = Double.parseDouble(input[1]);
                    if (plantsList.containsKey(plant)) {
                        plantsList.get(plant).set(0, rarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    input=plant.split(" - ");
                    if (plantsList.containsKey(plant)) {
                        double oldRarity = plantsList.get(plant).get(0);
                        plantsList.get(plant).clear();
                        plantsList.get(plant).add(oldRarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantsList.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().get(3).compareTo(e1.getValue().get(3)))
                .sorted((e1, e2) -> e2.getValue().get(0).compareTo(e1.getValue().get(0)))
                .forEachOrdered(e -> {
                    System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n", e.getKey(), e.getValue().get(0), e.getValue().get(3));
                });
    }
}
