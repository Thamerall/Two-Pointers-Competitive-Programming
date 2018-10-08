import java.util.Stack;

public class BackSpace {
    public static void main(String[] args) {
        String a = "ab#c";
        String b = "ad#c";

        System.out.println(space(a,b));

    }
    public static boolean space(String a , String b ){
        return helper(a).equals(helper(b));
    }
    private static String helper(String s) {
        int index = 0;
        char[] a = s.toCharArray();

        for(int i=0; i<a.length; i++) {
            if(a[i] == '#') {
                if(index > 0) index--;
            } else {
                a[index++] = a[i];
            }
        }

        return new String(a, 0, index);
    }
}
