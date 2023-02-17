import java.util.*;
import java.io.*;
import java.math.*;
class Answer6 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String I = in.nextLine();
        int count=0;
        for(int i=0;i<I.length();i++)
        {
            char ch=I.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        System.out.println(count);
    }
}
