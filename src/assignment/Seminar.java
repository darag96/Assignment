/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author moh
 */
public class Seminar {

    public int time;
    public String name;
    public int id;
    public int phone;
    public String e_mail;

    public Seminar() //this
    {
        time = 30;
        System.out.println("Seminar starts now");
    }

    void lecture() //Function 1
    {
        System.out.println("please register to attend lectures ");
    }

    public Seminar(int duration) //this
    {
        time = duration;
        System.out.println("Seminar starts at " + time);
    }
    
    public void register ( String student_name, int registration_id, int phone_number)
    {
        this.name = student_name; 
        this.id = registration_id;
        this.phone  = phone_number;
    }
    

}
