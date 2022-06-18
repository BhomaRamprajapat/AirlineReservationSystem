package airline.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonPropertyOrder({"src","dst"})
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonIgnoreProperties({"fid","depart","ret"})
@Entity
public class Flight 
{
 @Id  
 @GeneratedValue(strategy =GenerationType.AUTO)
 private int fid;
 
 @Size(min=5,max=30,message = "* flight name must be greater than or equal to 5 Character")
 //@JsonProperty("Flight_Name")
 private String fname;
 
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
 
 @Min(value=1500,message = "* price value must be greater than or equal to 1500")
 @Max(value=10000,message="* price should be less than or equal to 10,000")
 @NotNull(message = "* this field is required")
 private Integer price;
 
 
 @NotNull(message = "* field is required")
 @Min(value=10,message = "* capacity value must be greater than or equal to 10")
 @Max(value=250,message="* capacity should be less than or equal to 250")
 private Integer capacity; 
 private int avail;
 
 @NotBlank(message = "* field is required")
 private String fClass;
 
 public Flight() {}
 
 public Flight(int fid,String fname,String src,String dst,Date depart,Date ret,int capacity,int avail,String fClass)
 {
  this.fid=fid;
  this.fname=fname;
  this.src=src;
  this.dst=dst;
  this.depart=depart;
  this.ret=ret;
  this.capacity=capacity;
  this.avail=avail;
  this.fClass=fClass;
 }
 
 public String getfClass() 
 {
  return fClass;
 }

 public void setfClass(String fClass) 
 {
  this.fClass = fClass;
 }

 public int getFid() 
 {
  return fid;
 }

 public void setFid(int fid) 
 {
  this.fid = fid;
 }

 public String getFname() 
 {
  return fname;
 }

 public void setFname(String fname) 
 {
  this.fname = fname;
 }

 public String getSrc() 
 {
  return src;
 }

 public void setSrc(String src) 
 {
  this.src = src;
 }

 public String getDst() 
 {
  return dst;
 }

 public void setDst(String dst) 
 {
  this.dst = dst;
 }

 public Date getDepart() 
 {
  return depart;
 }

 public void setDepart(Date depart) 
 {
  this.depart = depart;
 }

 public Date getRet() 
 {
  return ret;
 }

 public void setRet(Date ret) 
 {
  this.ret = ret;
 }

 public Integer getPrice() 
 {
  return price;
 }

 public void setPrice(Integer price) 
 {
  this.price = price;
 }

 public Integer getCapacity() 
 {
  return capacity;
 }

 public void setCapacity(Integer capacity) 
 {
  this.capacity = capacity;
 }

 public int getAvail() 
 {
  return avail;
 }

 public void setAvail(int avail) 
 {
  this.avail = avail;
 } 
}
