package org.example.abstractclass;

abstract class Ab1Class {

    static void get1() {
        System.out.println("A");
    }

    abstract void getAll();
    protected abstract void getAll2();

}

abstract class Ab2 extends Ab1Class {

    abstract void get2();

    static void get1() {
        System.out.println("Ab2");
    }

}




