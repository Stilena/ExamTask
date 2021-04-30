import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class Ranking_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> contest = new TreeMap<>();
        int maxPoint=0;
        while (!input.equals("end of contests")) {
            String[] tokens = input.split(":");
            String contests = tokens[0];
            String pass = tokens[1];
            if (!contest.containsKey(contests)) {
                contest.put(contests, pass);
            } else {
                contest.put(contests, pass);
            }
        }
        String command=scanner.nextLine();
        Map<String,List<String>>usernameContest=new TreeMap<>();
        Map<String,Integer>usernamePoint=new TreeMap<>();
        while (!command.equals("end of submissions")){
            String[] types=command.split("=>");
            String typeContest=types[0];
            String typePass=types[1];
            String typeUsername=types[2];
            int typePoints=Integer.parseInt(types[3]);
            boolean isValidContest=false;
            boolean isValidPass=false;
            if (contest.containsKey(typeContest)){
                isValidContest=true;
            }
            if (contest.get(typeContest).equals(typePass)){
                isValidPass=true;
            }
            if (isValidContest && isValidPass){
                usernameContest.put(typeUsername, new ArrayList<>());
                usernamePoint.put(typeUsername,typePoints);
                if (usernameContest.get(typeUsername).contains(typeUsername) && usernameContest.get(typeContest).contains(typeContest)){
                    int newPoints=usernamePoint.get(typeUsername)+typePoints;
                    usernamePoint.put(typeUsername,newPoints);
                }
            }
            command=scanner.nextLine();
        }

    }
}
/* LinkedHashMap<String, String> contests = new LinkedHashMap<>();
        TreeMap<String, LinkedHashMap<String, Integer>> users = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end of contests")) {
            String[] tokens = input.split(":");
            String contest = tokens[0];
            String password = tokens[1];

            if (!contests.containsKey(contest)) {
                contests.put(contest, password);
            } else {
                contests.put(contest, password);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("end of submissions")) {
            String[] tokens = input.split("=>");
            String contest = tokens[0];
            String password = tokens[1];
            String userName = tokens[2];
            int userPoints = Integer.parseInt(tokens[3]);

            if (contests.containsKey(contest)) {
                if (contests.get(contest).equals(password)) {

                    LinkedHashMap<String, Integer> course = new LinkedHashMap<>();
                    course.put(contest, userPoints);

                    if (!users.containsKey(userName)) {
                        users.put(userName, course);
                    } else {
                        if (!users.get(userName).containsKey(contest)) {
                            users.get(userName).put(contest, userPoints);
                        } else {
                            users.get(userName).put(contest, Math.max(userPoints, users.get(userName).get(contest)));
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        int totalSum = 0;
        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : users.entrySet()) {
            int sum = user.getValue().values().stream().mapToInt(i -> i).sum();
            if (sum > totalSum) {
                totalSum = sum;
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : users.entrySet()) {
            if (user.getValue().values().stream().mapToInt(i -> i).sum() == totalSum) {
                System.out.printf("Best candidate is %s with total %d points.%n", user.getKey(), totalSum);
            }
        }

        System.out.println("Ranking:");
        users.forEach((key, value) -> {
            System.out.printf("%s%n", key);
            value.entrySet().stream().
                    sorted((f, s) -> s.getValue() - f.getValue()).
                    forEach(i -> System.out.printf("#  %s -> %d%n", i.getKey(), i.getValue()));
        });
    }
}*/