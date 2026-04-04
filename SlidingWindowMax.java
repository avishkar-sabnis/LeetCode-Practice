import java.util.ArrayDeque;

class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];       //result set size is = total size of array - number of elements in window +1;
        int j = 0;
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && nums[queue.getLast()] < nums[i]) {
                queue.removeLast();          //remove the smallest of all elements of window
            }

            queue.addLast(i);               //add the largest of all in queue

            if (queue.getFirst() + k == i) {
                queue.removeFirst();
            }

            if (i >= k - 1) {
                res[j++] = nums[queue.getFirst()];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int res[] = SlidingWindowMaximum.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3);
        for(Integer resultset:res){
            System.out.println(resultset);
        }
    }
}