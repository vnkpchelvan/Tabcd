package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("bike cost is 2,15,000");
	}

	@Override
	public void speed() {
		System.out.println("bike speed is 110km/hr");
	}
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
	}

}
