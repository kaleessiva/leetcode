class Solution {
    public int sumOfEncryptedInt(int[] nums) {
         int sum = 0;
        for (int num : nums) {
            int max = 0, len = 0, n = num;
            while (n > 0) {
                max = Math.max(max, n % 10);
                len++;
                n /= 10;
            }
            int encrypted = 0;
            while (len-- > 0)
                encrypted = encrypted * 10 + max;

            sum += encrypted;
        }
        return sum;
    }
}