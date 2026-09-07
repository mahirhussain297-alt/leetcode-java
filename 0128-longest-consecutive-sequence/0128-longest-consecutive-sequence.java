class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int largest = 1;
        int lastsmaller = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-1==lastsmaller){
                count++;
                lastsmaller=nums[i];
            }
            else if(nums[i]==lastsmaller){
                continue;
            }
            else{
                count = 1;
                lastsmaller = nums[i];
            }
            largest = Math.max(largest,count);
        }
        return largest;
        
    }
}