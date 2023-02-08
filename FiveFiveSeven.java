import java.util.Arrays;

public class FiveFiveSeven {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        char[] a = s.toCharArray();
        System.out.println(Arrays.toString(a));
        int i = 0, j = 0, n = a.length;

        while(i < n) {
            while(i < j || i < n && a[i] == ' ') i++;
            while(j < i || j < n && a[j] != ' ') j++;
            reverse(a, i, j - 1);
        }

        System.out.println(new String(a).substring(0, n));
    }

    public static void reverse(char[] a, int i, int j) {
        while(i < j) {
            char temp = a[i];
            a[i++] = a[j];
            a[j--] = temp;
        }
    }
}