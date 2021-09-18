package com.cts.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MedicalTests {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String testId;
	private String testName;
	private String testPrice;
	public MedicalTests() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MedicalTests(String testName, String testPrice) {
		super();
		this.testName = testName;
		this.testPrice = testPrice;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestPrice() {
		return testPrice;
	}
	public void setTestPrice(String testPrice) {
		this.testPrice = testPrice;
	}
	
	
	

}
