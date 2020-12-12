import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuAction menuAction = new MenuAction(sc);
        menuAction.addAction(new StringCrypter(new CesarSymbolCrypter(2)));
        menuAction.addAction(new StringCrypter(new XorSymbolCrypter(2)));





//        Scanner scanner = new Scanner(System.in);
//        StringCrypter stringCrypter = new StringCrypter(new CesarSymbolCrypter(2));
//        String text = scanner.nextLine();
//        String newWord = stringCrypter.crypt(text);
//        System.out.println(newWord);
//        String unCryptNewWord = stringCrypter.unCrypt(newWord);
//        System.out.println(unCryptNewWord);
//
//        StringCrypter stringCrypter1 = new StringCrypter(new XorSymbolCrypter(2));
//        String text1 = scanner.nextLine();
//        String newWord1 = stringCrypter1.crypt(text1);
//        System.out.println(newWord1);
//        String unCryptNewWord1 = stringCrypter1.unCrypt(newWord1);
//        System.out.println(unCryptNewWord1);

    }
}
