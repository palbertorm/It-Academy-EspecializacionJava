package org.example;

public class GenericMethods<T> {
    private T a;
    private T b;
    private T c;

    public GenericMethods(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void toPrint(){
        System.out.println(" arg 1 " + a);
        System.out.println("arg 2 " + b);
        System.out.println("arg 3 " + c);
    }
}
