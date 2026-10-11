class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            low=Math.min(low,bloomDay[i]);
            high=Math.max(high,bloomDay[i]);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    public boolean possible(int bloomDay[],int day,int m,int k){
    int count=0;
    int noofbouquets=0;
    for(int i=0;i<bloomDay.length;i++){
        if(bloomDay[i]<=day){
            count++;
            if(count==k){
                noofbouquets++;
                count=0;
            }
        }
        else{
            count=0;
        }
    }
    return noofbouquets>=m;
}
}


