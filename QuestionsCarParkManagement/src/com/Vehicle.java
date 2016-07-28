package com;

//super class
public class Vehicle {

	private String model;
	private String color;
	private int numOfWheels;
	private String transmission;

	// default constructor
	public Vehicle() {

	}

	// constructor
	public Vehicle(String model, String color, int numOfWheels, String transmission) {
		this.model = model;
		this.color = color;
		this.numOfWheels = numOfWheels;
		this.transmission = transmission;
	}

	// getters
	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int NumOfWheels() {
		return numOfWheels;
	}

	public String transmission() {
		return transmission;
	}

	// setters
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	// Print Method
	public void printDetails() {
		System.out.println("The color of this vehicle is " + this.color);
		System.out.println("The model of this vehicle is " + this.model);
		System.out.println("The transmission for this vehicle is " + this.transmission);
		System.out.println("The number of wheels in this vehicle is " + this.numOfWheels);
	}

}