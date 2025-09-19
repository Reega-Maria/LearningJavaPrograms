package ex_01_Java_Basics;

public class Lab011_Common_Math_Exception {
        public static void main(String[] args) {
            System.out.println(10/0);
            // Exception in thread "main" java.lang.ArithmeticException
        }
    }

/** public class Lab011_Common_Math_Exception {
*   public static void main(String[] args) {
*       try {
*           System.out.println(10 / 0);
*      } catch (ArithmeticException e) {
*           System.out.println("Cannot divide by zero: " + e.getMessage());
*         }
*      }
 *            }
 **/
