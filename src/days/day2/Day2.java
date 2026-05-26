package days.day2;

import entity.Employee;
import service.EmployeeService;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
 * DAY 2 — Intermediate Stream Operations
 *
 * Topics Covered:
 * - distinct()
 * - sorted()
 * - limit()
 * - skip()
 * - peek()
 *
 * Practice Questions:
 * 1. Remove duplicate elements
 * 2. Sort elements in ascending order
 * 3. Sort elements in descending order
 * 4. Get the first 3 elements
 * 5. Skip the first 5 elements
 * 6. Find the top 3 highest numbers
 * 7. Find the second largest number
 * 8. Find unique characters in a string
 * 9. Sort strings by their length
 * 10. Find the longest string
 *
 * Important Concept:
 * Comparator Basics
 *
 * Learn:
 * - Comparator.naturalOrder()
 * - Comparator.reverseOrder()
 * - Comparator.comparing()
 */
public class Day2 {
    static EmployeeService es = new EmployeeService();

    //Q1: Remove duplicate elements
    public static List<Integer> removeDuplicate(List<Integer> numbers){
        return numbers.stream().distinct().toList();
    }
    //Q2: Sort elements in ascending order
    public static List<Integer> sortAsc(List<Integer> numbers){
        return numbers.stream().sorted().toList();
    }
    //Q3:
    public static List<Integer> sortDesc(List<Integer> numbers){
        return numbers.stream().sorted(Comparator.reverseOrder()).toList();
    }
    //Q4:
    public static List<Integer> firstThree(List<Integer> numbers){
        return numbers.stream().limit(3).toList();
    }
    //Q5:
    public static List<Integer> skipFirstFive(List<Integer> numbers){
        return numbers.stream().skip(5).toList();
    }
    //Q6: Find the top 3 highest numbers
    public static List<Integer> topThreeHighest(List<Integer> numbers){
        return numbers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
    }
    //Q7: Find the second largest number
    public static Optional<Integer> secondLargest(List<Integer> numbers){
        return numbers.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).findFirst();
    }
    //Q8: Find unique characters in a string
    public static List<Character> uniqueChars(String str){
       return str.chars().distinct().mapToObj(c->(char)c).toList();
    }
    //Q9: Sort strings by their length
    public static List<String> sortByLength(List<String> names){
        return names.stream().sorted(Comparator.comparing(String::length)).toList();
    }
    //Q10: Find the longest string
    public static String longestString(List<String> names){
        return names.stream().max(Comparator.comparing(String::length)).orElse(null);
    }

    public static void main(String[] arge){
        List<String> names = List.of("John", "Jane", "John", "Bob", "Jane", "Sarah");
        List<Integer> numbers = List.of(32, 15, 8, 42, 27,8, 9, 38, 12, 61, 5);
        String word = "hello";
        System.out.println("Original: " + numbers);
        System.out.println("After removal of duplicate: "+removeDuplicate(numbers));
        System.out.println("Sort Ascending: "+sortAsc(numbers));
        System.out.println("Sort Descending: "+sortDesc(numbers));
        System.out.println("First Three: "+firstThree(numbers));
        System.out.println("Skip First Five: "+skipFirstFive(numbers));
        System.out.println("Top Three Highest: "+topThreeHighest(numbers));
        System.out.println("Second Largest: "+secondLargest(numbers).orElse(-1));
        System.out.println("Unique Characters: "+uniqueChars(word));
        System.out.println("Sort by Length: "+sortByLength(names));
        System.out.println("Longest String: "+longestString(names));
    }
}
