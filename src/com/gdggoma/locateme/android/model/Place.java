/**
 * 
 */
package com.gdggoma.locateme.android.model;

import java.util.Date;

/**
 * @author Mishka
 *
 */
public class Place extends LocateMeObject{

	private String id;
    private String name;
    private String idt;
    private String adress;
    private String description;
    private double latitude;
    private double longitude;
    private int altitude;
    private Date entrydate;
    private String photo;
   
	public Place() {
		super();
	}

	public Place(String id, String name,String idt,String adress, double latitude,double longitude,
			int altitude,Date entrydate,String description, String photo) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.idt=idt;
		this.latitude = latitude;
		this.longitude=longitude;
		this.altitude=altitude;
		this.entrydate=entrydate;
		this.description = description;
		this.photo = photo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdt() {
		return idt;
	}

	public void setIdt(String idt) {
		this.idt = idt;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	public Date getEntrydate() {
		return entrydate;
	}

	public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
}
