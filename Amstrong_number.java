package com.company;

import java.util.Scanner;

public class Amstrong_number {
    public static void main(String[] args) {
int rem;
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=a.nextInt();
        int temp=num;
        int sum=0;
        while(num>0) {
          rem=num%10;
          sum=sum+(rem*rem*rem);
          num=num/10;
        }
        if(sum==temp)
        {System.out.println("given number is a amstrong number");
        }
        else
        {
            System.out.println("given number is not a amstrong number");
        }
    }
}
