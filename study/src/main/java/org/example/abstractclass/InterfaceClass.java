package org.example.abstractclass;

public interface InterfaceClass {

    String a = "b";

    void getAll();

    private static void getA() {};

    private void getC() {
        // Code here
    };

}

class Class implements InterfaceClass {
    @Override
    public void getAll() {
        System.out.println("InterfaceClass");
    }
}

abstract class MyClass implements Interface1, Interface2 {
    public void f() { }
    public void g() { }
}

interface Interface1 {
    int VAL_A = 1;
    int VAL_B = 2;

    void f();
    void g();
}

interface Interface2 {
    int VAL_B = 3;
    int VAL_C = 4;

    void g();
    void h();
}

abstract class A implements Interface1 {
    public void f() { }
    public void g() { }

    private final void e() {
        final int a = 1;
    }
}

class B2 extends A {
    @Override
    public void f() {

    }

    @Override
    public void g() {

    }
}