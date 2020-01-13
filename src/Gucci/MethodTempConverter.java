package Gucci;

public class MethodTempConverter {

    public static double celToKelvin (double celsius){
        double kelvin = (celsius + 273.15);
        return kelvin;
    }
    public static double celTofahrenheit (double celsius){
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }
    public static double kelvinToCelsius (double kelvin){
        double celsius = (kelvin - 273.15);
        return celsius;
    }
    public static double kelvinToFahrenheit (double kelvin) {
        double fahrenheit = (kelvin * 9 / 5) - 459.67;
        return fahrenheit;
    }



    public static void main (String[] args) {
        System.out.println("Temperature in Kelvin is: "+ celToKelvin(25));
        System.out.println("Temperature in Fahrenheit is: " + celTofahrenheit(25));
        System.out.println("Temperature in Celsius is: " + kelvinToCelsius(25));
        System.out.println("Temperature in Fahrenheit is: " + kelvinToFahrenheit(25));


    }
}
//        Celsius to Kelvin
//        Celsius to Fahrenheit
//        Kelvin to Celsius
//        Kelvin to Fahrenheit