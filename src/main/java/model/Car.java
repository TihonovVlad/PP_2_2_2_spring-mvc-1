package model;

public class Car {
    private final String brand;
    private String color;
    private final int year;

    public Car(String model, String color, int year) {
        this.brand = model;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }
}
