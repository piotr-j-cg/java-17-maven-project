package se.kth.compilers;

public class SwitchNullExample {

    public static final String SOME_CASE = "default";

    public static void main(String[] args) {
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
