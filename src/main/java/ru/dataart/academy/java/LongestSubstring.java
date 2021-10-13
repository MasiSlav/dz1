package ru.dataart.academy.java;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        if (checkString.length() == 0) {
            return 0;
        }
        char[] array = checkString.toCharArray();
        char[] array2 = new char[checkString.length()];
        array2[0] = array[0];
        int count = 0;
        int max = 0;
        for (int i = 0; i < checkString.length(); i++) {
            if (array2[count] != array[i]) {
                count++;
                array2[count] = array[i];
            } else {
                if (i > 1) {
                    count = 0;
                    i -= count - 1;
                }
            }
            for (int j = 0; j < count - 1; j++) {
                if (array2[j] == array[i]) {
                    i -= count - 1;
                    count = 0;
                    array2[count] = array[i];
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max + 1;
    }
}
