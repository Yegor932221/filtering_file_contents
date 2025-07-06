package com.filterapp.model;

public class FloatStatistics extends Statistics {
    private double min;
    private double max;
    private double sum;

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getAverage() {
        return getCount() > 0 ? sum / getCount() : 0.0;
    }
}