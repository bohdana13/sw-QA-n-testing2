package edu.redko;

import org.junit.Test;

import static org.junit.Assert.*;

/*
  @author User
  @project lab2
  @class CircleTest
  @version 1.0.0
  @since 29.03.2025 - 11.57
*/
public class CircleTest {

    private Circle circle= new Circle(5);

    @Test
    public void getRadius() {
        assertEquals(5.0, circle.getRadius(), 0.0001);
    }

    @Test
    public void getArea() {
        assertEquals(Math.PI * 25, circle.getArea(), 0.0001);
    }

    @Test
    public void getDiameter() {
        assertEquals(10.0, circle.getDiameter(), 0.0001);
    }

    @Test
    public void getCircumference() {
        assertEquals(2 * Math.PI * 5, circle.getCircumference(), 0.0001);
    }

    @Test
    public void isLargerThan() {
        Circle circle2 = new Circle(3);
        assertTrue(circle.isLargerThan(circle2));    }
}