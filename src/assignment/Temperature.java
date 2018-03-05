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
public class Temperature {

    private float fahrenheit;
    private float celsius;

    // i made a contructor to give two values the fahrenheit and celsius  

    public Temperature(float fahrenheit, float celsius) {
        this.fahrenheit = fahrenheit;
        this.celsius = celsius;
    }

    // this function will take the celsius and convert it to fahrenheit

    private float convertFahrenheit() {
        float result = (float) (((9 * celsius) / 5) + 32);
        return result;
    }

    // this function will take the fahrenheit and convert it to celsius 

    private float convertCelsius() {
        float result = (float) ((fahrenheit - 32) * 5) / 9;
        return result;
    }

    @Override
    public String toString() {
        return fahrenheit + " fahrenheit degree to celsius = " + convertCelsius() + "\n"
                + celsius + " celsius degree to fahrenheit = " + convertFahrenheit();
    }

}
