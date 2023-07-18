/*

01 Test 1
Input
Expected output
0
1
02 Test 2
Input
Expected output
001
110
03 Test 3
Input
Expected output
011
100
04 Test 4
Input
Expected output
00000000000111
11111111111000

*?
//Solution

import java.util.*;
import java.io.*;
import java.math.*;

class Answer22 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String b = in.next();
        for(int i=0;i<b.length();i++)
        {
            char hero=b.charAt(i);
            if( hero=='0')
            {
                System.out.print("1");
            }
            if( hero=='1')
            {
                System.out.print("0");
            }
        }
    }
}
