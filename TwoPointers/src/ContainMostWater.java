public class ContainMostWater {
    public static void main(String[] args) {
        int [] a = {1,8,6,2,5,4,8,3,7};

        System.out.println(containWater(a));
    }
    public static int containWater(int [] a) {
        int max = 0, l = 0, r = a.length - 1;
        while (l < r) {
            max = Math.max(max, Math.min(a[l], a[r]) * (r - l));
            if (a[l] < a[r])
                l++;
            else
                r--;

            }
            return max;
        }
    }

