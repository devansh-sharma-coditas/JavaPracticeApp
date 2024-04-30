package org.example.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(201);
        list.add(300);
        list.add(400);
        list.add(500);


        /**
         * Iterator :
         * scenario where we'll get ConcurrentModificationException
         */
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer value = iterator.next();
            if( value % 2 != 0){
            list.remove(value); // this gives exception
//              iterator.remove(); // works fine
            }
        }

        // this works also
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i) %2 != 0) list.remove(i);
//        }
        System.out.println(list);
    }
}
