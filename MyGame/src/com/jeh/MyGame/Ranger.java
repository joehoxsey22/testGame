package com.jeh.MyGame;

public class Ranger extends Hero {
	String name;
	int sex; //0 male, 1 female
	
	int energy;
	int level;
	
	int maxHp;
	int currHp;
	
	//armor slots
	Weapon weapon;
	Chest chest;
	Ring ring;
	
	int def; //defensive points
	int att; //attack points
	int sp; //spell power4
	
	public Ranger()	{
		name = "Charlie";
		sex =0;
		energy = 0;
		maxHp = 100;
		currHp = 100;
		level = 1;
		
		weapon = new Weapon();
		chest = new Chest();
		ring = new Ring();
		
		def= 5;
		att = 5;
		sp = 5;
	}
	public Ranger(String n)	{
		name = n;
		energy = 0;
		maxHp = 100;
		currHp = 100;
		level = 1;
		
		weapon = new Weapon();
		chest = new Chest();
		ring = new Ring();
		
		def= 5;
		att = 5;
		sp = 5;
	}
	public int Shoot()	{
		energy -= 5;
		return super.Shoot(weapon);
	}
}
