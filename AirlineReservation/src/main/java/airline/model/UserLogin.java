package airline.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class UserLogin 
{
 @NotBlank(message = "* required field")
 private String uname;
 
 @Pattern(regexp="^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$",message ="* password must contain eight characters, at least one letter, one number and one special character")
 private String pass;

 public String getUname() 
 {
	return uname;
 }

 public void setUname(String uname) 
 {
	this.uname = uname;
 }

 public String getPass() 
 {
	return pass;
 }

 public void setPass(String pass) 
 {
	this.pass = pass;
 } 
}
