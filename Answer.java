import java.util.*;
import java.io.*;
import java.math.*;
class Answer{

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        String ut="";
        String lw="";
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(Character.isUpperCase(ch)){
               ut=ut+ch;
            }
            else if(Character.isLowerCase(ch)){
               lw=lw+ch;
            }
        }

        System.out.println(ut);
        System.out.println(lw);
    }
}
