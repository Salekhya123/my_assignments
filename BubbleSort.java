package com.company;

public class BubbleSort {
    public static void main(String[] args)
    {
        int[] arr = new int[]{5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        int i,j,temp;
for(i=0;i<arr.length-1;i++) {
    for (j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
            temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
    }
}
    for(i=0;i<arr.length-1;i++)
        System.out.println(arr[i]+" ");
}

}
