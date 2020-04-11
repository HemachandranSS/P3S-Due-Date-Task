package com.webservices.p3s.logic;

import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;



public class DueDateYearly {


private LocalDate startDate;

private String[] weekOff;

private int occurrences;


private ArrayList<String> yearlyArr = new ArrayList<String>(); 

	public DueDateYearly(String userStartDate, int occurrences)
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


	public void calDueDateYearly(){

    List < String > list = Arrays.asList(weekOff);
    
    int j = 0;
    
    for (int i = occurrences; i > 0; i--) {

	     LocalDate ldNew = startDate.plusYears(j);

	     if (ldNew.getDayOfWeek().toString().equals("SUNDAY") || (list.contains(ldNew.toString()))) {

	      i = i + 1;

	     }
	     else {
	      
	      this.yearlyArr.add(ldNew.toString());
	     
	     }

	     j = j + 1;
	    }

	 }

	 public ArrayList<String> getYearlyDueDateList()
	 {


	 		return this.yearlyArr;


	 }

}