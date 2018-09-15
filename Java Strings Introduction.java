# Java Strings Introduction
# https://www.hackerrank.com/challenges/java-strings-introduction/problem


import java.util.*;
import java.io.*;

public class String_intro
{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        System.out.println(A.length() + B.length());
        int f = A.compareTo(B);
        if(f > 0)
            System.out.println("Yes");
        else if(f <= 0)
            System.out.println("No");
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
