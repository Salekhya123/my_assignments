package com.company;
import java.util.*;
public class LinerSearch {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = new int[]{5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        int n = s.nextInt();
        for (int i = 0; i < 15; i++) {
            if (arr[i] == n) {
                count = 1;
                break;
            }
        }
        if (count == 1)
            System.out.println("search value is found");
        else
            System.out.println("search value is not found");
    }
}
