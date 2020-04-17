package com.array;

import java.util.Scanner;

public class FindingMajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Integer arr[] = new Integer[size];
        //for Iteration
        int i = 0;
        for (i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        //Finding the Majority Element (greater than n/2)
        int counter = 0;
        int candidate = 0;

        if (size > 0)
            candidate = arr[0];

        for (i = 0; i < size; i++) {

            if (arr[i] == candidate) {
                counter++;
            } else {
                counter--;
                if (counter == 0) {
                    candidate = arr[i];
                    counter++;
                }
            }
        }
        // Verification ( It may give wrong result in the scenario like 1,2,1,2,3 )
        int temp = 0;//if you want to increase space complexity reuse the counter variable here
        for (i = 0; i < size; i++) {
            if (arr[i] == candidate)
                temp++;
        }
        if (temp > arr.length / 2)
            System.out.println("THE MAJORITY ELEMENT IS: " + candidate);
        else
            System.out.println("THERE IS NO MAJORITY ELEMENT");
    }

}

//Description:
    //To find the majority Element usually we go for Time Complexity O(n^2)
    //By this Approach we can reduce Time Complexity to O(n)