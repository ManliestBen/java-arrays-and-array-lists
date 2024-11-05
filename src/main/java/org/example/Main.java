package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        myArray[3] = 4;
        myArray[7] = 34;
//        System.out.println(Arrays.toString(myArray));

        int[] primeNums = {5, 3, 11, 7, 2};

        // get an element
        int firstPrime = primeNums[0];
//        System.out.println(firstPrime + " is the first element (0 index)");

        // sort it
        Arrays.sort(primeNums);
//        System.out.println(Arrays.toString(primeNums));

        // length property
//        System.out.println(primeNums.length);

        // search for value in array (returns -1 if not found)
        int indexOf11 = Arrays.binarySearch(primeNums, 11);
//        System.out.println(indexOf11);

        // use error handling if checking for an element that may not exist
        int indexOf4 = Arrays.binarySearch(primeNums, 4);

        if (indexOf4 >=0) {
            System.out.println("Looking for 4, found value " + primeNums[indexOf4] + " at index " + indexOf4);
        } else {
            System.out.println("No element matched the search criteria.");
        }
    }
}
