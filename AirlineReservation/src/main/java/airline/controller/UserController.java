package airline.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import airline.model.User;
import airline.model.UserLogin;
import airline.service.UserService;

@Controller
public class UserController 
{
 @Autowired
 private UserService userService;
 
 @RequestMapping("/signup")
 public String signupPage(@ModelAttribute("user") User user)
 {
  return "signup";
 }
 
 @PostMapping("/signupForm")
 public String signupForm(@Valid @ModelAttribute("user") User user,BindingResult result)
 {
  if(result.hasErrors())
  {
   return "signup";
  }
  userService.saveUser(user);
  return "redirect:/";
 }
 
 @RequestMapping("/login")
 public String loginPage(@ModelAttribute("userLogin") UserLogin userLogin)
 {
  return "userLogin";	 
 }
 
 @PostMapping("/userLogin")
 public String userLogin(@Valid @ModelAttribute("userLogin") UserLogin userLogin,BindingResult result)
 {
  if(result.hasErrors())
  {
   return "userLogin";
  }
  return "redirect:/";
 }
}
