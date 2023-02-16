import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Answer3 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long sum1=0,sum2=0;
       for(int i=1;i<=n;i++)
        {
         if(i%2==0)
         {
             sum1=sum1+i;
         }
         else{
           sum2=sum2+i;
         }
        }
        System.out.println(sum2);
        System.out.println(sum1);
    }
}
