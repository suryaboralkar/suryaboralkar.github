package com.xworkz.xworkzapp.crud.linkedlist;

public class BagDto {
	private String brandName;
	private int price;
	private int noOfZips;
	private int capacity;
	public BagDto(String brandName, int price, int noOfZips, int capacity) {
		super();
		this.brandName = brandName;
		this.price = price;
		this.noOfZips = noOfZips;
		this.capacity = capacity;
	}
	public BagDto() {
		// TODO Auto-generated constructor stub
	}
	public String getBrandName() {
		return brandName;
	}
	public int getPrice() {
		return price;
	}
	public int getNoOfZips() {
		return noOfZips;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setNoOfZips(int noOfZips) {
		this.noOfZips = noOfZips;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "BagDto [brandName=" + brandName + ", price=" + price + ", noOfZips=" + noOfZips + ", capacity="
				+ capacity + "]";
	}
	
	

}
