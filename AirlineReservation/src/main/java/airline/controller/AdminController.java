package airline.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import airline.model.AdminLogin;
import airline.model.Flight;
import airline.model.FlightSearch;
import airline.model.User;
import airline.service.FlightService;

@Controller
@EnableWebMvc
public class AdminController 
{
 @Autowired
 FlightService flightService;
 
 @PostMapping("/search")
 public String FlightSearch(@Valid @ModelAttribute("f") FlightSearch flightSearch,BindingResult result,RedirectAttributes rda)
 {
  if(result.hasErrors())
  {
   return "index";
  }
  rda.addFlashAttribute("f",flightSearch);
  return "redirect:searchF";
 }
 
 @RequestMapping("/searchF")
 public ModelAndView FlightSearchShow(@ModelAttribute("f") FlightSearch flightSearch)
 {
  List<Flight> lst=flightService.getFlights(flightSearch);

  ModelAndView mav=new ModelAndView();
  mav.setViewName("search");
  mav.addObject("f",lst);
  mav.addObject("fSearch",flightSearch);
  return mav;
 }
 
 @RequestMapping("/adminForm")
 public String adminForm(@ModelAttribute("adminLogin") AdminLogin adminLogin)
 {
  return "adminForm";
 }
 
 @PostMapping("/admin")
 public String adminLogin(@Valid @ModelAttribute("adminLogin") AdminLogin adminLogin,BindingResult result)
 {
  if(result.hasErrors())
  {
   return "adminForm";
  }
  else if(adminLogin.getPass().equals("Bhoma@123") && adminLogin.getUname().equals("Bhoma"))
   return "redirect:show";
  adminLogin.setStatus(false);
  return "adminForm";
 }
 
 @RequestMapping("/addFlight")
 public String addview(@ModelAttribute("flight") Flight Flight)
 {
  return "addFlight";
 }
 
 @InitBinder
 private void dateBinder(WebDataBinder binder) 
 {
             //The date format to parse or output your dates
     SimpleDateFormat dateFormat = new SimpleDateFormat("y-MM-dd");
             //Create a new CustomDateEditor
     CustomDateEditor editor = new CustomDateEditor(dateFormat, true);
             //Register it as custom editor for the Date type
     binder.registerCustomEditor(Date.class, editor);
 }
 
 @PostMapping("/add")
 public String addFlight(@Valid @ModelAttribute Flight flight,BindingResult result)
 {
  if(result.hasErrors())
  {
   System.out.println("Error occured");
   return "addFlight";
  }
  flight.setAvail(flight.getCapacity());
  flightService.saveFlight(flight);
  return "redirect:/show";
 }
 
 @RequestMapping("/book/{fid}")
 public String book(@PathVariable("fid") int fid,HttpSession session)
 {
  session.setAttribute("fid",fid);	 	 
  return "redirect:/bookFlight";	 
 }
 
 @RequestMapping("/bookFlight")
 public String passangerForm(@ModelAttribute("user") User user)
 {
  return "passangerInfo";
 }
 
 @PostMapping("/passangerDetail")
 public String bookFlight(@Valid @ModelAttribute("user") User user,BindingResult result,RedirectAttributes rda)
 {
  if(result.hasErrors())
  {
   return "passangerInfo";
  }
  rda.addFlashAttribute("user",user);
  return "redirect:/success";
 }
 
 @RequestMapping("/success")
 public String success(@ModelAttribute("user") User user)
 {
  return "success";
 }
 
 @RequestMapping("/update/{fid}")
 public String update(@PathVariable("fid") int fid,RedirectAttributes rda)
 {
  rda.addFlashAttribute("fid",fid);
  return "redirect:/updateF"; 
 }
 
 @RequestMapping("/updateF")
 public ModelAndView updateF(@ModelAttribute("fid") int fid)
 {
  Flight flight=flightService.getFlight(fid);
  return new ModelAndView("update","flight",flight);
 }
 
 @PostMapping("/updateFlight")
 public String updateFlight(@ModelAttribute Flight flight)
 { 
  flightService.update(flight);  
  return "redirect:/show";
 }    
 
 @RequestMapping("/delete/{fid}")
 public String deleteFlight(@PathVariable("fid") int fid)
 {
  flightService.deleteFlight(fid);
  return "redirect:/show";
 }
 
 @RequestMapping("/show")
 public ModelAndView showFlights()
 {
  ModelAndView mav=new ModelAndView();
  mav.setViewName("admin");
  mav.addObject("flight",flightService.allFlights());
  return mav;  
 } 
}
