package edu.norcocollege.cis18b.week6.mini03;

import java.util.ArrayList;
import java.util.List;

public class WildcardsPecsClinic {

    public static void main(String[] args) {

        // using different Number types (Integer and Double) to show flexibility of ? extends Number
        List<Number> gradedScores = List.of(100, 85.5, 80);
        double total = WildcardUtils.sumAll(gradedScores);

        // Consumer example: method adds Integer values into the list using ? super Integer
        List<Number> practice = new ArrayList<>();
        WildcardUtils.addPracticeScores(practice);

        // copying from a producer (List<Integer>) to a consumer (List<Number>) using PECS
        List<Integer> copySource = List.of(70, 75, 80);
        List<Number> copiedValues = new ArrayList<>();
        WildcardUtils.copyAll(copySource, copiedValues);

        // Invariance reminder: List<Integer> is NOT a subtype of List<Number>, so wildcards are required.
        System.out.printf("Total score: %.1f%n", total);
        System.out.println("After practice adds: " + practice);
        System.out.println("Copied values: " + copiedValues);
    }
}
