package com.company;



public class Amstrong_nums_inrange {
    public static void main(String[] args) {
        int i=100,sum,temp,rem;
        System.out.println("printing amstrong numbers in range");
        while (i < 999)
        {
            temp=i;
            sum=0;
            while(temp>0)
            {
                rem=temp%10;
                sum=sum+(rem*rem*rem);
                temp=temp/=10;
        }
            if(sum==i)
                System.out.println(i +" ");
            i++;
    }}}

