public class RemoveDubs_II {
    public static void main(String[] args) {
        int a[] = {1,1, 1, 1, 2, 2, 3, 3};
        System.out.println(dubs(a));
    }

    public static int dubs(int[] a) {
        int i = 0;
        for (int n : a) {
            if (i < 2 || n > a[i - 2])
                a[i++] = n;

        }
        return i;
    }

}



