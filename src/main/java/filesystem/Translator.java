package filesystem;

public class Translator {
    public static byte[] encode(String str) {
        return str.getBytes();
    }

    public static String decode(byte[] arr) {
        return new String(arr);
    }
}