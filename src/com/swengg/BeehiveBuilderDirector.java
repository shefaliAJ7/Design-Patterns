/*Part Of Builder Design Pattern. It makes the builder*/

package com.swengg;

public class BeehiveBuilderDirector {

	public Beehive getNewBeehive(int X,int Y,Bee T) {
		return new Beehive.Builder(X, Y, T).build();
	}
}
