import java.util.LinkedList;

public class OneEightNine {
    public static void main(String[] args) {
        // Problem specifies that array must have at least length of 1, otherwise would add check here
        // Problem specifies number of steps must be >= 0, otherwise would factor left shifts in

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        // if(nums.length == 1) {
        //     return statement here
        // }

        // In problem itself var steps is called k
        int steps = 6;
        int netSteps = steps % nums.length;
        int currentIndex = nums.length - 1 - netSteps;
        int startIndex = 0;

        LinkedList<Integer> answer = new LinkedList<>();

        while(currentIndex != startIndex) {
            currentIndex++;
            answer.addLast(nums[currentIndex]);
            if(answer.size() == 1) {
                startIndex = currentIndex - 1;
            }

            if(currentIndex == nums.length - 1) {
                currentIndex = -1;
            }
        }

        System.out.println(answer);
    }
}