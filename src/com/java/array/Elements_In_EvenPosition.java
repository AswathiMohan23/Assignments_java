package com.java.array;

import java.util.Scanner;

// 5)  Java Program to print the elements of an array present on even positions
//    =========================================================================

public class Elements_In_EvenPosition {
    public static void main(String[] args){
        System.out.println("enter the size of an array : ");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int inputArray[]=new int[size];
        System.out.println("enter the elements : ");
        for(int i =0;i<size;i++){
            inputArray[i]=sc.nextInt();
        }
        System.out.println("the elements in the even positions are : ");
        for (int j = 0; j < size; j = j+2) {
            System.out.println("even position " + j + " : element = " + inputArray[j]);
        }
        }
    }
