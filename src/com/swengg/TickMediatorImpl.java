/*This is a part of Mediator Design Pattern*/

package com.swengg;

import java.util.ArrayList;
import java.util.List;

public class TickMediatorImpl implements TickMediator{
	private List<Bee> bees;
	
	public TickMediatorImpl() {
		this.bees = new ArrayList<>();
	}
	
	@Override
	public void statusOfBees(Bee bee, int tick) {
		for(Bee b: this.bees) {
			
			if(b.beeFamilyType.equalsIgnoreCase(bee.beeFamilyType)) {
				System.out.print("I am ");
			}
			else {
				System.out.print(b.beeFamilyType + " is ");
			}
			
			switch(b.getBeeFamilyType()) {
			case "Queen": {
							if(tick>=0 && tick<=5) 
								System.out.println("resting.");
							else
								System.out.println("spawning eggs.");
							break;
							}
			case "Drone": {
							if(tick>=6 && tick<=10) 
								System.out.println("resting.");
							else
								System.out.println("looking for food.");
							break;
							}
			case "Warrior": {
							  if(tick>=11 && tick<=15) 
									System.out.println("resting.");
							  else
								  System.out.println("hunting for enemies.");
							  break;
							}
			case "Killer": {
							 if(tick>=16 && tick<=20) 
								 System.out.println("resting.");
							 else
								 System.out.println("killing enemies.");
							 break;
							}
			default :{
						System.out.println("No Bee Of this type");
						break;
					}
			}
		}
	}

	@Override
	public void addBees(Bee bee) {
		// TODO Auto-generated method stub
		this.bees.add(bee);
	}
}
