import java.util.List;
import java.util.ArrayList;

public class OneOneNine {
    // Most return statements would occur where println statements are here
    public static void main(String[] args) {
        int rowIndex = 3;

        List<List<Integer>> listOfLists = new ArrayList<>();

        // Adding rows 0 and 1 manually, to focus the loops on all additional rows
        List<Integer> row0 = new ArrayList<>();
        row0.add(1);
        listOfLists.add(row0);
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(1);
        listOfLists.add(row1);

        for(int i = 2; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int cellIndex = 1; cellIndex < i; cellIndex++) {
                Integer cellValue = listOfLists.get(0);
                row.add(cellValue);
            }
            row.add(1);
        }

        System.out.println(listOfLists.get(rowIndex));
    }
}