class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        for(i=0;i<s.length/2;i++,j--){
            char temp =s[j];
            s[j]=s[i];
            s[i]=temp;            
        }
    }
}