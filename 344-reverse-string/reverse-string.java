class Solution {
    public void reverseString(char[] s) {
        int i=0, j=s.length-1;
        if(s.length <= 1) return;
        while(i<j){
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            i++;
            j--;
        }
    }
}