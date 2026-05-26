package days.day3;

import java.util.List;

/*
|--------------------------------------------------------------------------
| DAY 3 — Stream API + Strings
|--------------------------------------------------------------------------
|
| Topics to Learn
| ----------------
| 1. chars()
|    - Convert String -> IntStream of characters
|
| 2. Collectors.joining()
|    - Join strings with delimiter/prefix/suffix
|
| 3. Frequency Pattern (MOST IMPORTANT)
|    - Used in:
|      * duplicate elements
|      * unique elements
|      * word count
|      * character count
|      * first non-repeating element
|      * anagram problems
|
|
| Questions to Practice
| ---------------------
| 1. Count vowels
| 2. Reverse words using streams
| 3. Find duplicate characters
| 4. Find first non-repeating character
| 5. Character frequency map
| 6. Word frequency map
| 7. Join strings with comma
| 8. Find palindrome strings
| 9. Find longest word
| 10. Sort words alphabetically
|
|
| MOST IMPORTANT PATTERN
| ----------------------
|
| Collectors.groupingBy(
|     Function.identity(),
|     Collectors.counting()
| )
|
| Why Important?
| --------------
| This is the core frequency-counting pattern in Stream API.
|
| It creates:
|      element -> count
|
| Example:
| --------
| Input:
|     "programming"
|
| Output:
|     {
|       p=1,
|       r=2,
|       o=1,
|       g=2,
|       a=1,
|       m=2,
|       i=1,
|       n=1
|     }
|
|
| Core Stream Pattern
| -------------------
| Convert -> Transform -> Group -> Filter -> Collect
|
| This pattern repeats in:
| - DSA problems
| - Interview questions
| - Real-world backend development
| - Log processing
| - Analytics systems
|
|--------------------------------------------------------------------------
*/
public class Day3 {

    //Q1: Count vowels
    public static int countVowel(String str){
        return 0;
    }
    //Q2: Reverse words using streams
    public static String reverseWords(String str){
        return "";
    }
    //Q3: Find duplicate characters
    public static String findDuplicateCharacters(String str){
        return "";
    }
    //Q4: Find first non-repeating character
    public static String findFirstNonRepeatingCharacter(String str){
        return "";
    }
    //Q5: Character frequency map
    public static String characterFrequencyMap(String str){
        return "";
    }
    //Q6: Word frequency map
    public static String wordFrequencyMap(String str){
        return "";
    }
    //Q7: Join strings with comma
    public static String joinStrings(String str){
        return "";
    }
    //Q8: Find palindrome strings
    public static String findPalindromeStrings(String str){
        return "";
    }
    //Q9: Find longest word
    public static String findLongestWord(String str){
        return "";
    }
    //Q10: Sort words alphabetically
    public static String sortWordsAlphabetically(String str){
        return "";
    }

    public static void main(String[] args) {
        String str = "brownfoxjumpsoverthelazydog";
        List<String> names = List.of("John", "Jane", "John", "Bob", "Jane", "Sarah");
        List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry");
        List<String> checkPalindrome = List.of("racecar", "hello", "level", "world", "madam");

    }
}
