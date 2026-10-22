class Solution {
    public int splitArray(int[] nums, int k) {
        int low=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>low){
                low=nums[i];
            }
        }
        int high=0;
        for(int i=0;i<nums.length;i++){
            high+=nums[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int subarrays=countsubarrays(nums,mid);
            if(subarrays>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public int countsubarrays(int nums[],int maxsum){
        int subarrays=1;
        int currentsum=0;
        for(int i=0;i<nums.length;i++){
            if(currentsum+nums[i]<=maxsum){
                currentsum+=nums[i];
            }
            else{
                subarrays++;
                currentsum=nums[i];
            }
        }
        return subarrays;
    }
}
