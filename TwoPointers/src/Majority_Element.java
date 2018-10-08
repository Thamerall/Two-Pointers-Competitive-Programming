import java.util.HashMap;
import java.util.*;

public class Majority_Element {
    public static void main(String[] args) {
        int[] a = {4,2,1,3,4,2};

        System.out.println(majorityElement(a));


    }




    public static int majorityElement(int[] a) {

        Arrays.sort(a);
        int max = a[0];
        for (int i = 0 ; i <  a.length; i++){
            if(a[i] < max);
            max = a[i];

        }
        return max;
    }
    public static void swap(int [] a, int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
