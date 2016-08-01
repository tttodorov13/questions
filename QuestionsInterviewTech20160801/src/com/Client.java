package com;

public class Client implements Comparable<Client> {
	public final String name;
	public Link[] adjacencies;
	public double minDistance = Double.POSITIVE_INFINITY;
	public Client previous;

	public Client(String argName) {
		name = argName;
	}

	public String toString() {
		return name;
	}

	public int compareTo(Client other) {
		return Double.compare(minDistance, other.minDistance);
	}

}
