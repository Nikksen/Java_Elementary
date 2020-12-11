public class StringCrypter {

    private final SybbolCrypter sybbolCrypter;

    public StringCrypter(SybbolCrypter sybbolCrypter) {
        this.sybbolCrypter = sybbolCrypter;
    }

    public String crypt(String s) {
        StringBuilder cieferText = new StringBuilder();
        for (char character : s.toCharArray()) {
            cieferText.append(sybbolCrypter.crypt(character));
        }
        return cieferText.toString();

    }

    public String unCrypt(String s) {
        StringBuilder encript = new StringBuilder();
        for (char character : s.toCharArray()) {
            encript.append(sybbolCrypter.unCrypt(character));
        }
        return encript.toString();
    }
}
