package Hashmap;

import java.util.*;

public class getPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Map<String, List<Integer>> map = new HashMap<>();
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!map.containsKey(word)) {
                map.put(word, new ArrayList<>());
            }
            map.get(word).add(i);
        }

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue());
            System.out.println();
        }
    }
}
