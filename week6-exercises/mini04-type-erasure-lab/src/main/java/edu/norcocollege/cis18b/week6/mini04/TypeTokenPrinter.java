package edu.norcocollege.cis18b.week6.mini04;

public final class TypeTokenPrinter {

    private TypeTokenPrinter() {
    }

    public static <T> String simpleNameOf(Class<T> token) {
        return token.getSimpleName();
    }
}
