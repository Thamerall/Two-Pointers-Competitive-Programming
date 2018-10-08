import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Intersection_349 {
    public static void main(String[] args) {
        int [] a = {1,2,2,3,1};
        int [] b = {2,2,3};
        a = intersection(a,b);
        b = intersection(a,b);

        for (int i = 0 ; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
    public static int[] intersection(int [] a, int [] b){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0 ; i < a.length; i++){
            list.add(a[i]);
        }
        for (int i = 0 ; i < b.length; i++){
            if (list.contains(b[i])){
               res.add(b[i]);
            }
        }
        int[] ans = new int[res.size()];
        int i = 0;
        for (Integer num : res){
            ans[i++] = num;
        }
        return ans;
    }
}
