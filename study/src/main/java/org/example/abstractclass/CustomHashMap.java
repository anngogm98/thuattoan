package org.example.abstractclass;

import java.security.Provider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class CustomHashMap {

    public static void main(String[] args) {
        var a = new Hashtable<Long, String>();

        a.put(1L,"2");

        System.out.println(a);

        var b = new HashMap<>();
        ArrayList c = new ArrayList();
        Thread t = new Thread();
        t.start();

//        c.stream().map()
//        ConcurrentHashMap
//        HashSet
//        StringBuffer
//        Consumer
//        Supplier
//        CopyOnWriteArrayList
    }
}
