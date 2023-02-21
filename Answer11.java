import java.util.*;
import java.io.*;
import java.math.*;
class Answer11 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int a=m+n;
        if(a<=7)
        {
             System.out.println(a);
        }
        else
        {
          int b=a-7;
 System.out.println(b);
        }
    }
}
