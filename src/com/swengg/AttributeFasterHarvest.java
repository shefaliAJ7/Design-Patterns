/*This is a part of Decorator Design Pattern*/

package com.swengg;

public class AttributeFasterHarvest extends AttributeDecorator{

	public AttributeFasterHarvest(Attribute attribute) {
		super(attribute);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showAttribute() {
		System.out.println("Faster at Harvesting Nector");
	}
}
