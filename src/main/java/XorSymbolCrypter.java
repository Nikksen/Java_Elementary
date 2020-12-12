public class XorSymbolCrypter implements SybbolCrypter {
    private int key;

    public XorSymbolCrypter(int key) {
        this.key = key;
    }

    @Override
    public char crypt(char c) {
        c = (char) (c ^ key);
        return c;
    }

    @Override
    public char unCrypt(char c) {
        c = (char) ((key ^ c));
        return c;
    }

    @Override
    public String getName() {
        return "Получили шифр XOR";
    }


}
