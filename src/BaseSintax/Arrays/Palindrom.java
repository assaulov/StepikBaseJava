package BaseSintax.Arrays;

public class Palindrom {
    public static boolean isPaidrome(String text) {
        String  stringWithOutMarks= text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder stringBuilderString = new StringBuilder(stringWithOutMarks);
        String reverseString = stringBuilderString.reverse().toString();
        return reverseString.equals(stringWithOutMarks);

    }

    public static void main(String[] args) {
       boolean pl=  isPaidrome("Madam, I'm Adam!");
        System.out.println(pl);
    }
}
