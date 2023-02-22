import java.util.*;
class Answer16
{
  public static void main(String[]a)
{Scanner d=new Scanner(System.in);
 String s=d.nextLine();
 int king=0;char queen=0;
for(int i=0;i<s.length();i++)
{
char l=s.charAt(i);
int p=(int)l;
queen=p/2;
king=(char)queen;
}
System.out.print(king);
}
}
