package com.company;

import java.util.*;


public class simple_compound_intrest {
    public static void main(String[] args){
        double p,t,r,n,s_i,c_i;
        Scanner s =new Scanner(System.in);
        System.out.println("enter principle");
        p=s.nextDouble();
        System.out.println("enter time");
        t=s.nextDouble();
        System.out.println("enter rate");
        r=s.nextDouble();
        System.out.println("enter number of times intrest compounded");
        n=s.nextDouble();
        s_i=(p*t*r)/100;
        System.out.println("the simple intrest is: "+s_i);
        c_i=p*(Math.pow((1+(r/100)),(n*t)))-p;
        System.out.println("the compound intrest is :"+c_i);
    }
}
