package com.itavarez;

import java.util.*;

public class Main {

    public static void main(String[] args) {

	    //fixed element type
        //fixed length
        //fixed index
        System.out.println("*** Arrays ***");
//        Dogs dogArr[]; // Old way of creating an Array
//        dogArr = new Dogs[5]; // specifying the length => 0- 4 index
        Dogs[] dogArr = new Dogs[5];
        dogArr[0] = new Dogs("springer", 50, false);
        dogArr[1] = new Dogs("Bulldog", 50, true);
        dogArr[2] = new Dogs("collie", 50, false);
        dogArr[3] = new Dogs("Chihuahua", 5, false);
        dogArr[4] = new Dogs("Corgie", 35, true);

        for(int i = 0; i < dogArr.length; i++) {
            System.out.println(dogArr[i]);
        }

        System.out.println(" Breed 3 good for apartment?" + dogArr[3].isApartment());
        System.out.println("\nprint out arrays");
        System.out.println(dogArr.toString()); // prints out the pointer in memory
        System.out.println(Arrays.toString(dogArr)); // Quick way of seeing the array
        //fixed element type
        // varied length
        //fixed index
        System.out.println("*** ArrayList ***");

        //choice in index
        //fixed element type
        //varied length
        System.out.println("*** HashMaps ***");
    }
}
