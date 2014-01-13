package com.jeh.MyGame;

public class Weapon {
	String name;
	int low;
	int high;
	int damage;
	int hp;
	boolean isEquiped;

	public int getDamage() {
		return damage = (int)(Math.random()*high+low);
	}

}
