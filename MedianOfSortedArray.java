

public class MedianOfSortedArray {

    public static void main(String[] args) {

        int[] nums1 = {1,3};
        int[] nums2 = {2};

        int[] mergedArray = new int[nums1.length + nums2.length];
        for(int i=0;i< nums1.length;i++){
             mergedArray[i] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++) {
            mergedArray[nums1.length + j] = nums2[j];
        }
        int temp = 0;

        for(int i=0;i< mergedArray.length;i++){
            for(int j=i+1;j<mergedArray.length;j++){
                if(mergedArray[i]>mergedArray[j]) {
                    temp = mergedArray[i];
                    mergedArray[i] = mergedArray[j];
                    mergedArray[j] = temp;
                }
            }
        }
        int n = mergedArray.length;
        if (n % 2 == 1)
            System.out.println(mergedArray[n / 2]);
        else
            System.out.println((mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2.0);
    }



}
