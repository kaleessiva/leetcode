class Solution {
    public String longestPalindrome(String s) {
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= 1; j++) { 
                int left = i;
                int right = i + j;

                while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                    left--;
                    right++;
                }

                String sub = s.substring(left + 1, right);
                if (sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        return longest;
    }
}