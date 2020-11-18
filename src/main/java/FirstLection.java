import java.util.Scanner;

public class FirstLection {

    static final int YEAR = 2020;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше ФИО");
        String name = scanner.next();
        String lastName = scanner.next();
        String surname = scanner.next();
        System.out.println("Введите ваш год рождения");
        int age = scanner.nextInt();
        int result = YEAR - age;
        System.out.println("Ваш возраст " + result + " года и  Ваше фио " + name.concat(lastName.concat(surname)));
    }
}
