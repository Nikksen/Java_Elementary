import java.util.Scanner;

public class MeasureTheTemperature {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Пожалуйста введите Вашу температуру в градусах Цельсия: ");
        celsius = sc.nextDouble();
        fahrenheit = calkFahrenheit(celsius);
        System.out.println("Ваша температура в Фаренгейтах состалве: " + fahrenheit);

        //Dop task
        System.out.println("Введите 4-х значное число");
        int number = sc.nextInt();
        int res = 0;
        while (number != 0) {
            res += number % 10;
            number /= 10;
        }
        System.out.println("Сумма цифр введёных в числе = "+res);

    }

    public static Double calkFahrenheit(double celsius){
        return (celsius * 9) / 5 + 32;
    }
}
