package days.day1;
/*
DAY 1 — Stream Basics
Learn
stream()
filter()
map()
collect()
forEach()
count()

Easy Integer Questions
Find even numbers
Find odd numbers
Square all numbers
Cube all numbers
Count numbers > 10
Convert strings to uppercase
Convert strings to lowercase
Remove empty strings
Find string lengths
Sum all numbers

 */

import java.util.Arrays;
import java.util.List;

public class Day1 {
    // Q1: Find even numbers
    public static void findEven(int[] numbers){
        Arrays.stream(numbers).filter(number ->number%2==0).forEach(num -> System.out.print(num+" "));
    }

    //Q2: Find odd numbers
    public static void findOdd(int[] numbers){
        Arrays.stream(numbers).filter(
                number -> number%2 !=0
        ).forEach(number ->System.out.print(number+ " "));
    }

    //Q3: Square all numbers
    public static void square(int[] numbers){
        Arrays.stream(numbers).map(num -> num*num).forEach(num-> System.out.print(num+" "));
    }

    //Q4: Cube all numbers
    public static void cube(int[] numbers){
        Arrays.stream(numbers).map(num ->num*num*num).forEach(num-> System.out.print(num+" "));
    }

    //Q5: Count numbers > 10
    public static void countGreaterThan10(int[] numbers){
        long count = Arrays.stream(numbers).filter(n->n>10).count();
        System.out.println("Numbers greater than 10:  " +count);
    }

    //Q6: Convert strings to uppercase
    public static void upperCase(List<String> names){
        names.stream().map(String::toUpperCase).forEach(name -> System.out.print(name+" "));

    }

    //Q7: Convert strings to lowercase
    public static void lowerCase(List<String> names){
        names.stream().map(String::toLowerCase).forEach(name-> System.out.print(name+" "));
    }

    //Q8: Remove empty strings
    public static void removeEmptyString(List<String> names){
        names.stream().filter(name->!name.isEmpty()).forEach(name-> System.out.print(name+" "));
    }

    //Q9: Find string length
    public static void findStringLength(List<String> names){
        names.stream().map(String::length).forEach(length-> System.out.print(length+" "));
    }

    //Q10: Sum all numbers
    public static void sumAllNumbers(int[] numbers){
        int sum = Arrays.stream(numbers).reduce(0, Integer::sum);
        System.out.println("Sum of all numbers:  " +sum);
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 40, 5, 6,33, 74, 8, 9, 10};
        findEven(numbers);
        System.out.println();
        findOdd(numbers);
        System.out.println();
        square(numbers);
        System.out.println();
        cube(numbers);
        System.out.println();
        countGreaterThan10(numbers);
        System.out.println();

        List<String> names = List.of("Jane", "John", "", "Sara", "Mike", "Tom", "");
        upperCase(names);
        System.out.println();
        lowerCase(names);
        System.out.println();
        removeEmptyString(names);
        System.out.println();
        findStringLength(names);
        System.out.println();
        sumAllNumbers(numbers);


    }
}
