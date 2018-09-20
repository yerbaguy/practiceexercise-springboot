package com.ebartmedia.practiceexercise.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Wordnumber {

	
	private @Id
	@GeneratedValue
//	Long id;
	int id;
//	private String engword;
//	private int wordnumber;
	private float wordnumber;
	
	public Wordnumber() {
		
		
	}
	
//	public Word(String engword, String plword) {
//		
//		this.engword = engword;
//		this.plword = plword;
//	}
	

	public Wordnumber(float wordnumber) { //int wordnumber
	
		
//		this.id = id;
		this.wordnumber = wordnumber;
	}

	
	
	
	
//	public void setEngword(String engword) {
//		
//		this.engword = engword;
//	}
//	
//	public String getEngword() {
//		
//		return this.engword;
//	}
//	
	public void setWordnumber(float wordnumber) {
	
	     this.wordnumber = wordnumber;
	
	}
	
	public float getWordnumber() {
		
		return this.wordnumber;
	}

	
	
	
}
