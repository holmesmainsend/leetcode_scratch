import java.util.List;
import java.util.LinkedList;

public class OneOneNine {
    // Accepted solution from different LeetCode user
    public static void main(String[] args) {
        int rowIndex = 3;

        List<Integer> ret = new LinkedList<Integer>();
        for (int row = 0; row <= rowIndex; row++) {
            ret.add(0, 1);
            for (int i = 1; i < row; i++)
                ret.set(i, ret.get(i) + ret.get(i + 1));
        }
        System.out.println(ret);
    }
}