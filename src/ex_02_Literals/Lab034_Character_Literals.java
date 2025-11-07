package ex_02_Literals;

public class Lab034_Character_Literals {
        public static void main(String[] args) {

            char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
            //        char c = "A"; // "" == String = Bunch of Char invalid


            char c2 = 'B';
            char c3 = '@';
            char c4 = '_';
            char c5 = '9';
            char c6 = '1';
            char c7 = '(';
            char c8 = ' '; // blank space

            // Escape Sequence
            char new_line = '\n';
            char tab_line = '\t';
            char back_space = '\b';
            char carriage_return = '\r';

            System.out.println("ReegaMaria");
            System.out.println("Reega"+new_line+"Maria");
            System.out.println("Reega\nMaria");
            System.out.println("Reega"+tab_line+"Maria");
            System.out.println("Reega"+back_space+"Maria");
            System.out.println( " ----- ");

            System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");

            char c10 = 'A';
            //  // ASCII, (limited numbers) - A -> 65

            char ruppes = '₹';
            System.out.println(ruppes); //For “normal” characters (A–Z, ₹, @, etc.) a single char is fine.

           char my_laugh_smily = '\u1f60';   // :)
           System.out.println(my_laugh_smily); //For characters above U+FFFF, always use a String or surrogate pairs.

          //  char c11  = '\u1F60';
            //System.out.println(c11);

        }
    }

