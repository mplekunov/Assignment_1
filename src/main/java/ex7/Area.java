/*
 *  UCF COP3330 Summer 2021 Assignment 7 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

public class Area {
    private double length;
    private double width;

    public Area(String length, String width) {
        this.length = Double.parseDouble(length);
        this.width = Double.parseDouble(width);
    }

    public Area(int length, int width) {
        this.length = Double.valueOf(length).doubleValue();
        this.width = Double.valueOf(width).doubleValue();
    }

    public Area(float length, float width) {
         this(Float.toString(length), Float.toString(width));
    }

    public Area(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }
}
