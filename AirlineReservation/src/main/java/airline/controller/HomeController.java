package airline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import airline.model.FlightSearch;

@Controller
public class HomeController 
{
 @RequestMapping("/")
 public String home(@ModelAttribute("f") FlightSearch flightSearch)
 {
  return "index";
 }
 
 @RequestMapping("home")
 public String Home(@ModelAttribute("f") FlightSearch flightSearch)
 {
  return "index";
 }
}
