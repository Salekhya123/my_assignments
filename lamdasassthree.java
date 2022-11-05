package com.company;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
    interface Inter
    {
        public void test(int n);
    }
public class lamdasassthree
{
        public static void main(String args[])
        {
            Predicate<Integer> P = n -> n%2 == 0;
            System.out.println(P.test(10));     //predicate is interface which tests so in-built method is test()

            Function<Integer,Integer> F = n -> n*n;
            System.out.println(F.apply(6));    //Function is interface which perform any method we want so its in-built function is apply()

            Supplier<Date> S = () -> new Date();
            System.out.println(S.get());         //supplier is a interface which gives us some value so its inn-built function is get()

            Consumer<String> C = (string) -> {
                System.out.println(4);
            };
            C.accept("paru");                 //consumer is a interface which consumes some value to perform some operation so its in-built function is accept()
        }
    }



