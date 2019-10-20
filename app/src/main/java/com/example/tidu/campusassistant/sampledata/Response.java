package com.example.tidu.campusassistant.sampledata;

import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;


public class Response{

	@SerializedName("owner")
	private Owner owner;

	@SerializedName("sold")
	private boolean sold;

	@SerializedName("images")
	private List<String> images;

	@SerializedName("incr")
	private int incr;

	@SerializedName("description")
	private String description;

	@SerializedName("createdAt")
	private String createdAt;

	@SerializedName("approved")
	private boolean approved;

	@SerializedName("max_bid")
	private int maxBid;

	@SerializedName("price")
	private int price;

	@SerializedName("cat")
	private String cat;

	@SerializedName("__v")
	private int V;

	@SerializedName("name")
	private String name;

	@SerializedName("_id")
	private String id;

	@SerializedName("bid")
	private boolean bid;

	@SerializedName("views")
	private int views;

	@SerializedName("updatedAt")
	private String updatedAt;

	public void setOwner(Owner owner1){
		owner = owner1;
	}

	public Owner getOwner(){
		return owner;
	}

	public void setSold(boolean sold){
		this.sold = sold;
	}

	public boolean isSold(){
		return sold;
	}

	public void setImages(List<String> images){
		this.images = images;
	}

	public List<String> getImages(){
		return images;
	}

	public void setIncr(int incr){
		this.incr = incr;
	}

	public int getIncr(){
		return incr;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setApproved(boolean approved){
		this.approved = approved;
	}

	public boolean isApproved(){
		return approved;
	}

	public void setMaxBid(int maxBid){
		this.maxBid = maxBid;
	}

	public int getMaxBid(){
		return maxBid;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setCat(String cat){
		this.cat = cat;
	}

	public String getCat(){
		return cat;
	}

	public void setV(int V){
		this.V = V;
	}

	public int getV(){
		return V;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setBid(boolean bid){
		this.bid = bid;
	}

	public boolean isBid(){
		return bid;
	}

	public void setViews(int views){
		this.views = views;
	}

	public int getViews(){
		return views;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"owner = '" + owner + '\'' + 
			",sold = '" + sold + '\'' + 
			",images = '" + images + '\'' + 
			",incr = '" + incr + '\'' + 
			",description = '" + description + '\'' + 
			",createdAt = '" + createdAt + '\'' + 
			",approved = '" + approved + '\'' + 
			",max_bid = '" + maxBid + '\'' + 
			",price = '" + price + '\'' + 
			",cat = '" + cat + '\'' + 
			",__v = '" + V + '\'' + 
			",name = '" + name + '\'' + 
			",_id = '" + id + '\'' + 
			",bid = '" + bid + '\'' + 
			",views = '" + views + '\'' + 
			",updatedAt = '" + updatedAt + '\'' + 
			"}";
		}
}