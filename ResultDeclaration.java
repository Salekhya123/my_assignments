package com.company;
import java.util.*;
public class ResultDeclaration {
    public static void main(String[] args) {
        int s1,s2,s3;
Scanner s=new Scanner(System.in);
System.out.println("enter marks of subject1");
s1=s.nextInt();
        System.out.println("enter marks of subject2");
        s2=s.nextInt();
        System.out.println("enter marks of subject3");
        s3=s.nextInt();
if(s1>60 && s2>60 && s3>60)
{
    System.out.println("passed");
}else if(s1 <60 && s2<60 && s3<60)
{
System.out.println("failed");
    }
else
{
System.out.println("promoted");}
    }
}
