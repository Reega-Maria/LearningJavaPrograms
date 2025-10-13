package Tasks;
//program to reverse a string without using inbuilt functions
public class Reverse_String {
        public static void main(String[] args){
            String input="REEGA";
            String rev="";
            for(int i=input.length()-1;i>=0;i--){
                rev=rev+input.charAt(i);
            }
            System.out.println("Reversed string:" + rev);
        }
    }





