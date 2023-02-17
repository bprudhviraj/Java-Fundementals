import java.util.*;
import java.io.*;
import java.math.*;
class Answer2 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String M= in.nextLine();
        for(int i=0;i<M.length();i++)
        {
            char c=M.charAt(i);
            char cda=M.charAt(((M.length()-1)-i));
            System.out.println(c +" "+ cda);
        }
    }
}
