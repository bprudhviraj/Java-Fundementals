import java.util.*;
import java.io.*;
import java.math.*;
class Answer8{
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
String w = in.nextLine();
int count=0;
for(int i=0;i<w.length();i++)
{
    char ch=w.charAt(i);
    if(ch=='R'){
        count++;
    }
   
}
System.out.println(count*4);
    }
}
