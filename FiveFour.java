import java.util.*;

// Note to self: see LeetCode for working solution from other contributors
public class FiveFour {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = matrix.length;
        int n = matrix[0].length;
        int totalItems = m * n;
        List<Integer> answer = new ArrayList<>();
        
        int row = 0;
        int column = 0;
        int previousTopRow = -1;
        int previousBottomRow = m;
        int previousInitialColumn = -1;
        int previousFinalColumn = n;
        
        for(int i = 0; i < totalItems; i++) {
            System.out.println(matrix[row][column]);
            answer.add(matrix[row][column]);

            if(row == previousTopRow + 1) {
                if(column != previousFinalColumn - 1) {
                    column++;
                } else {
                    previousTopRow = row;
                    row++;
                }
            } else if(column == previousFinalColumn - 1) {
                if(row != previousBottomRow - 1) {
                    row++;
                } else {
                    previousFinalColumn = column;
                    column--;
                }
            } else if(row == previousBottomRow - 1) {
                if(column != previousInitialColumn - 1) {
                    column--;
                } else {
                    previousBottomRow = row;
                    row--;
                }
            } else if(column == previousInitialColumn + 1) {
                if(row != previousTopRow + 1) {
                    row--;
                } else {
                    previousInitialColumn = column;
                    column++;
                }
            }
        }
    }
}