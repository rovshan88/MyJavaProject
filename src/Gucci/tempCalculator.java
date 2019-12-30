package Gucci;

public class tempCalculator {
    public static void main(String[] args) {
        double fah = 68; //0c, 273.115k

        //Calculate celcius and store in celcues variable
        double celsius = (fah - 32) * 5/9;
        System.out.println(celsius);

        //Celsius to Kelvin
        //T(K) = T(°C) + 273.15
        double kelvin = (celsius + 273.15);
        System.out.println(kelvin);

        // Celsius to Fahrenheit
        //T(°F) = T(°C) × 9/5 + 32
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(fahrenheit);

        //Kelvin to Celsius
        //T(°C) = T(K) - 273.15
        double celsiusFromFahr = (kelvin - 273.15);
        System.out.println(celsiusFromFahr);

        // Kelvin to Fahrenheit
        //T(°F) = T(K) × 9/5 - 459.67
        double farhFromKelvin = (kelvin * 9/5) - 459.67;
        System.out.println(farhFromKelvin);


    }
}
