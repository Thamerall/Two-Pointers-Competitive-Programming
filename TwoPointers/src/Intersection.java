import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int [] a = {1,2,3,3,4,5,6};
        int [] b = {3,3,4};
        int[] temp = intersection(a,b);
    for (int  res : temp){
        System.out.print(res+" ");
    }

    }
    public static int[] intersection(int [] a , int [] b){
      HashMap<Integer,Integer> map = new HashMap<>();
      ArrayList<Integer> res = new ArrayList<>();
      for (int i = 0 ; i < a.length; i++){
          if(map.containsKey(a[i])) map.put(a[i],map.get(a[i])+1);
          else map.put(a[i],1);

      }
      for (int i = 0; i < b.length; i++){
          if(map.containsKey(b[i]) && map.get(b[i])>0) {
              res.add(b[i]);
              map.put(b[i],map.get(b[i])-1);
          }
      }
      int [] r = new int[res.size()];
      for (int i = 0 ; i < res.size(); i++){
          r[i] = res.get(i);
      }
      return r;
    }
}
