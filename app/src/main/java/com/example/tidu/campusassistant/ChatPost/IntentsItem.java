package com.example.tidu.campusassistant.ChatPost;


import com.google.gson.annotations.SerializedName;

public class IntentsItem{

	@SerializedName("confidence")
	private double confidence;

	@SerializedName("intent")
	private String intent;

	public void setConfidence(double confidence){
		this.confidence = confidence;
	}

	public double getConfidence(){
		return confidence;
	}

	public void setIntent(String intent){
		this.intent = intent;
	}

	public String getIntent(){
		return intent;
	}

	@Override
 	public String toString(){
		return 
			"IntentsItem{" + 
			"confidence = '" + confidence + '\'' + 
			",intent = '" + intent + '\'' + 
			"}";
		}
}