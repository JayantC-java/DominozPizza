package com.igr.bean;

public class Location {
	private int locationId;
	private int locationDist;
	private int locationTime;
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Location(int locationId, int locationDist, int locationTime) {
		super();
		this.locationId = locationId;
		this.locationDist = locationDist;
		this.locationTime = locationTime;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public int getLocationDist() {
		return locationDist;
	}
	public void setLocationDist(int locationDist) {
		this.locationDist = locationDist;
	}
	public int getLocationTime() {
		return locationTime;
	}
	public void setLocationTime(int locationTime) {
		this.locationTime = locationTime;
	}
	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationDist=" + locationDist + ", locationTime="
				+ locationTime + "]";
	}
	

}
