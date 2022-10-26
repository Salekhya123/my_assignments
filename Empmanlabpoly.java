package com.company;
class Employee
{
    int basicpay=3000;
    int totalsalary()
    {
        return basicpay;
    }
}
class Manager extends Employee
{
    int incentives=800;
    int totalsalary()
    {
        return super.basicpay+incentives;
    }
}
class Labor extends Employee{
    int overtime=500;
    int totalsalary()
    {
        return overtime+super.basicpay;
    }
}
public class Empmanlabpoly {
    public static void main(String atgs[])
    {
        Manager m=new Manager();
       int sal= m.totalsalary();
      System.out.println("total salary of manager including incentives:"+sal);
      Labor l=new Labor();
      int pay=l.totalsalary();
      System.out.println("total pay of labor with overtime:"+pay);
    }
}
