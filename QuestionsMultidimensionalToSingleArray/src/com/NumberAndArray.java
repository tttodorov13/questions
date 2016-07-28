package com;

import java.util.ArrayList;

public final class NumberAndArray {
	private int numberInt;
	private ArrayList<NumberAndArray> numberAndArrays;
	
	public NumberAndArray() {
		this.numberInt = 0;
		this.numberAndArrays = null;
	}
	
	public NumberAndArray(int numberInt, double numberDouble, ArrayList<NumberAndArray> numberAndArray) {
		this.numberInt = numberInt;
		this.numberAndArrays = numberAndArray;
	}

	public void add(Object o) throws ClassCastException, NullPointerException {
		if(o instanceof ArrayList<?>) {
			this.numberAndArrays = new ArrayList<NumberAndArray>();
		} else {
			this.numberInt = (int) o;
		}
	}
	
	public int getNumberInt() {
		return numberInt;
	}

	public ArrayList<NumberAndArray> getNumberAndArray() {
		return numberAndArrays;
	}
}
