import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Snowwhite_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> dwarfHatColor = new TreeMap<>();
        Map<String, Integer> dwarfPhysics = new TreeMap<>();
        while (!input.equals("Once upon a time")) {
            String[] tokens = input.split(" <:> ");
            String name = tokens[0];
            String colorHat = tokens[1];
            int physics = Integer.parseInt(tokens[2]);
            if (!dwarfHatColor.containsKey(name)) {
                dwarfHatColor.put(name, colorHat);
                dwarfPhysics.put(name, physics);
            } else {
                if (dwarfHatColor.containsKey(name) && !dwarfHatColor.containsKey(colorHat)) {
                    dwarfHatColor.put(name, colorHat);
                    dwarfPhysics.put(name, physics);
                }
                input = scanner.nextLine();
            }
        }
        dwarfPhysics.entrySet().stream()
                .sorted((n1, n2) -> {
                    int sort = Integer.compare(n1.getValue(), n2.getValue());
                    if (sort == 0) {
                        String[] color1 = n1.getKey().split(" ");
                        String[] color2 = n2.getKey().split(" ");

                        int size1 = dwarfPhysics.get(color1[0]);
                        int size2 = dwarfPhysics.get(color2[0]);
                        sort = Integer.compare(size2, size1);
                    }
                    return sort;
                }).forEach(pair -> {
            String[] print = pair.getKey().split("\\s+");
            System.out.printf("(%s) %s <-> %d\n", print[0], print[1], pair.getValue());
        });
    }
}
