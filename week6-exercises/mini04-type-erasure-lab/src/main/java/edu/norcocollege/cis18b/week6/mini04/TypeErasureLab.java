package edu.norcocollege.cis18b.week6.mini04;

import java.util.ArrayList;
import java.util.List;

public class TypeErasureLab {

    public static void main(String[] args) {
        List<String> courseNames = new ArrayList<>();
        List<Integer> sectionCounts = new ArrayList<>();

        boolean sameRuntimeClass = courseNames.getClass() == sectionCounts.getClass();
        boolean listInstanceCheck = courseNames instanceof List;

        // Type erasure removes generic type arguments at runtime, so both lists share the same runtime class
        // illegal example avoided: you can't write "courseNames instanceof List<String>".
        System.out.println("Same runtime class: " + sameRuntimeClass);
        System.out.println("List is instance of java.util.List: " + listInstanceCheck);
        System.out.println("Course token simple name: " + TypeTokenPrinter.simpleNameOf(String.class));
    }
}
