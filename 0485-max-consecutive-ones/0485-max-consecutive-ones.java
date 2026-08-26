class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi =0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxi =Math.max(maxi,count);
            } else{
                count =0;
            }
        }
        return maxi;

        
    }
}