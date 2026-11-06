class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int ind1=(n-1)/2;
        int ind2=n/2;
        int i=0;
        int j=0;
         int count=0;
         int el1=-1;
         int el2=-1;

         while(i<n1&&j<n2){
            int val;
            if(nums1[i]<nums2[j]){
                val=nums1[i];
                i++;
            }
            else{
                val=nums2[j];
                j++;
            }
            if(count==ind1){
                el1=val;
            }
            if(count==ind2){
                el2=val;
            }
            count++;
         }
         while(i<n1){
            int val=nums1[i];
            if(count==ind1){
                el1=val;
            }
            if(count==ind2){
                el2=val;
            }
            count++;
            i++;
         }
         while(j<n2){
            int val=nums2[j];
            if(count==ind1){
                el1=val;
            }
            if(count==ind2){
                el2=val;
            }
            count++;
            j++;
         }
         return(el1+el2)/2.0;
        
    }
}
