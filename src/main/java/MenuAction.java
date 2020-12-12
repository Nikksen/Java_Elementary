import java.util.Arrays;
import java.util.Scanner;

public class MenuAction {

    private StringCrypter[] stringCryptors;
    private Scanner scanner;


    public MenuAction(Scanner scanner){
        this.stringCryptors = new StringCrypter[0];
        this.scanner = scanner;
    }

    public void addAction(StringCrypter stringCrypter){
        stringCryptors = Arrays.copyOf(stringCryptors, stringCryptors.length + 1);
        stringCryptors[stringCryptors.length - 1] = stringCrypter;
    }

    public void run(){
        while (true){
            showMenu();
            int choice = getMenuIndexFromUser();
            if (!validateMenuIndex(choice)){
                System.out.println("Invalid input");
                continue;
            }
            System.out.println("heelo");
        }
    }

    private boolean validateMenuIndex(int choice) {
        return choice >= 0 && choice < stringCryptors.length;
    }

    private int getMenuIndexFromUser() {
        System.out.println("Enter your choice: ");
        int ch = scanner.nextInt();
        return ch - 1;
    }

    private void showMenu() {
        for (int i = 0; i < stringCryptors.length ; i++) {
        //    System.out.printf("%d - $s \n ", i+1, stringCryptors[i].getName());
        }
    }
}
