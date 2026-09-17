class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurence(nums,target);
        int last = lastOccurence(nums,target);
        return new int[]{first,last};
    }
        // lets find the first occurence
        public int firstOccurence(int nums[],int target){
            int low = 0;
            int high= nums.length-1;
            int first=-1;
            while(low<=high){
                int mid = (low+high)/2;
                if(nums[mid]==target){
                    first=mid;
                    high=mid-1;
                }
                else if(nums[mid]<target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            return first;
        }
        // now find the last occurence
        public int lastOccurence(int nums[],int target){
            int low = 0;
            int high = nums.length-1;
            int last = -1;
            while(low<=high){
                int mid = (low+high)/2;
                if(nums[mid]==target){
                    last = mid;
                    low = mid+1;
                }
                else if(nums[mid]<target){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            return last;
        }
}