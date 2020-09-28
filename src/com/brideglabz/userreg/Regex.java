package com.brideglabz.userreg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) 
    { 
  
		System.out.println("Welcome to User Registration problem");
        String regex_firstname = "[A-Z]{1}(?=.*[a-z]).{2,}";
        
        String firstname = "Ritu"; 
       
        
        Pattern pattern = Pattern.compile(regex_firstname); 
  
        
        
        Matcher matcher = pattern.matcher(firstname); 
  
        System.out.println("Pattern match is: " + matcher.find()); 
        
        
    } 
}
