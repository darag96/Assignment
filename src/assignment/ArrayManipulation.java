/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author moh
 */
public class ArrayManipulation {

    private int arr[];
    private int value;
    private int size;

    public ArrayManipulation(int size, int value) {
        this.size = size;
        fillArray();
        this.value = value;
    }

    private void fillArray() {
        arr = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Array Values \n");
        for (int i = 0; i < size; i++) {
            this.arr[i] = sc.nextInt();
        }

    }

    private int sum() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    // i decided to improve this function a little bit ^__^
    public String search() {
        boolean flag = false;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                flag = true;
                sb.append(i + " ,");
            }
        }
        // this means that we haven't found the specified value 
        if (flag == false) {
            return "-1";
        }
        // this is just to remove the last additional character that i don't nead instead of the if loop this character ',' 
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    // here i just sort the array using java built in sort (quickSort or MergeSort) and find the second element 
    private int secondSmallest() {
        Arrays.sort(arr);
        return arr[1];
    }

    //  i just reversed the array cause it was sorted before using the previous function  
    private int[] sort() {
        int arr2[] = new int[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[count] = arr[i];
            count++;
        }
        return arr2;
    }

    @Override
    public String toString() {
        return "The Sum Of This Array is " + sum() + "\n"
                + "The Positions That This Value appeared in is " + search() + "\n"
                + "The Second Smallest Element in This Array is " + secondSmallest() + "\n"
                + "The Array After Sorting " + Arrays.toString(sort());
    }

}
