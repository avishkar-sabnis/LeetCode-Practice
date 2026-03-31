public class SearchInsertPosition {


    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else {
                for (int k = 0; k < nums.length; k++) {
                    if (nums[k] >= target) {
                        return k;
                    }
                }
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        int result = SearchInsertPosition.searchInsert(new int[]{1,3,5,6},5);
        System.out.println(result);
    }


}
