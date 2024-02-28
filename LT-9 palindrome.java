class Solution {
    public boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
         int s=0;
        int x=n;
        while(n!=0){
           int r = n % 10;
           s=s*10+r;
           n = n / 10;
        }
        return(s==x);
    }
}
