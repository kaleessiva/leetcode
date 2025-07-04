class Solution {
    public String reverseWords(String s) {
        String []ch=s.trim().split("\\s+");
        StringBuilder reverse=new StringBuilder();
        for(int i=ch.length-1;i>=0;i--){
            reverse.append(ch[i]);
            if(i!=0)reverse.append(" ");
        }
        return reverse.toString();
    }
}