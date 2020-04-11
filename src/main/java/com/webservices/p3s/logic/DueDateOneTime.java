package com.webservices.p3s.logic;

import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;



public class DueDateOneTime {


private LocalDate startDate;

private String[] weekOff;

private int occurrences;


private ArrayList<String> otArr = new ArrayList<String>(); 

	public DueDateOneTime(String userStartDate, int occurrences)
	{
		 
		 if(!userStartDate.isEmpty())
		 {
	  
	  		this.startDate = LocalDate.parse(userStartDate);
  		 
  		 }
		 else
		 {
			
			this.startDate = LocalDate.now();
		  
		  }

		 this.weekOff     = new String[] {
							   //"2020-04-17",
							   //"2020-04-23",
							   //"2020-04-11"
							  };
		 this.occurrences = occurrences;

	}


	public void calDueDateOneTime(){

    List < String > list = Arrays.asList(weekOff);
    
   
	    if (list.contains(startDate.toString()) || (startDate.getDayOfWeek().toString().equals("SUNDAY"))) {

	    otArr.add("This is WeekOff or Sunday");

	    } 
	    else {

	    this.otArr.add(this.startDate.toString());
	    
	    }

	 }

	 public ArrayList<String> getOneTimeDueDateList()
	 {


	 		return this.otArr;


	 }

}