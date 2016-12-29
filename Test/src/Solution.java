/**
 * Created by sekhar on 26/12/16.
 */
public class Solution {

    public int solution(String s) {
        int i = 0;
        int longestStart = 0;
        int longestEnd = 0;
        while (i < s.length()) {
            // Skip past all the digits.
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                ++i;
            }

            // i now points to the start of a substring
            // or one past the end of the string.
            int start = i;

            // Keep a flag to record if there is an uppercase character.
            boolean hasUppercase = false;

            // Increment i until you hit another digit or the end of the string.
            while (i < s.length() && !Character.isDigit(s.charAt(i))) {
                hasUppercase |= Character.isUpperCase(s.charAt(i));
                ++i;
            }

            // Check if this is longer than the longest so far.
            if (hasUppercase && i - start > longestEnd - longestStart) {
                longestEnd = i;
                longestStart = start;
            }
        }
        return s.substring(longestStart, longestEnd).length()>0?s.substring(longestStart, longestEnd).length():-1;
    }
    public static void main (String[] args) throws Exception
    {
        Solution sol = new Solution();
        System.out.println("---->"+sol.solution("a0bb"));
    }
}
