package edu.norcocollege.cis18b.week6.mini04;

public final class TypeTokenPrinter {

    private TypeTokenPrinter() {
    }

    // this is implementation of the extension challenge
    // Because of type erasure, API logging and diagnostics usually cannot see generic type arguments at runtime
    // unless a Class<T> token or similar metadata is passed explicitly.
    public static <T> String simpleNameOf(Class<T> token) {
        return token.getSimpleName();
    }
}
