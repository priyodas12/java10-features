package com.priyotech;

import java.util.*;

public class UnmodifiableCollections {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("a","b","c","d");

        List<String> copyStringList=List.copyOf(stringList);
        System.out.println(copyStringList);
        /*copyStringList.add("e");//UnsupportedOperationException
        System.out.println(copyStringList);*/


        Set<String> stringSet= new HashSet<>(Arrays.asList("a","b","c","d"));

        Map<String,Long> stringMap= new HashMap<>();
        stringMap.put("a",10L);
        stringMap.put("b",11L);
        stringMap.put("c",12L);


    }
}
