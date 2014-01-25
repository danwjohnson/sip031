// Source project: sip03, branch: 01 (Maven Project)
package com.springinpractice.ch03.model;

public class Member {

	private String firstName;
	private String lastName;
	
	public Member() {}
	
	public Member(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
	} // end constructor
	
	
	public String getFirstName() {
		
		return firstName;
		
	} // end getFirstName()
	
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
		
	} // end setFirstName()
	
	
	public String getLastName() {
		
		return lastName;
		
	} // end getLastName()
	
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
		
	} // end setLastName()
	
	
	public String toString() {
		
		return firstName + " " + lastName;
		
	} // end toString()
	
} // end Member class
