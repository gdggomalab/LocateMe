/**
 * 
 */
package com.gdggoma.locateme.android.model;

/**
 * @author Mishka
 *
 */
public class Town extends LocateMeObject{
	
	private String idt;
	private String nametown;
	private String country;
	
	public Town(){
		super();
	}
	
	public Town(String idt,String nametown,String country){
		super();
		this.idt=idt;
		this.nametown=nametown;
		this.country=country;
	}

	public String getIdt() {
		return idt;
	}

	public void setIdt(String idt) {
		this.idt = idt;
	}

	public String getNametown() {
		return nametown;
	}

	public void setNametown(String nametown) {
		this.nametown = nametown;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
