import java.util.*;
import java.util.stream.Collectors;

public class HeroesOfCodeAndLogicVII_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Integer> HEROEShp = new TreeMap<>();
        Map<String,Integer> HEROESwp = new TreeMap<>();

        int times=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<times;i++){
            String[]input=scanner.nextLine().split("\\s+");
            String name=input[0];
            int HP=Integer.parseInt(input[1]);
            int MP=Integer.parseInt(input[2]);

            if(!HEROEShp.containsKey(name) && !HEROESwp.containsKey(name)) {
                HEROEShp.put(name,HP);
                HEROESwp.put(name,MP);
            }
        }
        String input2=scanner.nextLine();
        while(!input2.equals("End")){
            String[]commands=input2.split(" - ");
            String cases=commands[0];
            String heroName=commands[1];
            if ("CastSpell".equals(cases)) {
                int neededMP = Integer.parseInt(commands[2]);
                String spellName = commands[3];
                int currentMP = HEROESwp.get(heroName);
                if (currentMP >= neededMP) {
                    currentMP -= neededMP;
                    HEROESwp.put(heroName, currentMP);
                    System.out.printf
                            ("%s has successfully cast %s and now has %d MP!", heroName, spellName, (currentMP));
                    System.out.println();
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!", heroName, spellName);
                    System.out.println();
                }
            } else if ("TakeDamage".equals(cases)) {
                int damage = Integer.parseInt(commands[2]);
                String attacker = commands[3];
                int currentHP = HEROEShp.get(heroName);
                currentHP -= damage;
                HEROEShp.put(heroName, currentHP);
                if ((currentHP) > 0) {
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!",
                            heroName, damage, attacker, (currentHP));
                    System.out.println();
                } else {
                    HEROEShp.remove(heroName);
                    HEROESwp.remove(heroName);
                    System.out.printf("%s has been killed by %s!", heroName, attacker);
                    System.out.println();
                }
            } else if ("Recharge".equals(cases)) {
                int amount = Integer.parseInt(commands[2]);
                int currentMP2 = HEROESwp.get(heroName);
                if (currentMP2 + amount > 200) {
                    HEROESwp.put(heroName, 200);
                    System.out.printf("%s recharged for %d MP!", heroName, (200 - currentMP2));
                    System.out.println();
                } else {
                    HEROESwp.put(heroName, (amount + (HEROESwp.get(heroName))));
                    System.out.printf("%s recharged for %d MP!", heroName, (amount));
                    System.out.println();
                }
            } else if ("Heal".equals(cases)) {
                int amountHP = Integer.parseInt(commands[2]);
                int currentHP2 = HEROEShp.get(heroName);

                if ((currentHP2 + amountHP) > 100) {
                    HEROEShp.put(heroName, 100);
                    System.out.printf("%s healed for %d HP!"
                            , heroName, (100 - (currentHP2)));
                    System.out.println();
                } else {
                    HEROEShp.put(heroName, (currentHP2 + amountHP));
                    System.out.printf("%s healed for %d HP!"
                            , heroName, (amountHP));
                    System.out.println();
                }
            } else {
                throw new IllegalStateException("KUR KUR");
            }
            input2=scanner.nextLine();

        }

        HEROEShp
                .entrySet()
                .stream()
                .sorted((n1, n2) -> n2.getValue().compareTo(n1.getValue()))
                .forEach(n->{
                    String name=n.getKey();
                    int name4=n.getValue();
                    int name5=HEROESwp.get((name));
                    System.out.print(name);
                    System.out.println();
                    System.out.printf("  HP: %d%n",name4);
                    System.out.printf("  MP: %d%n",name5);
                });

    }

}
