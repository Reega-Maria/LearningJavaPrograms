package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab148_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Reega");

        stringBuffer.append("Maria");
        System.out.println(stringBuffer); // ReegaMaria


        String s1 = "REega";
        s1 = s1+ "Maria";
        System.out.println(s1);


    }
}