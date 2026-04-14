package edu.norcocollege.cis18b.week6.mini03;

import java.util.List;

public final class WildcardUtils {

    private WildcardUtils() {
    }
      // producer method: reads values from the list, so we utilize ? extends Number (PECS: Producer Extends)
    public static double sumAll(List<? extends Number> values) {
        double total = 0.0;
        for (Number value : values) {
            total += value.doubleValue();
        }
        return total;
    }

    // PECS: consumer takes values, so use ? super Integer.
    public static void addPracticeScores(List<? super Integer> values) {
        values.add(70);
        values.add(75);
        values.add(80);
    }
      // this is the implementation of the extension challenge
    public static <T> void copyAll(List<? extends T> source, List<? super T> target) {
        target.addAll(source);
    }
}

