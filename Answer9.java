import java.util.*;
import java.io.*;
import java.math.*;
class Answer9 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%5==0 && i%7!=0)
            {
                System.out.println("Foo");
            }
            else if(i%7==0 && i%5!=0)
            {
                System.out.println("Bar");
            }
            else if(i%7==0 && i%5==0)
            {
                 System.out.println("FooBar");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
