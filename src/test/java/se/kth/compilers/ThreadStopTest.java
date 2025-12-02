package se.kth.compilers;

import org.junit.jupiter.api.Test;

public class ThreadStopTest {

    @Test
    void shouldBreakJava21WithThreadStop() {
        Thread t = new Thread();
        t.stop();
    }
}
