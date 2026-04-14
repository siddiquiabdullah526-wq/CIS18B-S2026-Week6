package edu.norcocollege.cis18b.week6.mini01;

import java.util.List;

public class GenericBoxDemo {

    public static <T> T first(List<T> values) {
        if (values == null || values.isEmpty()) {
            throw new IllegalArgumentException("values must contain at least one item");
        }
        return values.get(0);
    }

    // this is implementation of the extension challenge
    public static <T> T last(List<T> values) {
        if (values == null || values.isEmpty()) {
            throw new IllegalArgumentException("values must contain at least one item");
        }
        return values.get(values.size() - 1);
    }

    public static void main(String[] args) {
        Box<String> labelBox = new Box<>();
        labelBox.set("CIS-18B");

        Box<Integer> unitsBox = new Box<>();
        unitsBox.set(4);

        String firstStudent = first(List.of("Ada", "Grace", "Margaret"));
        Integer firstScore = first(List.of(98, 91, 87));

        System.out.println("Label: " + labelBox.get());
        System.out.println("Units: " + unitsBox.get());
        System.out.println("First student: " + firstStudent);
        System.out.println("First score: " + firstScore);
    }
}

