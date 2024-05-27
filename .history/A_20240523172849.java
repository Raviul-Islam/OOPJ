public class A {
    protected void msg() {
        System.out.println("Hello");
    }
}

class B extends A {
    public static void main(String args[]) {
        B obj = new B();
        obj.msg();
    }
}