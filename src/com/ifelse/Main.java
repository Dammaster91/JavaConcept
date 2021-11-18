package com.ifelse;

import java.util.Scanner;

public class Main 
{
    // recursive function
    public static int calculateSum(int arr[], int i, int length)
    {
        // base condition - when reached end of the array
        // return 0
        if (i == length) {
            return 0;
        }
        // recursive condition - current element + sum of
        // (n-1) elements
        return arr[i]+ calculateSum(arr, i + 1,length);
        
    }
    //Driver Code
    public static void main(String[] args)
    {
        //Create an instance of the Scanner Class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int total_sum = 0;
        //Array Creation and Initialization
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        // call function to calculate sum
        total_sum = calculateSum(arr,0,n);
        System.out.println("The total of N numbers is : "+ total_sum);
    }
}