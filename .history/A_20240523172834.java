
public class A {
    protected void msg() {
        System.out.println("Hello");
    }
}

Main File:/
save by B.java
package mypack
;

import pack.*;

class B extends A {
    public static void main(String args[]) {
        B obj = new B();
        obj.msg();
    }
}