package com.manish;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {
    /*
    creating function to validate first name using
    regex pattern
     */
    public static boolean usernameValidation(String name){
        String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
        Pattern p = Pattern.compile(regex);
        if (name == null)
        {
            return false;

        }
        Matcher m = p.matcher(name);
        return m.matches();

    }

    public static void main(String[] args) {

        System.out.println("Welcome to junit Userregistration");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the your First Name : ");
        String fname = input.nextLine();
        System.out.println(usernameValidation(fname));
        //taking input of last name
        System.out.print("Enter the your Last Name : ");
        String lname = input.nextLine();
        System.out.println(usernameValidation(lname));

    }
}
