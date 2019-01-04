/*This is a Singleton Design Pattern*/

package com.swengg;
import java.util.ArrayList;
import java.util.List;

public class Apiary {
	
	//Singleton Design Pattern
	private static Apiary apiary = null;
	private Apiary() {	
		this.beehives = new ArrayList<>();
	}
	public static Apiary getInstance() {
		if(apiary == null) {
			apiary = new Apiary();
		}
		return apiary;
	}
	////////////////////////////////
	
	List<Beehive> beehives;
	public void spawn(Beehive beehive) {
		beehives.add(beehive);
	}
	
	public List<Beehive> getBeeHives(){
		return this.beehives;
	}
}
