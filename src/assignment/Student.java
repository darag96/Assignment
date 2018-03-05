package assignment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moh
 */
public class Student {

    public int id;
    public String name;
    public Float gpa;

    public Student(int id, String name, Float gpa) 
    {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

//  i just wanted to override the toString method to print the data instead of the view method so i did both in case 
//    @Override
//    public String toString() 
    //{
//        return "[id : " + id + ", name : "+ name + ", gpa : "+gpa +"]" ;
//    }
//    
    public void view() 
    {
        System.out.println("Student name is " + name
                + "\n" + "Student id is " + id
                + "\n" + "Student gpa " + gpa + Math.PI);
    }

}
