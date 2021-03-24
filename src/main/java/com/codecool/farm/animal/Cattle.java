package com.codecool.farm.animal;

public class Cattle extends Animal {

	private int size;

	public Cattle() {

		this.size = super.getSize();
	}

	@Override
	public void feed() {
		size += 2;
	}

	@Override
	public int getSize() {

		return size;
	}

	@Override
	public String toString() {

		return "There is a "+getSize()+" sized cattle in the farm.";
	}

}
