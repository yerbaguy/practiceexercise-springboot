package com.ebartmedia.practiceexercise.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Word {

	
	private @Id
	@GeneratedValue
//	Long id;
	int id;
//	private String engword;
	private String plword;
//	private int idplword;
	
	
	
	public Word() {
		
		
	}
	
//	public Word(String engword, String plword) {
//		
//		this.engword = engword;
//		this.plword = plword;
//	}
	

	public Word(String plword) {
//    public Word(int idplword) {		
//		this.id = id;
		this.plword = plword;
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
	public void setPlword(String plword) {
//	public void setIdplword(int idplword) {	
	
		this.plword = plword;
	
	}
	
	public String getPlword() {
//	public int getIdplword() {	
		
		return this.plword;
	}

	
	
	
}
