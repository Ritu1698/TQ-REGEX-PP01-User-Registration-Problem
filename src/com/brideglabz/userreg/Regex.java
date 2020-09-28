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
        
        String firstname = "Ritu";
        String lastname = "Biswas";
        String email = "abc.xyz@bridgelabz.co.in"; 
       
        
        Pattern pattern = Pattern.compile(regex_firstname); 
        Pattern pattern1 = Pattern.compile(regex_lastname); 
        Pattern pattern2 = Pattern.compile(regex_email); 
        
        
        
        Matcher matcher = pattern.matcher(firstname);
        Matcher matcher1 = pattern1.matcher(lastname);
        Matcher matcher2 = pattern2.matcher(email);
  
        System.out.println("Pattern match for firstname is: " + matcher.find()); 
        System.out.println("Pattern match lastname is: " + matcher1.find()); 
        System.out.println("Pattern match email is: " + matcher2.find()); 
        
        
        
    } 
}
