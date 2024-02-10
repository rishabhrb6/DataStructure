package BinarySearch;

/*
You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target.
If such a character does not exist, return the first character in letters.

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
 */
public class NextAlphabet {

    public static char nextGreatestLetter(char[] letters, char target) {
        char res = binarySearch(letters, 0, letters.length-1, target, Character.MAX_VALUE);
        if (res == Character.MAX_VALUE) {
            return letters[0];
        }
        return res;

    }

    public static char binarySearch(char[] letters, int start, int end, char target, char res) {

        int mid = start + (end - start) / 2;

        if (start <= end) {
            if (target == letters[mid]) {
                return binarySearch(letters, mid + 1, end, target, res);

            } else if (target < letters[mid]) {
                return binarySearch(letters,start,mid -1, target, Character.compare(res, letters[mid]) > 0 ? letters[mid] : res);
            }
            return binarySearch(letters,mid +1, end, target, res);
        }

    return res;


    }
}
