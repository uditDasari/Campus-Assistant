package com.example.tidu.campusassistant.ChatPost;


import com.google.gson.annotations.SerializedName;

public class Result{

	@SerializedName("output")
	private Output output;

	public void setOutput(Output output){
		this.output = output;
	}

	public Output getOutput(){
		return output;
	}

	@Override
 	public String toString(){
		return 
			"Result{" + 
			"output = '" + output + '\'' + 
			"}";
		}
}