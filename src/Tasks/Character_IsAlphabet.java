package Tasks;
// Check if a Character is an Alphabet.
import java.util.Scanner;

public class Character_IsAlphabet {
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the alphabet");
            char ch =scanner.next().charAt(0);
            if ((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')){
                            System.out.println(ch+ " is an alphabet");
                        } else {
                            System.out.println(ch+ " is not an alphabet");
                        }
                    }
                }

