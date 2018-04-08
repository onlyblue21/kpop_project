package main.controller;
 
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.Form.MemberForm;
 

@Controller
public class MainController {
 
  @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
         
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
          
        String formattedDate = dateFormat.format(date);
          
        model.addAttribute("serverTime", formattedDate );
        System.out.println("tes1");
        
        
        
        
        return "index";
    }
  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String login(MemberForm vo,Locale locale, Model model) {

	  System.out.println("id= " + vo.getUserId());
	  System.out.println("pw= " + vo.getUserPassword());
	  
	  System.out.println("tes2");
	  
	  
	  return "index";
  }
  @RequestMapping(value= "/userChk",method = RequestMethod.POST)
  public String userChk() {
	  
	  
	  
	  return "";
  }
  
 
}
