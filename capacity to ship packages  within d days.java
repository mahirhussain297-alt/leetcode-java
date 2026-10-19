class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = findmax(weights);
        int high=findsum(weights);
        while(low<=high){
            int mid=low+(high-low)/2;
            int reqdays=finddays(weights,mid);
            if(reqdays<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    // function to find max 
    public static int findmax(int weights[]){
        int max=0;
        for(int i=0;i<weights.length;i++){
            max=Math.max(max,weights[i]);
        }
        return max;
    }
    // function to find sum
    public static int findsum(int weights[]){
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
        }
        return sum;
    }
    // function to find requires days
    public static int finddays(int weights[],int cap){
        int days=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>cap){
                days++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return days;
    }
}
