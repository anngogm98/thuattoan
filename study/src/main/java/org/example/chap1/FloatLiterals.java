package org.example.chap1;

public class FloatLiterals {

    static void f(Object... obj) {
        System.out.println(obj[0]);
    }

    public static void main(String[] args) {
        f((Object) new double[] {1,2});
    }
}
