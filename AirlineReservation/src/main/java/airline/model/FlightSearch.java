package airline.model;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class FlightSearch
{
 @Size(min=5,max=30,message="* source must be greater than 1 Character")
 private String src;
 
 @Size(min=1,max=30,message="* destination must be greater than 1 Character")
 private String dst;
 
 @FutureOrPresent(message="* enter a valid date")
 @NotNull(message="* this field is required")
 @DateTimeFormat(pattern = "y-MM-dd")
 @Temporal(TemporalType.DATE)
 private Date depart;
 
 @FutureOrPresent(message = "* enter a valid date")
 @NotNull(message="* this field is required")
 @DateTimeFormat(pattern = "y-MM-dd")
 @Temporal(TemporalType.DATE)
 private Date ret;
 
 @NotBlank(message = "* field is required")
 private String fClass;


public String getSrc() {
	return src;
}


public void setSrc(String src) {
	this.src = src;
}


public String getDst() {
	return dst;
}


public void setDst(String dst) {
	this.dst = dst;
}


public Date getDepart() {
	return depart;
}


public void setDepart(Date depart) {
	this.depart = depart;
}


public Date getRet() {
	return ret;
}


public void setRet(Date ret) {
	this.ret = ret;
}

public String getfClass() {
	return fClass;
}


public void setfClass(String fClass) {
	this.fClass = fClass;
}
 
 
}
