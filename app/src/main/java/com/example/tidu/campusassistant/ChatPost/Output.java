package com.example.tidu.campusassistant.ChatPost;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class Output{

	@SerializedName("intents")
	private List<IntentsItem> intents;

	@SerializedName("entities")
	private List<EntitiesItem> entities;

	@SerializedName("generic")
	private List<GenericItem> generic;

	public void setIntents(List<IntentsItem> intents){
		this.intents = intents;
	}

	public List<IntentsItem> getIntents(){
		return intents;
	}

	public void setEntities(List<EntitiesItem> entities){
		this.entities = entities;
	}

	public List<EntitiesItem> getEntities(){
		return entities;
	}

	public void setGeneric(List<GenericItem> generic){
		this.generic = generic;
	}

	public List<GenericItem> getGeneric(){
		return generic;
	}

	@Override
 	public String toString(){
		return 
			"Output{" + 
			"intents = '" + intents + '\'' + 
			",entities = '" + entities + '\'' + 
			",generic = '" + generic + '\'' + 
			"}";
		}
}