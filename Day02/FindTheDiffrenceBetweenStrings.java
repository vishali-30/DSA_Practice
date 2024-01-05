import java.util.*;
public class FindTheDiffrenceBetweenStrings {
        public char findTheDifference(String s, String t) {

            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();

            HashMap<Character,Integer> map = new HashMap<>();

            for(int i = 0 ; i < arr2.length; i++) {
                if(map.containsKey(arr2[i])) {
                    map.put(arr2[i], map.get(arr2[i]) + 1);
                } else {
                    map.put(arr2[i], 1);
                }
            }

            for(int j = 0 ; j < arr1.length; j++) {
                if(map.containsKey(arr1[j])) {
                    map.put(arr1[j], map.get(arr1[j]) - 1);
                }
            }

            char res = ' ';
            for(Map.Entry<Character,Integer> e : map.entrySet()) {
                if (e.getValue() > 0) {
                    res = e.getKey();
                    break;
                }
            }
            return res;
        }
    }
    
