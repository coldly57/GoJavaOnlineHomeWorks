package module4;

public class DegreesConverter {

    public double fahrenheitToCelsius(double fahrenheitDegrees){

        return (fahrenheitDegrees - 32) * (5.0 / 9.0);
    }

    public double celsiusToFahrenheit(double celsiusDegrees){

        return celsiusDegrees * (9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {

        DegreesConverter degreesConverter = new DegreesConverter();

        System.out.println(degreesConverter.fahrenheitToCelsius(250.0));
        System.out.println(degreesConverter.celsiusToFahrenheit(121.11));

    }

}
