import java.util.Arrays;

class FirstAndLastPosInSortednumsay {

    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                while (nums[i] == target && nums[j] == target) {

                    result[i] = i;
                    result[j] = j;

                    j--;
                    i++;
                    break;
                }
            }
        }


        int count = 0;
        for (int val : result) {
            if (val != 0) count++;
        }

        int[] filtered = new int[count];
        int index = 0;
        for (int val : result) {
            if (val != 0) {
                filtered[index++] = val;
            }
        }



        return filtered;
    }
    public static void main(String[] args) {

        FirstAndLastPosInSortednumsay rotatedSortednumsaySearch = new FirstAndLastPosInSortednumsay();
        int[] result = rotatedSortednumsaySearch.searchRange(new int[]{5,7,7,8,8,10}, 6);

        System.out.println(Arrays.toString(result));
    }

}
