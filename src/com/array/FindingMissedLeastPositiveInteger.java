package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class FindingMissedLeastPositiveInteger {
    public static void main(String[] args) {
        // Scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER THE SIZE OF THE ARRAY");

        //Input Array Size
        int size=sc.nextInt();
        Integer[] arr =new Integer[size];
        System.out.println("ENTER THE VALUES");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();

        //Array to List Conversion
        List<Integer> al = Arrays.asList(arr);

        // Finding the Missing Least Minimum Poistive Integer
//        for(int i=0;i<size;i++){
//            if(!al.contains(i+1)) {
//                System.out.println("MISSING POSITIVE LEAST INTEGER: " + (i+1));
//                break;
//            }
//        }

        HashSet<Integer> hs=new HashSet<Integer>(al);
        for(int i=0;i<size;i++){
            if(!hs.contains(i+1)){
                System.out.println("MISSING POSITIVE LEAST INTEGER: " + (i+1));
                 break;
            }
        }
    }
}

// SPACE AND TIME COMPLEXITY

    //TIME COMPLEXITY: O(n) --> Because size is Dynamic
    //SPACE COPLEXITY: 4Bytes
