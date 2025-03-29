package edu.redko;

/*
  @author User
  @project lab2
  @class Circle
  @version 1.0.0
  @since 29.03.2025 - 11.26
*/

import java.util.Objects;

public class Circle {

    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circle circle)) return false;
        return Double.compare(getRadius(), circle.getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getRadius());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public boolean isLargerThan(Circle other) {
        return this.getArea() > other.getArea();
    }
}
