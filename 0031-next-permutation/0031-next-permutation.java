class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        //step1:find the pivot element
        int pivot = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }
        //step2:if pivot is not exist
        if(pivot==-1){
            reverse(nums,0,n-1);
            return;
        }
        //step3:now the number  greater than pivot
        for(int i=n-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }
        //step4:reverse the part after the pivot
        reverse(nums,pivot+1,n-1);
    }
    // reverse the array
    public static void reverse(int nums[],int start,int end){
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}