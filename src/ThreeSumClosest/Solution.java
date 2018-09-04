package ThreeSumClosest;

import java.util.Arrays;

/**
 * Created by komes on 9/4/2018.
 */
class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        int closestSum = 0;
        int closestDiff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i=0; i <nums.length-2; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int currentSum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(target - currentSum);
                if (diff == 0){return currentSum;}
                if (diff < closestDiff){
                    closestSum = currentSum;
                    closestDiff = diff;
                }
                if(currentSum<target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return closestSum;
    }
    public static void main (String[] args){
        int[] array = {-1,2,1,-4};
        System.out.println(threeSumClosest(array, 1));
    }
}