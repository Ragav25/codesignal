package SmoothSailing;

//Given an array of strings, return another array containing all of its longest strings.
//
// Example:
//For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
//allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

import java.util.*;

public class AllLongestString {

    public static String[] allLongestStrings(String[] inputArray) {

        int temp = 0;
        ArrayList<String> finalArray = new ArrayList<>();

        for(int i =0; i<inputArray.length; i++){
            if(inputArray[i].length() > temp) {
                finalArray.clear();
            }

            if(inputArray[i].length() > temp || inputArray[i].length() == temp){
                temp = inputArray[i].length();
                finalArray.add(inputArray[i]);

            }

        }

        String[] array = finalArray.toArray(new String[finalArray.size()]);

        return array;
   }

    public static void main(String[] args) {
        String[] inputArray = {"aa", "aba", "ad", "ac", "vcd", "abc"};

        String [] output = allLongestStrings(inputArray);

        for(String value: output){
            System.out.println(value);
        }
    }

}
