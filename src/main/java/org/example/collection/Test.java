package org.example.collection;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /**
         *  fixed size | can't add ,can't remove
         *  not even modify elements
         */
//        List<Integer> integers = List.of(10, 12, 14, 15);
//        System.out.println(integers);
//
//        System.out.println("adding element ");
////        integers.add(20);
////        integers.remove(10);
////        integers.set(1,120);
//        System.out.println(integers);


        /**
         *  fixed size | can't add ,can't remove
         *  but can modify elements
         */
        List<Integer> integers = Arrays.asList(10, 12, 14, 15);
        System.out.println(integers);

        System.out.println("adding element ");
//        integers.add(20);
//        integers.remove(10);
        integers.set(1,integers.get(1)+1000); // allowed : modification of element
        System.out.println(integers);
    }
}
