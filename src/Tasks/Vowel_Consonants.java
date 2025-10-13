
        package Tasks;
// Check if a Character is a Vowel or Consonant.
import java.util.Scanner;
        public class Vowel_Consonants {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a character");
                char ch = scanner.next().charAt(0);
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                        System.out.println("Vowels");
                    } else {
                        System.out.println("Consonants");
                    }
                }

        else{
                        System.out.println("Not vowel and consonants");
                    }

            }
        }


