package com.springcores;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestStudent 
{
  @Value("Altaf Malik Mumbai")
  private String studentName;
  
  @Value("City Mumbai Sakinaka")
  private String city;
  
  @Value("#{temp}")//yaha per aapne <bean> ka name dena padta hai but hamare <bean>name hai emp
  private List<String> address;
  //iss value ko daalne key liye standalone bana padega
  public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
@Override
public String toString() {
	return "TestStudent [studentName=" + studentName + ", city=" + city + "]";
}
  

}
