import java.util.Arrays;

public class ThreeSumClosest {

    public static void main(String[] args) {

        int[] nums = {3,2,1};
        int pivot = -1;
        int n = nums.length;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            Arrays.sort(nums);
        } else {
            int largestRightmostElement = 0;
            for (int i = n - 1; i > pivot; i--) {
                if (nums[i] > nums[pivot]) {
                    largestRightmostElement = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = largestRightmostElement;
                    break;
                }
            }

            int k = pivot + 1;
            int p = n - 1;
            while (k <= p) {
                largestRightmostElement = nums[k];
                nums[k] = nums[p];
                nums[p] = largestRightmostElement;
                k++;
                p--;
            }
        }

        for (int unit : nums) {
            System.out.println(unit);
        }
    }
}