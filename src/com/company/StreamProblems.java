package com.company;

import java.util.Random;
import java.util.stream.Stream;

public class StreamProblems {
    public static void main(String[] args) {

        /*
        * 1) How to display 10 random numbers using forEach()?
        * */
        //(new Random()).ints().limit(10).forEach(System.out::println);

        /*
        * 2) How can the removed squares be displayed using the map() method?
        * */
        //Stream.of(1, 2, 3, 2, 1, 6, 14, 2).map(s -> s * s).distinct().forEach(System.out::println);

        /*
        * 3) How to display the number of empty lines on the screen using the filter() method?
        * */
        //System.out.println(Stream.of("Hello", "", "", " ", "World", "", "!", "").filter(String::isEmpty).count());

        /*
        * 4) How to display 10 random numbers in ascending order?
        * */
        //(new Random()).ints().limit(10).sorted().forEach(System.out::println);

        /*
        * 5) How to find the maximum number in a set?
        * */
        //System.out.println((Stream.of(5, 3, 4, 55, 2).mapToInt(a ->a).max().getAsInt()));

        /*
        * 6) How to find the minimum number in a set?
        * */
        //System.out.println((Stream.of(5, 3, 4, 55, 2).mapToInt(a ->a).min().getAsInt()));

        /*
        * 7) How to get the sum of all numbers in a set?
        * */
        //System.out.println(Stream.of(5, 3, 4, 55, 2).mapToInt(a -> a).sum());

        /*
        * 8) How to get the average of all numbers?
        * */
        //System.out.println(Stream.of(5, 3, 4, 55, 2).mapToInt(a -> a).average().getAsDouble());

    }


}
