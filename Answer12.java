import java.util.*;
import java.io.*;
import java.math.*;
class Answer12{

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int raju=0;
        for(int i=0;i<word.length();i++)
        {
           
            char a=word.charAt(i);
            int p=(int)a;
            if(p%2==1)
             {
                raju=raju+p;
             }
        }
        
        System.out.println(raju);
    }
}
