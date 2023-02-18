import java.util.*;
import java.io.*;
import java.math.*;
class Answer7{

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String t = in.nextLine();
        for(int i=0;i<l;i++)
        {
            char ch=t.charAt(i);
            if(Character.isLetter(ch) || ch==' ')
{
   System.out.print(ch);
}
else if(Character.isDigit(ch))
{
   System.out.print(ch);  
}

    }
    }
}
