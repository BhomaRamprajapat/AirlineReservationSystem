package airline.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User
{
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private int uid;
 
 @Size(min=5,max=30,message="* lenght should be between 5 and 30")
 private String uname;
 
 @Email(message = "* enter a valid email")
 @NotBlank(message = "* required field")
 private String mail;
 
 
 @Pattern(regexp="^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$",message ="* password must contain eight characters, at least one letter, one number and one special character")
 private String pass;
 
 @NotBlank(message = "required field")
 private String address;
  
 @Pattern(regexp="^[A-PR-WYa-pr-wy][1-9]\\d\\s?\\d{4}[1-9]$",message = "* enter a valid passport number") 
 private String passport;

 public int getUid() 
 {
	return uid;
 }


 public void setUid(int uid) 
 {
	this.uid = uid;
 }

 public String getUname() 
 {
	return uname;
 }

 public void setUname(String uname) 
 {
	this.uname = uname;
 }

 public String getMail() 
 {
  return mail;
 }

 public void setMail(String mail) 
 {
	this.mail = mail;
 }

 public String getPass() 
 {
	return pass;
 }

 public void setPass(String pass) 
 {
	this.pass = pass;
 }

 public String getAddress() 
 {
	return address;
 }

 public void setAddress(String address) 
 {
	this.address = address;
 }

 public String getPassport() 
 {
	return passport;
 }

 public void setPassport(String passport) 
 {
	this.passport = passport;
 }
}













