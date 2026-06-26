public class Main {
    public static void main(String[] args) {

        String text = "Hello World";

        System.out.println("Original string: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Upper case: " + text.toUpperCase());
        System.out.println("Lower case: " + text.toLowerCase());
        System.out.println("Character at index 1: " + text.charAt(1));
        System.out.println("Substring: " + text.substring(0, 5));
        System.out.println("Contains 'World': " + text.contains("World"));
        System.out.println("Replace: " + text.replace("World", "Java"));
    }
}