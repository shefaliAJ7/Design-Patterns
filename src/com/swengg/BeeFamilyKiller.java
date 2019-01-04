/*This is a part of Mediator Design Pattern*/

package com.swengg;

public class BeeFamilyKiller extends Bee{
	
	public BeeFamilyKiller(TickMediator mediator) {
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
		return "Killer";
	}
	@Override
	public void setBeeFamilyType(String beeFamilyType) {
		// TODO Auto-generated method stub
		this.beeFamilyType = beeFamilyType;
	}
}
