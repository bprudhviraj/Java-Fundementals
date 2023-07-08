//Program to print the count no.of Strings Continously 



import java.util.*;
import java.io.*;
import java.math.*;

class Answer21 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String unary="";
        for (int j = 0; j< count; j++) {
            unary = in.next();
            for (int i = 0; i <unary.length(); i++) 
        {
            char ch=unary.charAt(i);
            System.out.print(ch);
        }
        }
        
        //System.out.println("summation");
    }
}
