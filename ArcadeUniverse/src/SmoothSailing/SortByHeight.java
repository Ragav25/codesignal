package SmoothSailing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class SortByHeight {

    public static int [] sortbyHeight(int [] a){

        ArrayList<Integer> newList = new ArrayList();

        for(int i=0; i<a.length; i++){
            if(a[i] == -1){
                continue;
            } else{
                newList.add(a[i]);
                a[i] = 0;
            }
        }
        Collections.sort(newList);

        Integer [] finalArray = newList.toArray(new Integer[newList.size()]);

        int temp = 0;

        for(int val=0; val<a.length; val++){
            if(a[val] != -1){
                a[val] = finalArray[temp];
                temp++;
            }
        }
        return a;

    }

    public static int[] sortByHeight2(int [] a){

        int flag;

        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] > a[j] && a[i] != -1 && a[j] != -1){

                    flag = a[i];
                    a[i] = a[j];
                    a[j] = flag;
                }
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int [] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        int [] result = sortbyHeight(a);

        for(int num: result){
            System.out.println(num);
        }

    }

}
