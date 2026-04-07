import java.util.ArrayDeque;

class SlidingWindowMaximum {
    public static void maxSlidingWindow(int[] nums, int target) {
        int i=0;
        while(i!=nums.length){
            if(nums[i]+nums[i+1]==target) {
                System.out.println(i + " " + (i + 1));
                break;
            }
            else
                i++;
        }


    }

    public static void main(String[] args) {
        SlidingWindowMaximum.maxSlidingWindow(new int[]{3,3},6);

    }
}