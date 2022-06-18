package airline.model;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.NotBlank;

public class AdminLogin 
{
 @NotBlank(message = "* required field")
 private String uname;
 
 @NotBlank(message = "* required field")
 private String pass;
 
 @AssertFalse(message = "* invalid username or password")
 private boolean status;
 
 public boolean isStatus()  
 {
	return status;
 }

 public void setStatus(boolean status) 
 {
	this.status = status;
 }

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