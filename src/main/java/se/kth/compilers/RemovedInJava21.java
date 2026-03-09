package se.kth.compilers;

public class RemovedInJava21 {
    public void runAll() {
        compiler();
        allowThreadSuspension();
    }

    void compiler() {
        Compiler.enable();
        System.out.println("Compiler.enable() works.");
    }

    void allowThreadSuspension() {
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        boolean ok = group.allowThreadSuspension(true);
        System.out.println("ThreadGroup.allowThreadSuspension(boolean) works - result: " + ok);
    }
}
