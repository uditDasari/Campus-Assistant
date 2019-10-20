package com.example.tidu.campusassistant.ChatPost;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class EntitiesItem{

	@SerializedName("confidence")
	private int confidence;

	@SerializedName("location")
	private List<Integer> location;

	@SerializedName("value")
	private String value;

	@SerializedName("entity")
	private String entity;

	public void setConfidence(int confidence){
		this.confidence = confidence;
	}

	public int getConfidence(){
		return confidence;
	}

	public void setLocation(List<Integer> location){
		this.location = location;
	}

	public List<Integer> getLocation(){
		return location;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	public void setEntity(String entity){
		this.entity = entity;
	}

	public String getEntity(){
		return entity;
	}

	@Override
 	public String toString(){
		return 
			"EntitiesItem{" + 
			"confidence = '" + confidence + '\'' + 
			",location = '" + location + '\'' + 
			",value = '" + value + '\'' + 
			",entity = '" + entity + '\'' + 
			"}";
		}
}