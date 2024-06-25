package org.example.abstractclass;

public class MultiInterfaceWithSameMethodName implements I1, I2 {
    @Override
    public void getAll() {
        I1.super.getAll();
    }
//    @Override
//    public void getAll() {
////        I1.super.getAll();
////        I2.super.getAll();
//
//        System.out.println("MultiInterfaceWithSameMethodName");
//    }
//
//    public static void main(String[] args) {
//        I1 i = new MultiInterfaceWithSameMethodName();
//        i.getAll();
//    }
}


interface I1 {
    default void getAll() {
        System.out.println("I1");
    }
}

interface I2 {
    default void getAll() {
        System.out.println("I2");
    }
}