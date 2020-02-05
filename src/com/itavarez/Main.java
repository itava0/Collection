package com.itavarez;

import java.util.ArrayList;
import java.util.Arrays;

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
         //Object -> Collections -> List -> ArrayList
        //created array list
        ArrayList<Dogs> dogsArrayList = new ArrayList<Dogs>();
        //I'm converting the dogArr into ArrayList
        dogsArrayList.addAll(Arrays.asList(dogArr));

        dogsArrayList.add(new Dogs("Mutt", 15, true));

        //For each Loop
        for (Dogs d : dogsArrayList) {
            System.out.println(d);
        }

        System.out.println();

        for (Dogs d: dogsArrayList) {
            if(d.getAvgWeight() >= 50) {
                System.out.println(d.getBreed() + " are large");
            } else {
                System.out.println((d.getBreed() + " are small"));
            }
        }

        // If I want to compare strings inside an object I need the equal()
        if(dogsArrayList.get(2).getBreed().equals("Turtle")) {
            System.out.println("Equals");
        } else {
            System.out.println(("Not equals"));
        }
        System.out.println();

        //add elements
        dogsArrayList.add(2, new Dogs("Labrador", 75, false));
        dogsArrayList.forEach(dogs -> System.out.println(dogs));
        System.out.println();

        //Set replace what on that index
        dogsArrayList.set(2, new Dogs("Poodle", 50, true));
        dogsArrayList.forEach(dogs -> System.out.println(dogs));
        System.out.println();

        System.out.println("Size " + dogsArrayList.size());
        System.out.println(dogsArrayList.get(3));
        dogsArrayList.remove(3);
        System.out.println(dogsArrayList.get(3));
        System.out.println();

        //choice in index
        //fixed element type
        //varied length
        System.out.println("*** HashMaps ***");
    }
}
