package com.example.mq.controller;

import java.util.*;

public class MyCollection {
    public void testHashMap(){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(3, "a");
        map.put(1, "b");
        map.put(2, "d");
        map.put(5, "e");
        map.put(9, "c");
        System.out.println(map);
        int k ;
        String v ;
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            k = iterator.next();
            v = map.get(k) ;
            System.out.println(k+":"+v);
        }


    }

    public void testTreeMap(){
        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1,"ad") ;
        map.put(6,"pp") ;


        map.put(5,"ad");
        map.put(2,"ac") ;
        System.out.println(map);
        int k ;
        String v ;
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            k = iterator.next();
            v = map.get(k) ;
            System.out.println(k+":"+v);
        }
    }


    public void testHashSet(){
        Set<String> set = new HashSet<>() ;
        set.add("a");
        set.add("b");
        set.add("c");

        Iterator<String> i = set.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


    }
    public static void main(String[] args) {

        MyCollection myCollection = new MyCollection() ;
        //myCollection.testHashMap();
        //myCollection.testTreeMap();
        myCollection.testHashSet();

    }
}
