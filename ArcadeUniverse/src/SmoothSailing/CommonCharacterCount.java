package SmoothSailing;

//Given two strings, find the number of common characters between them.
//
// Example:
// For s1 = "aabcc" and s2 = "adcaa", the output should be
// commonCharacterCount(s1, s2) = 3.
//
// Strings have 3 common characters - 2 "a"s and 1 "c".

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonCharacterCount {

public static int commonCharacterCount(String s1, String s2) {

    String[] splitString1 = s1.split("");
    String[] splitString2 = s2.split("");

    Map<String, Integer> stringMap1 = new HashMap<>();
    Map<String, Integer> stringMap2 = new HashMap<>();

    for(int i=0; i<splitString1.length;i++){
            int count = stringMap1.containsKey(splitString1[i]) ? stringMap1.get(splitString1[i]) : 0;
            stringMap1.put(splitString1[i], count+1);
    }

    for(int j=0; j<splitString2.length;j++){
        int count = stringMap2.containsKey(splitString2[j]) ? stringMap2.get(splitString2[j]) : 0;
        stringMap2.put(splitString2[j], count+1);
    }

    int total = 0;

    for(Map.Entry<String, Integer> entry: stringMap1.entrySet()){
        if(stringMap2.containsKey(entry.getKey())){
            total += Math.min(entry.getValue(), stringMap2.get(entry.getKey()));

        }
    }

    return total;

}

    public static void main(String[] args) {

        int checkingCount = commonCharacterCount("aabcc", "adcaa");

        System.out.println(checkingCount);
    }

}
