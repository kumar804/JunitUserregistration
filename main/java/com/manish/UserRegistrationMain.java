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


    public static boolean mobileNumValidation(String mobileNum) {
        String mobileNumber = "^[9][1]\\s[6-9]{1}[0-9]{9}$";
        Pattern p = Pattern.compile(mobileNumber);
        if ( mobileNumber == null ){
            return false;

        }
        Matcher m = p.matcher(mobileNum);
        return m.matches();

    }
    /*
    passwordValidation is a function to check password validation
      password validation part 1 is enter minimum 8 characters
      password validation part 2 is  having minimum 1 upper case character.
      rule 3: one numeric value

     */
    public static boolean passwordValidation(String password){
        String regex =  "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        Pattern p = Pattern.compile(regex);
        if ( password == null ){
            return false;
        }
        Matcher m = p.matcher(password);
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
        System.out.print("Enter the your Mobile Number : ");
        String mNumber = input.nextLine();
        System.out.println(mobileNumValidation(mNumber));
        System.out.print("Enter the your Password : ");
        String password = input.nextLine();
        System.out.println(passwordValidation(password));




    }
}
