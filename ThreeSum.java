import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};

        Set<List<Integer>> resultSet = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){

                    if(nums[i] + nums[j] + nums[k] == 0){

                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);

                        Collections.sort(triplet); 

                        resultSet.add(triplet);
                    }
                }
            }
        }

        System.out.println(resultSet);
    }
}