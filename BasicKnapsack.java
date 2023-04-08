public class BasicKnapsack {
    public static void main(String[] args) {
        // Initialize the item values and weights.
        int P[] = {0,1, 2, 5, 6};
        int wt[] = {0,2, 3, 4, 5};
        
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
}
}