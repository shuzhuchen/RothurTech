public class Reverse {
    public static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static void main(String[] args) {
        String string = "abc";

        System.out.println(reverse(string));
    }
}
