/*
 *  UCF COP3330 Summer 2021 Assignment 9 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

public class PaintCalculator {
    private double area;
    private final static int areaCoveredByGallon = 350;

    public PaintCalculator(double length, double width) {
        this.area = length * width;
    }

    public int getGallonsOfPaint() {
        return area % areaCoveredByGallon > 0 ? (int)area / areaCoveredByGallon + 1 : (int)area / areaCoveredByGallon;
    }

    public double getArea() { return this.area;}
}
