package InterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GoogleQuestions {
    /**
     * Given an array a that contains only numbers in the range from 1 to a.length,
     * find the first duplicate number for which the second occurrence has the minimal index.
     * In other words, if there are more than 1 duplicated numbers,
     * return the number for which the second occurrence has a smaller index than the second occurrence of the other number does.
     * If there are no such elements, return -1.
     */

    public static int firstDuplicate(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    return a[i];
                }
            }
        }
        return -1;
    }
   public  int firstDuplicateHash(int[] duplicateArray) {
        HashSet<Integer> integerHashSet = new HashSet<Integer>();
        for (int currentIndex : duplicateArray) {
            if (integerHashSet.contains(currentIndex)) {
                return currentIndex;
            } else {
                integerHashSet.add(currentIndex);
            }
        }
        return -1;

    }



    public static char  nonRepeatingChar(String s) {
        int firstIndex = 0;
        char[] firstList = new char[26];
        byte[] foundList = new byte[26];

        for (int index = 0; index < s.length(); index++) {
            int ch = s.charAt(index) - 'a';
            if (foundList[ch] == 0) {
                firstList[firstIndex++] = (char) ch;
                foundList[ch] = 1;
            } else {
                foundList[ch] = -1;
            }
        }

        for (int index = 0; index < firstIndex; index++) {
            if (foundList[firstList[index]] == 1) {
                return (char) (firstList[index] + 'a');
            }
        }

        return '_';

    }




}
