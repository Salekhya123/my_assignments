package com.company;

import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.function.Consumer;
public class lamdasassfive
    {
        public static void main(String[] args)
        {
           /* Consumer<String> c=new Consumer<String>() {
                @Override
                public void accept(String s)
                {
                    System.out.println(s);
                }
            };
            c.accept("harini");
            c.accept("vani");
            c.accept("landas");*/

            StringBuilder str=new StringBuilder();
            {

                Arrays.asList("harini","vani","lamdas","assignment").forEach(word->str.append(word.charAt(0)));
                System.out.println(str);
            }

        }
    }

