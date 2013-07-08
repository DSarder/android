package com.drinkcount.drink;

public class Drink {
	private String name;
	private String piclink;
	private int alcoholpercent;
	private int standarddrinks;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPicLink() {
		return piclink;
	}
	
	public void setPicLink(String piclink) {
		this.piclink = piclink;
	}
	
	public int getAlcoholPercent() {
		return alcoholpercent;
	}
	
	public void setAlcoholPercent(int alcoholpercent) {
		this.alcoholpercent = alcoholpercent;
	}
	
	public int getStandardDrinks() {
		return standarddrinks;
	}
	
	public void setStandardDrinks(int standarddrinks) {
		this.standarddrinks = standarddrinks;
	}
	
	public Drink(String name, String piclink, int alcoholpercent, int standarddrinks){
		this.name = name;
		this.piclink = piclink;
		this.alcoholpercent = alcoholpercent;
		this.standarddrinks = standarddrinks;
	}
	
	public Drink(String name, int alcoholpercent, int standarddrinks){
		this.name = name;
		this.piclink = null;
		this.alcoholpercent = alcoholpercent;
		this.standarddrinks = standarddrinks;
	}
	
	public Drink(String name, int standarddrinks){
		this.name = name;
		this.piclink = null;
		this.alcoholpercent = 0;
		this.standarddrinks = standarddrinks;
	}
}
