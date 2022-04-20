package com.katebarber.fruityloops.models;

public class Item {
	
	
    // Member Variables
	public String name;
	public double price;
	
	
    // Constructor	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
		
		
	// Getter and Setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

}
