import java.util.List;
import java.util.ArrayList;

public class OneOneNine {
    // Most return statements would occur where println statements are here
    public static void main(String[] args) {
        int rowIndex = 3;

        List<List<Integer>> listOfLists = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        listOfLists.add(row1);
        if(rowIndex == 0) {
            System.out.println(row1);
        }

        List<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(1);
        listOfLists.add(row2);
        if(rowIndex == 1) {
            System.out.println(row2);
        }

        for(int i = 2; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 0; j < i - 1; j++) {

            }
            row.add(1);
            listOfLists.add(row);
        }

        System.out.println(listOfLists.get(3));
    }
}