package com.webservices.p3s.logic;

import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;



public class DueDateMonthly {


private LocalDate startDate;

private String[] weekOff;

private int occurrences;


private ArrayList<String> monthlyArr = new ArrayList<String>();   

	public DueDateMonthly(String userStartDate, int occurrences)
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
							   "2020-04-17",
							   "2020-04-23",
							   "2020-04-11"
							  };
		 this.occurrences = occurrences;

	}


	public void calDueDateMonthly(){

    List < String > list = Arrays.asList(weekOff);
    
    int j = 0;
    
    for (int i = occurrences; i > 0; i--) {

	     LocalDate ldNew = startDate.plusMonths(j);

	     if (ldNew.getDayOfWeek().toString().equals("SUNDAY") || (list.contains(ldNew.toString()))) {

	      i = i + 1;

	     }
	     else {
	      
	      this.monthlyArr.add(ldNew.toString());
	     
	     }

	     j = j + 1;
	    }

	 }

	 public ArrayList<String> getDueDateMonthlyList()
	 {


	 		return this.monthlyArr;


	 }

}