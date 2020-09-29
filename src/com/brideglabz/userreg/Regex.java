package com.brideglabz.userreg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) 
    { 
  
		System.out.println("Welcome to User Registration problem");
        String regex_firstname = "[A-Z]{1}(?=.*[a-z]).{2,}";
        String regex_lastname = "[A-Z]{1}(?=.*[a-z]).{2,}";
        String regex_email = "^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[(com)|(co)|(net)]+(?:\\.[a-z]{2,}){0,1}$";
        String regex_mobile_number ="^\\d{2}(\\s{1}\\d{10})$";
        String regex_password1 = "^(?=.*[A-Z])(?=.*\\d)[A-Z 0-9 @$!%?&]{8,}$";
        String regex_password2 = "^[A-Z a-z 0-9]*[@$!%?&][A-Z a-z 0-9]*$";
        
        String firstname = "Ritu";
        String lastname = "Biswas";
        String email = "abc+100@gmail.com"; 
        //"abc@yahoo.com" abc-100@yahoo.com abc.100@yahoo.com abc111@abc.com
        //abc-100@abc.net abc.100@abc.com.au abc@1.com abc@gmail.com.com
        //abc+100@gmail.com Copy+Paste & Check Validity
        String mobile = "91 9223322244";
        String password = "A1B2@C3D";
       
        
        Pattern pattern = Pattern.compile(regex_firstname); 
        Pattern pattern1 = Pattern.compile(regex_lastname); 
        Pattern pattern2 = Pattern.compile(regex_email);
        Pattern pattern3 = Pattern.compile(regex_mobile_number);
        Pattern pattern4_1 = Pattern.compile(regex_password1);
        Pattern pattern4_2 = Pattern.compile(regex_password2);
        
        
        
        Matcher matcher = pattern.matcher(firstname);
        Matcher matcher1 = pattern1.matcher(lastname);
        Matcher matcher2 = pattern2.matcher(email);
        Matcher matcher3 = pattern3.matcher(mobile);
        Matcher matcher4_1 = pattern4_1.matcher(password);
        Matcher matcher4_2 = pattern4_2.matcher(password);
  
        System.out.println("Pattern match for firstname is: " + matcher.find()); 
        System.out.println("Pattern match lastname is: " + matcher1.find()); 
        System.out.println("Pattern match email is: " + matcher2.find()); 
        System.out.println("Pattern match mobile is: " + matcher3.find());
        System.out.println("Pattern match password is: " +(matcher4_1.find()&&matcher4_2.find())); 
        
        
        
    } 
}
