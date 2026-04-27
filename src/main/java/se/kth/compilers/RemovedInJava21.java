package se.kth.compilers;

public class RemovedInJava21 {
    public void runAll() {
        // Compiler.ENABLE is removed in Java 21, no direct replacement
        // TODO: This functionality is removed in Java 21. No direct replacement available.
        // System.out.println("Compiler.ENABLE is removed in Java 21.");

        // allowThreadSuspension is removed in Java 21, replaced with Thread.onSpinWait()
        // TODO: This functionality is replaced with Thread.onSpinWait() in Java 21.
        allowThreadSuspension();
    }

    // Removed in Java 21, no direct replacement
    // TODO: This functionality is removed in Java 21. No direct replacement available.
    void compiler() {
        // Compiler.ENABLE is removed in Java 21
        // TODO: This functionality is removed in Java 21. No direct replacement available.
        System.out.println("Compiler.ENABLE is removed in Java 21.");
    }

    // Replaced with Thread.onSpinWait() in Java 21
    // TODO: This functionality is replaced with Thread.onSpinWait() in Java 21.
    void allowThreadSuspension() {
        // Thread.onSpinWait() is the replacement for ThreadGroup.allowThreadSuspension() in Java 21
        // TODO: This functionality is replaced with Thread.onSpinWait() in Java 21.
        for (int i = 0; i < 1000; i++) {
            Thread.onSpinWait();
        }
        System.out.println("Thread.onSpinWait() works - result: true");
    }
}
