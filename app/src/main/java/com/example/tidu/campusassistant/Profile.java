package com.example.tidu.campusassistant;

public class Profile {
    String fname,lname,email,uname,address,phn,fblink;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public String getFblink() {
        return fblink;
    }

    public void setFblink(String fblink) {
        this.fblink = fblink;
    }

    public Profile(String fname, String lname, String email, String uname, String address, String phn, String fblink) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.uname = uname;
        this.address = address;
        this.phn = phn;
        this.fblink = fblink;
    }
}
