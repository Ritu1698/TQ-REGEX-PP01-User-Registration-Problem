package com.brideglabz.userreg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) 
    { 
  
		System.out.println("Welcome to User Registration problem");
        String regex_firstname = "[A-Z]{1}(?=.*[a-z]).{2,}";
        String regex_lastname = "[A-Z]{1}(?=.*[a-z]).{2,}";
        
        String firstname = "Ritu";
        String lastname = "Biswas";
       
        
        Pattern pattern = Pattern.compile(regex_firstname); 
        Pattern pattern1 = Pattern.compile(regex_lastname); 
        
        
        Matcher matcher = pattern.matcher(firstname);
        Matcher matcher1 = pattern1.matcher(lastname);
  
        System.out.println("Pattern match for firstname is: " + matcher.find()); 
        System.out.println("Pattern match lastname is: " + matcher1.find()); 
        
        
    } 
}
