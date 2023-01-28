import java.util.Arrays;
import java.util.LinkedList;

// public class OneEightNine {
//     public static void main(String[] args) {
//         // Problem specifies that array must have at least length of 1, otherwise would add check here
//         // Problem specifies number of steps k must be >= 0, otherwise would factor left shifts in

//         int[] nums = {1, 2, 3, 4, 5, 6, 7};
//         if(nums.length == 1) {
//             // return nums statement here
//             System.out.println(Arrays.toString(nums));
//         }

//         int steps = 15;
//         int netStepsRight = steps % nums.length;
        
//         if(netStepsRight == 0) {
//             // return nums statement here
//             System.out.println(Arrays.toString(nums));
//         } else {
//             LinkedList<Integer> answer = new LinkedList<>();
//             int currentIndex = nums.length - netStepsRight;

//             while(answer.size() < nums.length) {
//                 answer.addLast(nums[currentIndex]);
//                 currentIndex++;
//                 if(currentIndex == nums.length) {
//                     currentIndex = 0;
//                 }
//             }
    
//             // return answer statement here
//             System.out.println(answer);
//         }
//     }
// }

// Rough first LeetCode accepted submission:
// class Solution {
//     public void rotate(int[] nums, int k) {
//         if(nums.length != 1) {
//             int netStepsRight = k % nums.length;
//             if(netStepsRight != 0) {
//                 int[] answer = new int[nums.length];
//                 int currentIndex = nums.length - netStepsRight;
//                 int i = 0;
//                 while(i < answer.length) {
//                     answer[i] = nums[currentIndex];
//                     currentIndex++;
//                     if(currentIndex == nums.length) {
//                         currentIndex = 0;
//                     }
//                     i++;
//                 }
//                 for(int q = 0; q < nums.length; q++) {
//                     nums[q] = answer[q];
//                 }
//             }
//         }
//     }
// }

// Version of top Java solution from danny6514:
public class OneEightNine {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(nums));

        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, 0, k - 1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}