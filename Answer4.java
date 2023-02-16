import java.util.*;
import java.io.*;
import java.math.*;
class Answer4 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String G = in.next();
         int W = in.nextInt();
        if(G.equals("F"))
        {
  System.out.println(W+20);
        }
        else if(G.equals("M"))
        {
  System.out.println(W-20);
        }
        else{
            System.out.println("UNKNOWN");
        }

       
      

    }
}
