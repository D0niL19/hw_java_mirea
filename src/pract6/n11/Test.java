package pract6.n11;

public class Test {
    public static void main(String[] args) {
        double celsius = 25.0;

        Convertable celsiusToKelvin = new CelsiusToKelvin();
        Convertable celsiusToFahrenheit = new CelsiusToFahrenheit();

        double kelvin = celsiusToKelvin.convert(celsius);
        double fahrenheit = celsiusToFahrenheit.convert(celsius);

        System.out.println(celsius + " градусов Цельсия равно " + kelvin + " Кельвинам.");
        System.out.println(celsius + " градусов Цельсия равно " + fahrenheit + " Фаренгейтам.");
    }
}
