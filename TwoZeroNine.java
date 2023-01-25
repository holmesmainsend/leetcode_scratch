import java.util.Arrays;

public class TwoZeroNine {
    public static void main(String[] args) {
        int target = 213;
        int[] nums = {12,28,83,4,25,26,25,2,25,25,25,12};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int sum = 0;
        for(int i = nums.length - 1; i > -1; i--) {
            sum += nums[i];
            System.out.println(sum);
            if(sum >= target) {
                System.out.println(nums.length - i);
                break;
            }
        }
        if(sum < target) System.out.println(0);
        else System.out.println(nums.length);
    }
}