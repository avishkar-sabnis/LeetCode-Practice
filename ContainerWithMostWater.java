public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] nums = {1,8,6,2,5,4,8,3,7};

        int index = 0;
        int indexOfLastElement = nums.length - 1;

        int maxArea = 0;

        while (index < indexOfLastElement) {

            int yAxisScore = Math.min(nums[index], nums[indexOfLastElement]);
            int xAxisScore = indexOfLastElement - index;

            int area = yAxisScore * xAxisScore;

            if (area > maxArea) {
                maxArea = area;
            }

            if (nums[index] < nums[indexOfLastElement]) {
                index++;
            } else {
                indexOfLastElement--;
            }
        }

        System.out.println(maxArea);
    }
}