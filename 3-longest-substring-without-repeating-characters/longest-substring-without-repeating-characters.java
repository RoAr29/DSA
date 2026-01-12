class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, max = 0;
        boolean[] seen = new boolean[128];

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (seen[c]) {
                seen[s.charAt(left)] = false;
                left++;
            }

            seen[c] = true;
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
