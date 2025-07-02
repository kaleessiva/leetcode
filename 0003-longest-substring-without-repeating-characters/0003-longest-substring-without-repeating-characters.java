class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character>list=new ArrayList<>();
        int count=0;
        int less=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(list.contains(ch)){
                list.remove(0);
                less++;
            }
            list.add(ch);
            count = Math.max(count, list.size());
        }
        return count;
    }
}