package ex_04_Tasks;
import java.util.Scanner;
// Count the Number of Words in a String.
public class Count_Words_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = scanner.nextLine();
        int count = 0;
        boolean insideWord = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch != ' ' && !insideWord) {
                insideWord = true; // We are inside a word now
                count++;
            } else if (ch == ' ') {
                insideWord = false; // We left a word
            }
        }
        System.out.println("Number of words in the string: " + count);
    }
}
//public class Count_Words_String_Split {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the string:");
//        String input = scanner.nextLine();
//
//        // Remove leading/trailing spaces
//        input = input.trim();
//
//        // Check if the string is empty after trimming
//        if (input.isEmpty()) {
//            System.out.println("Number of words in string: 0");
//        } else {
//            String[] words = input.split("\\s+");//breaks the string into an array of words.
//            System.out.println("Number of words in string: " + words.length);
//        }
//
//        scanner.close();
//    }}

// Ex: I love Java
//After trim(): "I love Java"
//After split("\\s+"): ["I", "love", "Java"]
//words.length = 3


