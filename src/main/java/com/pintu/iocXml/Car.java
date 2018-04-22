package com.pintu.iocXml;

public class Car {
	int price;
	String color;
	int noOfSeatings;
	Coach coach;
	String brand;
	public Car(int price,String color, int noOfSeatings){
		this.price = price;
		this.color = color;
		this.noOfSeatings = noOfSeatings;
	}
	public void setCoach(BaseBallCoach coach){
		this.coach=coach;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
public Car(){
	
}
public String toString(){
	return "price : "+ this.price +  " color : " + this.color + " noOfSeatings : " + this.noOfSeatings + " BrandName : " + brand + " " + this.coach.getDailyWorkOut();
}
}
