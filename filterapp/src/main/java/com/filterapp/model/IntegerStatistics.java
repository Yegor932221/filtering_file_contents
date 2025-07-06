package com.filterapp.model;

public class IntegerStatistics extends Statistics {
    private int min;
    private int max;
    private long sum;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public double getAverage() {
        return getCount() > 0 ? (double) sum / getCount() : 0.0;
    }
}
