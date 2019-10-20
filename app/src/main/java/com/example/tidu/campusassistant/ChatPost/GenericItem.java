package com.example.tidu.campusassistant.ChatPost;


import com.google.gson.annotations.SerializedName;

public class GenericItem{

	@SerializedName("response_type")
	private String responseType;

	@SerializedName("source")
	private String source;
	@SerializedName("text")
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setResponseType(String responseType){
		this.responseType = responseType;
	}

	public String getResponseType(){
		return responseType;
	}

	public void setSource(String source){
		this.source = source;
	}

	public String getSource(){
		return source;
	}

	@Override
 	public String toString(){
		return 
			"GenericItem{" + 
			"response_type = '" + responseType + '\'' + 
			",source = '" + source + '\'' + 
			"}";
		}
}