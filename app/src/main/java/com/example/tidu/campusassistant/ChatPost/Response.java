package com.example.tidu.campusassistant.ChatPost;


import com.google.gson.annotations.SerializedName;


public class Response{

	@SerializedName("result")
	private Result result;

	@SerializedName("headers")
	private Headers headers;

	@SerializedName("statusText")
	private String statusText;

	@SerializedName("status")
	private int status;

	public void setResult(Result result){
		this.result = result;
	}

	public Result getResult(){
		return result;
	}

	public void setHeaders(Headers headers){
		this.headers = headers;
	}

	public Headers getHeaders(){
		return headers;
	}

	public void setStatusText(String statusText){
		this.statusText = statusText;
	}

	public String getStatusText(){
		return statusText;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"result = '" + result + '\'' + 
			",headers = '" + headers + '\'' + 
			",statusText = '" + statusText + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}