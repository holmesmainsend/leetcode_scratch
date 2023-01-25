import java.util.Arrays;
import java.util.LinkedList;

public class OneEightNine {
    public static void main(String[] args) {
        // Problem specifies that array must have at least length of 1, otherwise would add check here
        // Problem specifies number of steps k must be >= 0, otherwise would factor left shifts in

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        if(nums.length == 1) {
            // return nums statement here
            System.out.println(Arrays.toString(nums));
        }

        int steps = 15;
        int netStepsRight = steps % nums.length;
        
        if(netStepsRight == 0) {
            // return nums statement here
            System.out.println(Arrays.toString(nums));
        } else {
            LinkedList<Integer> answer = new LinkedList<>();
            int currentIndex = nums.length - netStepsRight;

            while(answer.size() < nums.length) {
                answer.addLast(nums[currentIndex]);
                currentIndex++;
                if(currentIndex == nums.length) {
                    currentIndex = 0;
                }
            }
    
            // return answer statement here
            System.out.println(answer);
        }
    }
}