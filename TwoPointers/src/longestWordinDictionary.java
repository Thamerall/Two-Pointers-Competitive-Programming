import java.util.ArrayList;
import java.util.List;

public class longestWordinDictionary {
    public static void main(String[] args) {
        String a = "abpcplea";
        List<String> list = new ArrayList<>();
        list.add("ale");
        list.add("apple");
        list.add("monkey");
        list.add("plea");


        System.out.println(longestWord(a,list));
    }
    public static String longestWord(String s, List<String> d){

        String res = "";
        for (String str: d) {
            if ((str.length() > res.length() || str.length() == res.length() && str.compareTo(res) < 0) && isSub(s, str))
                res = str;
        }

        return res;
    }

    public static boolean isSub(String s, String t) {
        int l = 0; int j = -1;
        while (l < t.length()) {
            if ((j = s.indexOf(t.charAt(l++), j + 1)) < 0) return false;
        }
        return true;

    }
}
