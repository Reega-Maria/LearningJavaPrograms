package ex_05_Type_Casting;

public class Lab058_Type_Casting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid Syntax -> Widening -> Implicit Casting - Automatically done.
        int a1 = (int) b; // Valid Syntax -> Widening -> Explicit Casting - not required
    }
}

