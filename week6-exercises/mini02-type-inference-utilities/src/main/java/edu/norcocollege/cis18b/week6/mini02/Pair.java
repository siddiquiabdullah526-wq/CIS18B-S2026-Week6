package edu.norcocollege.cis18b.week6.mini02;

public record Pair<L, R>(L left, R right) {

    @Override
    public String toString() {
        return "(" + left + ", " + right + ")";
    }
}
