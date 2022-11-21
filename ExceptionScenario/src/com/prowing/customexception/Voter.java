package com.prowing.customexception;

public class Voter {
	int vid;
	String vname;
	int vAge;
	String country;
	public Voter() {
		
	}
	public Voter(int vid, String vname, int vAge, String country) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vAge = vAge;
		this.country = country;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public int getvAge() {
		return vAge;
	}
	public void setvAge(int vAge) {
		this.vAge = vAge;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Voter [vid=" + vid + ", vname=" + vname + ", vAge=" + vAge + ", country=" + country + "]";
	}
	
	
	

}
