package com.company;
import java.util.*;
public class IncomeTaxPayable {
    public static void main(String args[]) {
        double sal,tax;
        System.out.println("enter income");
        Scanner s = new Scanner(System.in);
        sal= s.nextDouble();
        if(sal<=180000)
        {
            System.out.println("tax for "+sal+" is nil");
        }
        else if(sal>=181001 && sal <=300000)
        {
            tax=sal*0.10;
            System.out.println("tax for "+sal+" is:"+tax);
        }
        else if(sal>=300001 && sal<=500000)
        {
            tax=sal*0.20;
            System.out.println("tax for "+sal+" is:"+tax);
        }
        else if(sal>500001 && sal<=1000000)
        {
            tax=sal*0.30;
            System.out.println("tax for"+sal+" is:"+tax);
        }
        else{}

    }
}
