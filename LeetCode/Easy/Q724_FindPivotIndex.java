/*Given an array of integers nums, write a method that returns the "pivot" index of this array.
 * We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.
 * If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
 * 
 * @author: Pramod
 */

public class Q724_FindPivotIndex{
    public int pivotIndex(int[] nums) {
        int sum =0;
        int length = nums.length;
        for(int i=0;i<length;i++)
            sum+=nums[i];
        int right = sum;
        int left = 0;
        for(int i=0;i<length;i++){
            int val = nums[i];
            right -= val;
            if (left==right)
                return i;
            left += val;
        }
        return -1;
    }
}