package Hashmap;

import java.util.*;

public class uniqueElement {
    String name="nandni";
    HashMap<Character,Integer> map=new HashMap<>();
    char[] ch=name.toCharArray();

    public uniqueElement() {
        for(int i=0;i<name.length();i++){
            map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
        }
    }

    public Character findMax() {
        Character maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}
