import java.util.*;
import java.io.*;
import java.math.*;

class Answer24 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p=1,raj=0;
        for(int i=1;i<=n;i++)
        {
           p=p*i;
           raj=raj+i;
        }
        System.out.println(p+raj);
    }
}
