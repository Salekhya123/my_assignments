package com.company;

public class Stringbuirev {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("This method returns the reversed object on which it was called");
        System.out.println("befor string reverse:\n"+s);
        s.reverse();
        System.out.println("after string reverse:\n"+s);
    }
}
