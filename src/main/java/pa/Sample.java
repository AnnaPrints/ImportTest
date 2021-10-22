package pa;

public class Sample {

    Sample sample;

    public void foo() {

    }

    public static void main(String[] args) {
        new Sample().foo();
        new Sample().foo();

    }

    private static boolean equalIgnoringCase(String s, String t) {
        if (s == t) return true;
        if (s != null && t != null) {
            return s.equalsIgnoreCase(t);
        }
        return false;
    }
}
