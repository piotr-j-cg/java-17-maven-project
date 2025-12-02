package se.kth.compilers;

import org.junit.jupiter.api.Test;

public class SwitchNullTest {

    public static final String SOME_CASE = "default";

    @Test
    public void switchNullShouldFailOnJava21() {
        String value = getNull();
        switch (value) {
            case null: // ✅ Valid in Java 17
                System.out.println("Null case");
                break;
            case SOME_CASE:
                System.out.println("Some case");
                break;
            default:
                System.out.println("Default case");
        }
    }

    private static String getNull() {
        return alwaysTrue() ? null : SOME_CASE;
    }

    private static boolean alwaysTrue() {
        return (System.currentTimeMillis() % 2) >= 0;
    }
}
