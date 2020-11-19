import java.util.Scanner;

public class MeasureTheTemperature {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Пожалуйста введите Вашу температуру в градусах Цельсия: ");
        celsius = sc.nextDouble();
        fahrenheit = calkFahrenheit(celsius);
        System.out.println("Ваша температура в Фаренгейтах состалве: " + fahrenheit);
    }

    public static Double calkFahrenheit(double celsius){
        return (celsius * 9) / 5 + 32;
    }
}
