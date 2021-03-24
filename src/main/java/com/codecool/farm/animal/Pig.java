package com.codecool.farm.animal;

public class Pig extends Animal {

	private int size;

	public Pig() {

		this.size = super.getSize();
	}

	@Override
	public void feed() {
		size += 1;
	}

	@Override
	public int getSize() {

		return size;
	}

	@Override
	public String toString() {

		return "There is a "+getSize()+" sized pig in the farm.";
	}

}
