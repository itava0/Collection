package com.itavarez;

public class Main {

    public static void main(String[] args) {

	    //fixed element type
        //fixed length
        //fixed index
        System.out.println("*** Arrays ***");
//        Dogs dogArr[];
//        dogArr = new Dogs[5]; // 0- 4 index
        Dogs[] dogArr = new Dogs[5];
        dogArr[0] = new Dogs("springer", 50, false);
        dogArr[4] = new Dogs("Corgie", 35, true);
        for(int i = 0; i < dogArr.length; i++) {
            System.out.println(dogArr[i]);
        }

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
