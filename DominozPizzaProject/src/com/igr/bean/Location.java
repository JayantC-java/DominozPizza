package com.igr.bean;

public class Location {
	private int locationCode;
	private int locationDistance;
	private double locationTime;
	
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Location(int locationCode, int locationDistance, double locationTime) {
		super();
		this.locationCode = locationCode;
		this.locationDistance = locationDistance;
		this.locationTime = locationTime;
	}
	
	
	@Override
	public String toString() {
		return "Location [locationCode=" + locationCode + ", locationDistance=" + locationDistance + ", locationTime="
				+ locationTime + "]";
	}
	public int getLocationCode() {
		return locationCode;
	}
	public void setLocationCode(int locationCode) {
		this.locationCode = locationCode;
	}
	public int getLocationDistance() {
		return locationDistance;
	}
	public void setLocationDistance(int locationDistance) {
		this.locationDistance = locationDistance;
	}
	public double getLocationTime() {
		return locationTime;
	}
	public void setLocationTime(double locationTime) {
		this.locationTime = locationTime;
	}
	
	

}
