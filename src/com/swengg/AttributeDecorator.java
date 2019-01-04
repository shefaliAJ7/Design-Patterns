/*This is a part of Decorator Design Pattern*/

package com.swengg;

public class AttributeDecorator implements Attribute{
	
	protected Attribute attribute;
	
	public AttributeDecorator(Attribute attribute) {
		this.attribute = attribute;
	}

	@Override
	public void showAttribute() {
		// TODO Auto-generated method stub
		this.attribute.showAttribute();
	}
}
