package com.company;
import java.util.*;
public class Arithematic {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of number1: ");
        int num1=s.nextInt();
        System.out.println("enter the value of number2: ");
        int num2=s.nextInt();
        try
        {
            int res=num1/num2;
            System.out.println("num1/num2 result is:"+res);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }

}
