import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"носок", "рубашка", "галстук", "платок", "носок", "брюки", "пиджак", "платок", "майка", "носок", "пальто", "шляпа", "брюки", "куртка", "рубашка"};

        // Task 1.a
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        // subtask 1.b.
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        // subtask 2
        Phonebook pb = new Phonebook();

        pb.add("Bezos", "81112345678");
        pb.add("Gates", "82223456789");
        pb.add("Buffet", "83339876543");
        pb.add("Buffet", "84449876543");
        pb.add("Arnault", "85552345678");
        pb.add("Ortega", "86669876543");
        pb.add("Ortega", "86652345678");
        pb.add("Ellison", "87779876543");
        pb.add("Zuckerberg", "88882345678");
        pb.add("Zuckerberg", "89999876543");


        System.out.println(pb.get("Buffet"));
        System.out.println(pb.get("Ortega"));
        System.out.println(pb.get("Gates"));


    }
}
