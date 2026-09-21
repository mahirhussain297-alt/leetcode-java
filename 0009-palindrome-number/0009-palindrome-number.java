class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int reverse=0;
        int ld;
        if(x<0){
            return false;
        }
        while(x>0){
            ld=x%10;
            reverse=reverse*10+ld;
            x=x/10;
        }
        return original==reverse;
    }
}