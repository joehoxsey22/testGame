package com.jeh.MyGame;

public class Warrior extends Hero	{
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
	
	int armor;
	int att; //attack points
	int sp; //spell power4
	
	public Warrior()	{
		name = "Joe";
		sex =0;
		energy = 0;
		maxHp = 100;
		currHp = 100;
		level = 1;
		
		weapon = new Weapon();
		chest = new Chest();
		ring = new Ring();
		
		armor= 5;
		att = 5;
		sp = 5;
	}
	public Warrior(String n)	{
		name = n;
		energy = 0;
		maxHp = 100;
		currHp = 100;
		level = 1;
		
		weapon = new Weapon();
		chest = new Chest();
		ring = new Ring();
		
		armor= 5;
		att = 5;
		sp = 5;
	}
	public int Attack()	{
		energy += 5;
		return super.Attack(weapon);
	}
	public String getName() {
		return name;
	}
	public int getSex() {
		return sex;
	}
	public int getEnergy() {
		return energy;
	}
	public int getLevel() {
		return level;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public int getCurrHp() {
		return currHp;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public Chest getChest() {
		return chest;
	}
	public Ring getRing() {
		return ring;
	}
	public int getArmor() {
		return armor;
	}
	
}
