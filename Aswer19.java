import java.util.Scanner;
class Answer19 extends Squareerani{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch= sc.next().charAt(0); 
        Squareerani sq=new Squareerani();
       if(ch=='R')
        {
          sq.perarea1();
        }
         else if(ch=='S')
        {
            sq.perarea();
        }
         else if(ch=='T')
        {
            sq.tarea();
        }
         else if(ch=='C')
        {
            sq.cirarea1();
        }
    }
}
class Squareerani extends Rectangle11
{
     void perarea()
     {
    Scanner sc=new Scanner(System.in);
     Double s=sc.nextDouble ();      Double per=4*s;
     Double  area=s*s;
     System.out.printf("The Perimeter of the Square is %.2f \n",per);
     System.out.printf("Th  Area ofthe square is %.2f ",area);
     }
}
class Rectangle11 extends Circle45
{
     Scanner sc=new Scanner(System.in);
     void perarea1()
     {
    float l=sc.nextFloat();
    float b=sc.nextFloat();
     double p=2*(l+b);
     double area=l*b;
     System.out.printf("Te Perimeter of the Rectangle is %.2f \n",p);
     System.out.printf("Th  Area of the Rectangle is %.2f",area);
     }
}
class Circle45 extends Triangleraju
{
     Scanner sc=new Scanner(System.in);
     void cirarea1()
     {
    float r=sc.nextFloat();
    double area=(3.14)*r*r;
    double cir=2*(3.14)*r;
System.out.printf("Te Circumferrence of the Circle is %.2f \n",cir/2);
     System.out.printf("\n The  Area of the Rectangle is %.2f",area);
     }
}
class Triangleraju
{
     Scanner sc=new Scanner(System.in);
     void tarea()
     {
    float b=sc.nextFloat();
    float h=sc.nextFloat();
    double area=(0.5)*b*h;
     System.out.printf("The Area of the Triangle is %.2f \n",area);
     }
}


