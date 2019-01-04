/*This is Builder Design Pattern*/

package com.swengg;

import java.util.List;

public class Beehive {
	
	int positionX;
	int positionY;
	Bee species;
	List<Hive> hives;
	int numOfRestBees;

	private Beehive(Builder builder) {
		// TODO Auto-generated constructor stub
		this.positionX = builder.positionX;
		this.positionY = builder.positionY;
		this.species = builder.species;
		this.hives = builder.hives;
		this.numOfRestBees = builder.numOfRestBees;
	}

	public int getPositionX() {
		return positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public Bee getSpecies() {
		return species;
	}

	public List<Hive> getHives() {
		return hives;
	}

	public int getNumOfRestBees() {
		return numOfRestBees;
	}
	
	public static class Builder{
		int positionX;
		int positionY;
		Bee species;
		List<Hive> hives;
		int numOfRestBees;
		
		public Builder(int positionX,int positionY,Bee species) {
			this.positionX = positionX;
			this.positionY = positionY;
			this.species = species;
		}

		public Builder setHives(List<Hive> hives) {
			this.hives = hives;
			return this;
		}

		public Builder setNumOfRestBees(int numOfRestBees) {
			this.numOfRestBees = numOfRestBees;
			return this;
		}
		
		public Beehive build() {
			return new Beehive(this);
		}
		
		
	}
	
}
