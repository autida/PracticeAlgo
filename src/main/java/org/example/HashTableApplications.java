package org.example;

import java.util.HashMap;

public class HashTableApplications {
    public static char method1(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) {
            if(map.containsKey(c)) {
                int count = map.get(c) + 1;
                map.put(c, count);
            } else {
                map.put(c, 1);
            }
        }
        for(char c: map.keySet()) {
            if(map.get(c) == 1) {
                return c;
            }
        }
        return '_';
    }
}
