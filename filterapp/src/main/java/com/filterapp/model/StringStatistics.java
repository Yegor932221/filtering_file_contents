package com.filterapp.model;

public class StringStatistics extends Statistics {
    private int shortestLength;
    private int longestLength;

    public int getShortestLength() {
        return shortestLength;
    }

    public void setShortestLength(int shortestLength) {
        this.shortestLength = shortestLength;
    }

    public int getLongestLength() {
        return longestLength;
    }

    public void setLongestLength(int longestLength) {
        this.longestLength = longestLength;
    }
}