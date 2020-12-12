public class CesarSymbolCrypter implements SybbolCrypter {
    private int key;

    public CesarSymbolCrypter(int key) {
        this.key = key;
    }

    @Override
    public char crypt(char c) {
        if (c == ' ') {
            return c;
        } else {
            int newNumber = (int) c + key;
            return (char) newNumber;
        }
    }

    @Override
    public char unCrypt(char c) {
        if (c == ' ') {
            return c;
        } else {
            int newNumber = (int) c - key;
            return (char) newNumber;
        }


    }

    @Override
    public String getName() {
        return "Получили шифр Цезаря";
    }
}
