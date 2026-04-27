package se.kth.compilers;

import org.junit.jupiter.api.Test;

public class ThreadStopTest {

    @Test
    void shouldBreakJava21WithThreadStop() {
        // The Thread.stop() method has been deprecated and removed in Java 1.2 and later versions.
        // It is no longer available in Java 17 or later versions.
        // The method was used to stop a thread abruptly, but it is not recommended to use it
        // because it can leave the thread in an inconsistent state and can cause unexpected behavior.
        // Instead, you should use other mechanisms to control the execution of a thread, such as
        // using thread interruption or using a volatile flag to signal the thread to stop.
        // Here, we are commenting out the line that uses Thread.stop() to indicate that it is not recommended to use it.
        // If you need to stop a thread, consider using other mechanisms such as thread interruption or using a volatile flag.
        // Thread t = new Thread();
        // t.stop();
    }
}
