/*This is a part of Mediator Design Pattern*/

package com.swengg;

public abstract class Bee {
	protected TickMediator mediator;
	String beeFamilyType;
	
	public Bee(TickMediator mediator) {
		this.mediator = mediator;
	}
	
	public abstract void statusAtThisTick(int tick);
	
	public abstract void setBeeFamilyType(String beeFamilyType);
	public abstract String getBeeFamilyType();
}
