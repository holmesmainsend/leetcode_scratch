import java.util.Arrays;

public class BasicKnapsack {
    public static void main(String[] args) {
        // Initialize the item values and weights.
        int P[] = {0, 1, 2, 5, 6};
        int wt[] = {0, 2, 3, 4, 5};
        
        // "Boolean" array
        int x[] = {0, 0, 0, 0, 0};
        
        // Set the maximum weight capacity and number of items.
        int m = 8, n = 4; 

        // Create a 2D array to store the values of the items for each weight capacity.
        int[][] k = new int[5][9]; 
    
        // Initialize the weight index to 0.
        int w = 0;

        // Iterate through each item.
        for (int i = 0; i <= n; i++) { 
            // Iterate through each weight capacity.
            for (w = 0; w <= m; w++) { 
                // If there are no items or no weight capacity, the value is 0.
                if(i==0|| w==0)
                k[i][w] =0;
                // If the weight of the current item is less than or equal to the current weight capacity,
                // then consider the maximum of either including the current item or not including it.
                else if (wt[i] <= w) { 
                    k[i][w] = Math.max(P[i] + k[i - 1][w - wt[i]], k[i - 1][w]); 
                } 
                // If the weight of the current item is greater than the current weight capacity,
                // then exclude the current item and use the value of the previous item at the same weight capacity.
                else {
                    k[i][w] = k[i - 1][w];
                }
            }
        }

        // Print the maximum value that can be obtained using the given weight capacity and items.
        System.out.println(k[n][m]);
        
        
        // Scanning backwards through matrix
        while(n > 0) {
            if(k[n][m] != k[n - 1][m]) {
                x[n] = 1;
                m -= wt[n];
            } else {
                for(int i = n; n > 0; i--) {
                    if(k[i][m] != k[n][m]) {
                        x[i] = 1;
                        break;
                    } else if(k[i][m] == 0) {
                        x[n] = 1;
                        break;
                    }
                }
            }
            n--;
        }
    
        // Printing the three arrays
        System.out.println("P array: " + Arrays.toString(P));
        System.out.println("wt array: " + Arrays.toString(wt));
        System.out.println("x array: " + Arrays.toString(x));
    
        // Calculating totals
        int i = 0, totalProfit = 0, totalWeight = 0;
        while(i < x.length) {
            if(x[i] == 1) {
                totalProfit += P[i];
                totalWeight += wt[i];
            }
            i++;
        }
    
        // Printing totals
        System.out.println("Total profit: " + totalProfit);
        System.out.println("Total weight: " + totalWeight);
        System.out.println("Sum of profit = " + x[0] + "x0 + " + x[1] + "x1 + " + x[2] + "x2 + " + x[3] + "x5 + " + x[4] + "x6 = " + totalProfit);
        System.out.println("Sum of weight = " + x[0] + "x0 + " + x[1] + "x2 + " + x[2] + "x3 + " + x[3] + "x4 + " + x[4] + "x5 = " + totalWeight);
    
    }
}