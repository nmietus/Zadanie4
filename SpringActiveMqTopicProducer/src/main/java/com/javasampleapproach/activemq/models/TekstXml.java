package com.javasampleapproach.activemq.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
 
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id", scope = TekstXml.class)
public class TekstXml {
    private String name;
 
	
    public TekstXml(){
    }
    
    public TekstXml(String name){
    	this.name = name;
    }
    
    // name
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    

	/**
	 * 
	 * Show Detail View
	 */
	public String toString(){
	String test = "test123";
		return test;
	}
 
}