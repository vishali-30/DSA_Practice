public class IsSubSequence {
        public boolean isSubsequence(String s, String t) {
            int i = 0;
            for (char ch : t.toCharArray()) {
                if (i < s.length() && ch == s.charAt(i)) {
                    i++;
                }
            }
            return i == s.length();
        }
    }

