import java.util.*;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        Map<String, Integer>peopleHealth=new TreeMap<>();
        Map<String,Integer>peopleEnergy=new TreeMap<>();

        while (!text.equals("Results")){
            String[]tokens=text.split(":");
            String command=tokens[0];
            if (command.equals("Add")) {
                String name=tokens[1];
                int health=Integer.parseInt(tokens[2]);
                int energy=Integer.parseInt(tokens[3]);
                if (!peopleHealth.containsKey(name) ){

                    peopleHealth.put(name,health);
                    peopleEnergy.put(name,energy);
                }else {
                    int increase=peopleHealth.get(name);
                    peopleHealth.replace(name,increase+health);
                }
            }else if (command.equals("Attack")){
                String attackerName=tokens[1];
                String defenderName=tokens[2];
                int damage=Integer.parseInt(tokens[3]);
                if (peopleHealth.containsKey(attackerName) && peopleHealth.containsKey(defenderName)){
                    int defHealthNew=peopleHealth.get(defenderName);
                    int attackNew=peopleEnergy.get(attackerName);
                    peopleHealth.replace(defenderName,defHealthNew-damage);
                    peopleEnergy.replace(attackerName,attackNew-1);
                    if ((attackNew-1)<=0){

                        peopleEnergy.remove(attackerName);
                        peopleHealth.remove(attackerName);
                        System.out.printf("%s was disqualified!%n",attackerName);
                    }
                    if ((defHealthNew-damage)<=0){

                        peopleHealth.remove(defenderName);
                        peopleEnergy.remove(defenderName);
                        System.out.printf("%s was disqualified!%n",defenderName);
                    }
                }
            }else if (command.equals("Delete")){
                String name=tokens[1];
                if (name.equals("All")){

                    peopleEnergy.clear();
                    peopleHealth.clear();
                }else{

                    peopleEnergy.remove(name);
                    peopleHealth.remove(name);
                }

            }
            text=scanner.nextLine();
        }
        System.out.println("People count: "+ peopleHealth.size());
        peopleHealth.entrySet().stream().sorted((a,b)->b.getValue().compareTo(a.getValue()))
               // .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(entry->{
                    String name=entry.getKey();
                    int energy=peopleEnergy.get(name);
                    int health=peopleHealth.get(name);
                    System.out.printf("%s - %d - %d%n",name,health,energy);
                });
    }
}
