package ru.dataart.academy.java;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */
    public int getLengthOfLongestSubstring(String checkString) {
        //Brute-force solution, time complexity - O(N^3), memory - O(1)
        int maxLength = 0;
        loop:
        for (int i = 0; i < checkString.length(); i++) {
            for (int j = i + 1; j < checkString.length(); j++) {
                for (int k = j - 1; k >= i; k--) {
                    if (checkString.charAt(k) == checkString.charAt(j)) {
                        maxLength = Math.max(maxLength, j - i);
                        continue loop;
                    }
                }
            }
            maxLength = Math.max(maxLength, checkString.length() - i);
            break;
        }
        return maxLength;
    }

    /* Two pointers + set, time and memory - O(N), but now collections are undesirable(

    public int getLengthOfLongestSubstring(String checkString) {
        int maxLength = 0;
        Collection<Character> substringCharacters = new HashSet<>();
        for (int firstPointer = 0, secondPointer = 0; firstPointer < checkString.length(); firstPointer++) {
            while (secondPointer < checkString.length() && substringCharacters.add(checkString.charAt(secondPointer))) {
                secondPointer++;
            }
            maxLength = Math.max(maxLength, secondPointer - firstPointer);
            substringCharacters.remove(checkString.charAt(firstPointer));
        }
        return maxLength;
    }
    */
}
