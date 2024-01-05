public class FirstNonRepeatingCharacter {
        public int firstUniqChar(String s) {
            for (int i = 0; i < s.length(); i++) {
                boolean isRepeat = false;
                for (int j = 0; j < s.length(); j++) {
                    if (i != j) {
                        if (s.charAt(i) == s.charAt(j)) {
                            isRepeat = true;
                            break;
                        }
                    }
                }
                if (!isRepeat) {
                    return i;
                }
            }
            return -1;
        }
    }
