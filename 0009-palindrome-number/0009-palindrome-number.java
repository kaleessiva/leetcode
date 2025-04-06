class Solution {
    public boolean isPalindrome(int x) {
        int t=0;
        int v=x;
        if(x<0) return false;
        while (x!=0){
            int digit=x%10;
            t = t*10 + digit;
            x = x/10;
        }
        
        if(t==v){
            return true;
        }
          return false;
    }
}