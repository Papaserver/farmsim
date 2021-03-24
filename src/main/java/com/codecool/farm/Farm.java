package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {

	List<Animal> animalsOnFarm = new ArrayList<>();

	public Farm(List<Animal> animalsOnFarm) {
		this.animalsOnFarm = animalsOnFarm;
	}

	public void feedAnimals() {
		animalsOnFarm.forEach(animal -> animal.feed());
	}

	public void butcher (Butcher butcher) {
		animalsOnFarm.removeIf(butcher::canButcher);
	}

	public boolean isEmpty() {
		return animalsOnFarm.size() == 0;
	}

	public List<String> getStatus() {
		List<String> status = new ArrayList<>();
		for (Animal animal : animalsOnFarm) {
			status.add(animal.toString());
		}
		return status;
	}

	public List<Animal> getAnimals() {
		return animalsOnFarm;
	}
}
