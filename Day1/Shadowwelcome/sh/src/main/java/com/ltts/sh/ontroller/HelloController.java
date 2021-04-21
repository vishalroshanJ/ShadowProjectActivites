package com.ltts.sh.ontroller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

	
	
	@RequestMapping("/time")
	 public String getCurrentTimeUsingDate() {
	        Date date = new Date();
	        String strDateFormat = "hh:mm:ss a";
	        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
	        String formattedDate= dateFormat.format(date);
	        System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate);
			return formattedDate;
	    }
	@RequestMapping("/in")
	public ModelAndView viewHomePage() {
		return new ModelAndView("index");
	}
	@RequestMapping("/ater")
	public ModelAndView viePage() {
		return new ModelAndView("afthernoon");
	}
	@RequestMapping("/even")
	public ModelAndView vieevenPage() {
		return new ModelAndView("evening");
	}
	@RequestMapping("/night")
	public ModelAndView vienightPage() {
		return new ModelAndView("night");
	}
	@RequestMapping("/message")
	 public ModelAndView  getCurrentTimeUsing()
	 {
	Calendar cal = Calendar.getInstance();
	Date date = new Date();
    String strDateFormat = "hh:mm:ss a";
    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
    String formattedDate= dateFormat.format(date);
    int hour = cal.get( Calendar.HOUR_OF_DAY );
    int month = cal.get( Calendar.MONTH );
    String mess=null;
    String message=null;
    System.out.println(hour);
    System.out.println(month);
    if(hour>=1 && hour<12)
    {
      mess = "Good Morning!!";
      System.out.println(hour);
      return new ModelAndView("index");
    }else if(hour>=12 && hour<16)
    { mess = "Good Afternoon!!";
    return new ModelAndView("afthernoon");
    }else if(hour>=16 && hour<21)
    { mess = "Good Evening!!";
    return new ModelAndView("evening");
    } else if(hour>=21 && hour<24)
    { mess= "Good Night!!";
    return new ModelAndView("night");
    }  
    message= mess+" Vishal ! Welcome to First Project Activity Current Time is : "+formattedDate;
	/*
	 * if( hour == 5 ) { if( month > 2 && month < 9 ) { System.out.println(
	 * "Good morning!" ); mess="Good morning!"+hour; } else { System.out.println(
	 * "Good night!" ); mess="Good night!"+hour; } } else if( hour > 5 && hour < 12
	 * ) { System.out.println( "Good morning!" ); mess="Good morning!"+hour; } else
	 * if( hour > 11 && hour < 17 ) { System.out.println( "Good afternoon!" );
	 * mess="Good afternoon!"+hour; } else if( hour == 17 ) { if( month > 2 && month
	 * < 9 ) { System.out.println( "Good afternoon!" ); mess="Good afternoon!"+hour;
	 * } else { System.out.println( "Good evening!" ); mess="Good evening!"+hour; }
	 * } else if( hour > 17 && hour < 19 ) { System.out.println( "Good evening!" );
	 * mess="Good evening!"+hour; } else { System.out.println( "Good night!" );
	 * mess="Good night!"+hour; }
	 */
	return new ModelAndView("index");
}
	
	
}
