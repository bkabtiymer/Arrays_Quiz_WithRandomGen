package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arrays= new int[5];
        Random rand=new Random();
        int randomInt;
        for(int i=0;i<arrays.length;i++){
//            System.out.println("Enter a number");
             randomInt=1+rand.nextInt(100);
            arrays[i]=randomInt;
//            arrays[i]=1+rand.nextInt(100);

        }
        for(int first:arrays){
            System.out.println("Randomly Integers:");
            System.out.println("Arrays: "+first);
        }


        int[] arr=new int[5];
        for (int i=0;i<arrays.length;i++){
            System.out.println("Enter an number");
            arr[i]=input.nextInt();
        }


        for(int second:arr){
            System.out.println("Populated with user Input:");
            System.out.println("Input: "+second);
    }


    }
}
