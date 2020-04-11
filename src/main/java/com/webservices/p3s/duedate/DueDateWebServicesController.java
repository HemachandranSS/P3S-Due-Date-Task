package com.webservices.p3s.duedate;

import org.springframework.web.bind.annotation.*;
import com.webservices.p3s.logic.DueDateDaily;
import com.webservices.p3s.logic.DueDateWeekly;
import com.webservices.p3s.logic.DueDateMonthly;
import com.webservices.p3s.logic.DueDateOneTime;
import com.webservices.p3s.logic.DueDateYearly;
import java.util.ArrayList;

@RestController
public class DueDateWebServicesController {


  @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
  public String helloWorld(){

	return "Hello World Hemachandran";
  }

  @RequestMapping(method = RequestMethod.GET, path="/daily-due-date")
  public ArrayList<String> dueDateDaily(@RequestParam(required = false, defaultValue = "0") String occurrences, @RequestParam(required = false,defaultValue = "") String date){

  	int occur = Integer.parseInt(occurrences.trim());
  	DueDateDaily daily = new DueDateDaily(date,occur);
  	
  	daily.calDueDateDaily();

  	return daily.getDailyDueDateList();
  }

  @RequestMapping(method = RequestMethod.GET, path="/weekly-due-date")
  public ArrayList<String> dueDateWeekly(@RequestParam(required = false, defaultValue = "0") String occurrences, @RequestParam(required = false,defaultValue = "") String date){

  	int occur = Integer.parseInt(occurrences.trim());
  	
  	DueDateWeekly weekly = new DueDateWeekly(date,occur);
  	
  	weekly.calDueDateWeekly();

  	return weekly.getDueDateWeeklyList();


  }


    @RequestMapping(method = RequestMethod.GET, path="/monthly-due-date")
    public ArrayList<String> dueDateMonthly(@RequestParam(required = false, defaultValue = "0") String occurrences, @RequestParam(required = false,defaultValue = "") String date){

  	int occur = Integer.parseInt(occurrences.trim());
  	
  	DueDateMonthly monthly = new DueDateMonthly(date,occur);
  	
  	monthly.calDueDateMonthly();

  	return monthly.getDueDateMonthlyList();

  	}


  	@RequestMapping(method = RequestMethod.GET, path="/yearly-due-date")
    
    public ArrayList<String> dueDateYearly(@RequestParam(required = false, defaultValue = "0") String occurrences, @RequestParam(required = false,defaultValue = "") String date){

  	int occur = Integer.parseInt(occurrences.trim());
  	
  	DueDateYearly yearly = new DueDateYearly(date,occur);
  	
  	yearly.calDueDateYearly();

  	return yearly.getYearlyDueDateList();

  }


   	@RequestMapping(method = RequestMethod.GET, path="/onetime-due-date")
    
    public ArrayList<String> dueDateOneTime(@RequestParam(required = false, defaultValue = "0") String occurrences, @RequestParam(required = false,defaultValue = "") String date){

  	int occur = Integer.parseInt(occurrences.trim());
  	
  	DueDateOneTime ot = new DueDateOneTime(date,occur);
  	
  	ot.calDueDateOneTime();

  	return ot.getOneTimeDueDateList();

  }

}