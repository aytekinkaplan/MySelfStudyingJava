package OOP.Examples002;

import java.util.Arrays;

public class Car {
    private String make;
    private int year;
    private double price;
    private String color;

    private String[] parts;

    public Car(String make, int year, double price, String color, String[] parts) {
        this.make = make;
        this.year = year;
        this.price = price;
        this.color = color;
        this.parts = parts;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getParts() {
        return parts;
    }

    public void setParts(String[] parts) {
        this.parts = parts;
    }

    @Override
    public String toString() {
        return "make='" + make + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", parts=" + Arrays.toString(parts);
    }
}
