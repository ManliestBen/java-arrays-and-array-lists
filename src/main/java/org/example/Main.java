package org.example;

import java.util.ArrayList;
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

//        if (indexOf4 >=0) {
//            System.out.println("Looking for 4, found value " + primeNums[indexOf4] + " at index " + indexOf4);
//        } else {
//            System.out.println("No element matched the search criteria.");
//        }

        // adding elements to arrays
        String[] favFoods = {"tacos", "waffles", "cheese"};
        // this will cause a problem, as array lengths are fixed
//        favFoods[3] = "Kool Aid";

        // one way to handle it is by making a new array
        String[] moreFavFoods = new String[4];
        System.arraycopy(favFoods, 0, moreFavFoods, 0, 3);
        moreFavFoods[3] = "Kool Aid";
//        System.out.println(Arrays.toString(moreFavFoods));

        // collections are a better way to handle that issue
        ArrayList<String> betterFavFoods = new ArrayList<>();
        // add an element
        betterFavFoods.add("tacos");
        betterFavFoods.add("waffles");
        betterFavFoods.add("cheese");
//        System.out.println(betterFavFoods);

        // add using index
        betterFavFoods.add(2, "ice cream");
//        System.out.println(betterFavFoods);

        // replace at an index
        betterFavFoods.set(0, "carnitas");
//        System.out.println(betterFavFoods);

        // search for element
        int indexOfCheese = betterFavFoods.indexOf("cheese");
//        if (indexOfCheese >= 0) {
//            System.out.println(betterFavFoods.get(indexOfCheese));
//        } else {
//            System.out.println("cheese not found");
//        }

        // check number of elements
//        System.out.println(betterFavFoods.size());

        ArrayList<String> carList = new ArrayList<>();
        // instead of adding one by one, use this
        carList.addAll(Arrays.asList("Honda Civic", "Audi Q5", "Toyota Rav 4", "Hyundai Elantra", "Acura NSX"));
//        System.out.println(carList);

//        for (int i = 0; i < carList.size(); i++) {
//            System.out.println("index " + i + " is " + carList.get(i));
//        }

        // enhanced for loop (cleaner, but no access to index directly)
//        for (String car : carList) {
//            System.out.println(car);
//        }

        int[] someNums = {3, 5, 6, 8};
        System.out.println(someNums.length);

        ArrayList<String> thingsInNYC = new ArrayList<>();
        thingsInNYC.addAll(Arrays.asList("pigeon", "pizza rat", "regular rat"));

        for (String wildlife : thingsInNYC) {
            System.out.println("Look at that crazy " + wildlife + " on the streets of NYC.");
        }
    }
}
