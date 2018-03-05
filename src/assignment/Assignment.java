/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author moh
 */
public class Assignment {

    public static int enter (){
        Scanner sc = new Scanner (System.in);
        int input = sc.nextInt();
        return input;
    } 
    public static void main(String[] args) {
//       Student student =  new Student (4141031,"Mohamed",3.51F); 
//       
//      // System.out.println(student);
//       student.view();
        
        Circle circle = new Circle (8) ; 
        System.out.println(circle);
        
//        Seminar seminar = new Seminar ();
//        int arr [] = {1,5,2,4,6,8,2,7};
//        System.out.println("Please Enter The Size Of The Array That You Wanna Fill in \n");
//        ArrayManipulation array =  new ArrayManipulation(enter(),5);
//        System.out.println(array);          
//        System.out.println(Arrays.toString(arr));
//      Temperature temperature = new Temperature (98.6F,37F);
//        System.out.println(temperature);
//      
        
    }
    
}
