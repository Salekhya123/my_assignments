package com.company;
import java.util.*;
public class AssOneNine {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int x[]=new int[3];
        int y[]=new int[3];
        int z[]=new int[3];
        System.out.println("Enter student x marks");
        for(int i=0;i<3;i++)
        {
            x[i]=s.nextInt();
        }
        System.out.println("Enter student y marks");
        for(int i=0;i<3;i++)
        {
            y[i]=s.nextInt();
        }
        System.out.println("Enter student z marks");
        for(int i=0;i<3;i++)
        {
            z[i]=s.nextInt();
        }
for(int i=0;i<3;i++)
{
    int tot=x[i]+y[i]+z[i];
    System.out.println("total marks of sub "+(i+1)+" by 3 students "+tot+"Avg of sub "+(i+1)+" is "+(tot/3));
}

   int totx=x[0]+x[1]+x[2];
int toty=y[0]+y[1]+y[2];
int totz=z[0]+z[1]+z[2];

        System.out.println("total of X"+totx+"avf of X"+totx/3);
        System.out.println("total of Y"+toty+"avf of Y"+toty/3);
        System.out.println("total of Z"+totz+"avf of Z"+totz/3);

     /*   vint totofa=x[0]+y[0]+z[0];
        int totofb=x[1]+y[1]+z[1];
        int totofc=x[2]+y[2]+z[2];
        int avgofa=totofa/3;
        int avgofb=totofb/3;
        int avgofc=totofc/3;
        int totofx=x[0]+x[1]+x[2];
        int totofy=y[0]+y[1]+y[2];
        int totofz=z[0]+z[1]+z[2];
        int avgofx=totofx/3;
        int avgofy=totofy/3;
        int avgofz=totofz/3;
        System.out.println("total of A"+totofa+"avf of A"+avgofa);
        System.out.println("total of B"+totofb+"avf of B"+avgofb);
        System.out.println("total of C"+totofc+"avf of C"+avgofc);
        System.out.println("total of X"+totofx+"avf of X"+avgofx);
        System.out.println("total of Y"+totofy+"avf of Y"+avgofy);
        System.out.println("total of Z"+totofz+"avf of Z"+avgofz);*/
    }
}
