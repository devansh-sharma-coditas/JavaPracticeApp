package org.example.sort.test;

import java.util.*;

class SortingBySize implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
public class Runner {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("flower","flow","flight");
        System.out.println((strs));

        Collections.sort(strs , new SortingBySize());
        System.out.println((strs));
    }
}
