package ContainerWithMostWater;

class Solution {
    public static int maxArea(int[] height) {
        int ptr1 = 0;
        int ptr2 = height.length - 1;
        int maxArea = 0;
        while(ptr1<ptr2){
            int currentArea = findArea(ptr1, ptr2, height);
            if (currentArea > maxArea){
                maxArea = currentArea;
            }
            if(height[ptr1]< height[ptr2]){
                ptr1++;
            }else{
                ptr2--;
            }
        }
        return maxArea;
    }
    public static int findArea(int index1, int index2, int[] height){
        if (height[index1]<height[index2]){
            return Math.abs(index1-index2)*height[index1];
        }else{
            return Math.abs(index1-index2)*height[index2];
        }
    }
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}