/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author moh
 */
public class Circle {

    // sorry for changing the access modifiers for the functions and the propeties but i liked it that way 
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    private Float getArea() 
    {

        float area = (float) Math.PI * (radius * radius);

        return area;

    }

    private Float getCircumference() 
    {

        float circumference = (float) Math.PI * 2 * radius;

        return circumference;

    }

    @Override
    public String toString() {
        return "The area of your circle is " + getArea() + "\n"
                + "The Circumference of your circle is " + getCircumference();
    }

}
