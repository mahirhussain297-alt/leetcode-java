class Solution {
    public String reverseWords(String s) {
        String words[]=s.trim().split("\\s+");
        int start=0;
        int end=words.length-1;
        while(start<end){
            String temp=words[start];
            words[start]=words[end];
            words[end]=temp;
            start++;
            end--;
        }
        return String.join(" ",words);
    }
}
