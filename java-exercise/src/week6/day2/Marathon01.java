package week6.day2;

import java.util.HashMap;
import java.util.Map;

public class Marathon01 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hashmap = new HashMap<>();
        for (String s : participant) {
            if (hashmap.containsKey(s)) {
                hashmap.put(s,hashmap.get(s)+1);
            }
            else
                hashmap.put(s,1);
        }
        for (String s : completion) {
            hashmap.put(s,hashmap.get(s)-1);
        }
        for (String key:hashmap.keySet()) {
            if (hashmap.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }
}
