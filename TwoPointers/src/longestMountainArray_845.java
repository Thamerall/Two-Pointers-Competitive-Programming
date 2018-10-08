public class longestMountainArray_845 {
    public static void main(String[] args) {
        int a [] = {2,1,4,7,3,2,5};

        System.out.println(longest(a));
    }
    public static int longest(int []a){
       int res = 0 , up = 0 , down = 0;
       for (int i = 1; i < a.length; ++i) {
           if (down > 0 && a[i - 1] < a[i] || a[i - 1] == a[i]) up = down = 0;
           if (a[i - 1] < a[i]) up++;
           if (a[i - 1] > a[i]) down++;
           if (up > 0 && down > 0 && up + down + 1 > res) res = up + down + 1;
       }
       return res;
       }
}
