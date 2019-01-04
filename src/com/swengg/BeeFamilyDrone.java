/*This is a part of Mediator Design Pattern*/

package com.swengg;

public class BeeFamilyDrone extends Bee{
	
	public BeeFamilyDrone(TickMediator mediator) {
		// TODO Auto-generated constructor stub
		super(mediator);
	}

	@Override
	public void statusAtThisTick(int tick) {
		// TODO Auto-generated method stub
		mediator.statusOfBees(this, tick);
	}

	@Override
	public String getBeeFamilyType() {
		// TODO Auto-generated method stub
		return "Drone";
	}

	@Override
	public void setBeeFamilyType(String beeFamilyType) {
		// TODO Auto-generated method stub
		this.beeFamilyType = beeFamilyType;
	}


}
