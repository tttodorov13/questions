package com;

public class Link {
	public final Client target;
	public final double weight;

	public Link(Client argTarget, double argWeight) {
		target = argTarget;
		weight = argWeight;
	}
}
