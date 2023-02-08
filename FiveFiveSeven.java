import java.util.Arrays;

public class FiveFiveSeven {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        char[] a = s.toCharArray();
        System.out.println(Arrays.toString(a));
        int i = 0, j = a.length - 1;
        while(i < j) {
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
        System.out.println(new String(a).substring(0, i));
    }
}