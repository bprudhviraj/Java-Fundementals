import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Answrer5 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        if(N>M)
        {
            System.out.println(M);
        }
        else if(N==0 && M==0)
        {
            System.out.println("0");
        }
        else if(N==0)
        {
            System.out.println(N);
        }

    }
}
