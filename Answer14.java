import java.util.*;
import java.io.*;
import java.math.*;
class Answer14{

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String m= in.nextLine();
        int counter=0;
        for(int i=0;i<m.length();i++)
        {
          char ch=m.charAt(i);  
          if(Character.isLetter(ch))
          {
            counter++;
          }
        }
        System.out.println(counter);
    }
}
