 	Goal
Storyline
You measure with your ruler the size of different objects, round it to the nearest number, and give the rounded answers (rNum) and the actual answers (Num). Your teacher tells that the error in measurement is the difference between the result you record (rNum) and the correct one (Num). He asks you to find the the difference.
Input
Num: float
rNum: rounded integer of Num
Output
Difference between Num and rNum.
If there is no difference, output "No error in measurement". Otherwise, find the difference, and output it.
Warning:
There may be negative numbers in your answer but only output positive numbers.
Round to the same decimal place as Num.
Constraints
Num <= 1000
Example
Input
3.7
4
Output
0.3

//answer

import java.util.*;
import java.io.*;
import java.math.*;
class Answer23 {

    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        float num = in.nextFloat();
        int rnum = in.nextInt();
        if(rnum==num)
        {
           System.out.println("No error in measurement");
        }
        else if(rnum<num)
        {
            float theda=num-rnum;
            System.out.printf("%.5f",theda);
        }
        else if(rnum>num)
        {
            float theda=rnum-num;
            System.out.printf("%.1f",theda);
        }



    }
}
