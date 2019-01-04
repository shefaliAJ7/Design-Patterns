/*This is a part of Decorator Design Pattern*/

package com.swengg;

public class AttributeStronger extends AttributeDecorator{

	public AttributeStronger(Attribute attribute) {
		super(attribute);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void showAttribute() {
		super.showAttribute();
		System.out.println("Stronger in Battles");
	}

}
