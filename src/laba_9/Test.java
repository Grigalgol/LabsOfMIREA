package laba_9;

public class Test {
    public static void main(String[] args) throws Exception {
        Exception1 ex = new Exception1();
        ex.exceptionDemo();

        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();

        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.printDetails("1");
        throwsDemo.printDetails(null);

        ThrowsDemo2 throwsDemo2 = new ThrowsDemo2();
        throwsDemo2.getKey();
    }
}
