package com.example.tidu.campusassistant.sampledata;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

public class Owner{

	@SerializedName("firstname")
	private String firstname;

	@SerializedName("showroom")
	private boolean showroom;

	@SerializedName("hostel")
	private String hostel;

	@SerializedName("showphone")
	private boolean showphone;

	@SerializedName("admin")
	private boolean admin;

	@SerializedName("room")
	private String room;

	@SerializedName("facebookProfile")
	private String facebookProfile;

	@SerializedName("lastname")
	private String lastname;

	@SerializedName("phone")
	private long phone;

	@SerializedName("__v")
	private int V;

	@SerializedName("block")
	private String block;

	@SerializedName("_id")
	private String id;

	@SerializedName("showfacebook")
	private boolean showfacebook;

	@SerializedName("email")
	private String email;

	@SerializedName("username")
	private String username;

	public void setFirstname(String firstname){
		this.firstname = firstname;
	}

	public String getFirstname(){
		return firstname;
	}

	public void setShowroom(boolean showroom){
		this.showroom = showroom;
	}

	public boolean isShowroom(){
		return showroom;
	}

	public void setHostel(String hostel){
		this.hostel = hostel;
	}

	public String getHostel(){
		return hostel;
	}

	public void setShowphone(boolean showphone){
		this.showphone = showphone;
	}

	public boolean isShowphone(){
		return showphone;
	}

	public void setAdmin(boolean admin){
		this.admin = admin;
	}

	public boolean isAdmin(){
		return admin;
	}

	public void setRoom(String room){
		this.room = room;
	}

	public String getRoom(){
		return room;
	}

	public void setFacebookProfile(String facebookProfile){
		this.facebookProfile = facebookProfile;
	}

	public String getFacebookProfile(){
		return facebookProfile;
	}

	public void setLastname(String lastname){
		this.lastname = lastname;
	}

	public String getLastname(){
		return lastname;
	}

	public void setPhone(long phone){
		this.phone = phone;
	}

	public long getPhone(){
		return phone;
	}

	public void setV(int V){
		this.V = V;
	}

	public int getV(){
		return V;
	}

	public void setBlock(String block){
		this.block = block;
	}

	public String getBlock(){
		return block;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setShowfacebook(boolean showfacebook){
		this.showfacebook = showfacebook;
	}

	public boolean isShowfacebook(){
		return showfacebook;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"Owner{" + 
			"firstname = '" + firstname + '\'' + 
			",showroom = '" + showroom + '\'' + 
			",hostel = '" + hostel + '\'' + 
			",showphone = '" + showphone + '\'' + 
			",admin = '" + admin + '\'' + 
			",room = '" + room + '\'' + 
			",facebookProfile = '" + facebookProfile + '\'' + 
			",lastname = '" + lastname + '\'' + 
			",phone = '" + phone + '\'' + 
			",__v = '" + V + '\'' + 
			",block = '" + block + '\'' + 
			",_id = '" + id + '\'' + 
			",showfacebook = '" + showfacebook + '\'' + 
			",email = '" + email + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}