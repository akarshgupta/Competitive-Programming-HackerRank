# Java End-of-file
# https://www.hackerrank.com/challenges/java-end-of-file/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=1;
        for(int i=0;i<10000;i++)
        {
        if(sc.hasNext()==true)
        {
            String st=sc.nextLine();
            System.out.println(c+" "+st);
        }
             c++;
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
