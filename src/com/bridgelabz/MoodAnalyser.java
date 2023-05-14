package com.bridgelabz;

import java.util.Scanner;

public class MoodAnalyser {
	
     String message;

	 public MoodAnalyser(String message) {
	        this.message = message;
	    }

	    public MoodAnalyser() {

	    }
	    
	    public String moodAnalysis() {
	        boolean status = message.toLowerCase().contains("sad");
	        if (status == true) {
	            return "Sad";
	        } else {
	            return "Happy";
	        }
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter message : ");
	        String message = input.nextLine();
	        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
	        String result = moodAnalyser.moodAnalysis();
	        System.out.println(result);
	    }

}
