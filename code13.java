

public class String {
    static String str = "Hello, JK";

    public static void main(String... args) {
        char characterAtIndex = str.charAt(7);
        System.out.println("Character at index 7: " + characterAtIndex);

        boolean containsWord = str.contains("Hello");
        System.out.println("Boolean containsWord: " + containsWord);

        String newStr = str.replace("JK", "World");
        System.out.println("String newStr: " + newStr);

        int length = str.length();
        System.out.println("The length of the string is " + length);
        System.out.println("Length of the string :" + length);

        String[] words = str.split(", ");
        System.out.println("Words which are stored in the string:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}