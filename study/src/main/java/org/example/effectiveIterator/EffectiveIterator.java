package org.example.effectiveIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicInteger;

class EffectiveIterator {
    ArrayList<Integer> list = new ArrayList<>();

    //init list with 1000 elements
    public  EffectiveIterator() {
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
    }

    // method browse using For
    public void browseFor(int times) {
        int temp = 0;
        for (int i = 0; i < times; i++) {
            for (int j = 0; j < list.size(); j++) {
                temp = list.get(j);
            }
        }
    }

    public void browseForEachIterator(int times) {
        final int[] temp = {0};
        list.iterator().forEachRemaining(e -> {
            for (int i = 0; i < times; i++) {
                temp[0] = e;
            }
        });
    }

    // method browse using ForEach
    public void browseForEach(int times) {
        final int[] temp = {0};
        list.forEach(e -> {
            for (int i = 0; i < times; i++) {
                temp[0] = e;
            }
        });
    }

    // method browse using Iterator
    public void browseIterator(int times) {
        final int[] temp = {0};

        Iterator<Integer> integers = list.iterator();
        for (int i = 0; i < times; i++) {
            while (integers.hasNext()) {
                temp[0] = integers.next();
            }
        }
    }

    // method browse using ListIterator
    public void browseListIterator(int times) {
        final int[] temp = {0};

        ListIterator<Integer> listIterator = list.listIterator();
        for (int i = 0; i < times; i++) {
            while (listIterator.hasNext()) {
                temp[0] = listIterator.next();
            }
        }
    }

    public static void main(String[] args) {
        EffectiveIterator checkEffectiveIterator = new EffectiveIterator();

        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();

        start = System.currentTimeMillis();
        checkEffectiveIterator.browseForEach(10000000);
        end = System.currentTimeMillis();
        System.out.println("Time ForEach: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        checkEffectiveIterator.browseForEachIterator(10000000);
        end = System.currentTimeMillis();
        System.out.println("Time ForEachIterator: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        checkEffectiveIterator.browseIterator(10000000);
        end = System.currentTimeMillis();
        System.out.println("Time Iterator: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        checkEffectiveIterator.browseListIterator(10000000);
        end = System.currentTimeMillis();
        System.out.println("Time ListIterator: " + (end - start) + " ms");
    }
}