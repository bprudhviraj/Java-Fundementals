import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class  Answer1{

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String T = in.nextLine();
        String T2 = in.nextLine();
        char ch1,ch2;
        for(int i=0;i<T.length();i++)
        {
          ch1=T.charAt(i);
         ch2=T2.charAt(i);
         if(ch1=='0' && ch2=='0')
         {
             System.out.print(ch1);
         }
           if(ch1=='0' && ch2=='1')
         {
             System.out.print(ch2);
         }
           if(ch1=='1' && ch2=='0')
         {
             System.out.print(ch1);
         }
           if(ch1=='1' && ch2=='1')
         {
             System.out.print(ch2);
         }


        }


       
    }
}
