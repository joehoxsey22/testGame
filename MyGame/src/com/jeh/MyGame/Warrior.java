package com.jeh.MyGame;

import java.awt.event.KeyEvent;

public class Warrior extends Hero	{
	String name;
	int sex; //0 male, 1 female
	
	int energy;
	int level;
	
	boolean isDone =false;
	
	
	int currHp;
	
	//armor slots
	Weapon weapon;
	Chest chest;
	Ring ring;
	int maxHp;
	
	int armor;
	
	public Warrior()	{
		name = "Joe";
		sex =0;
		energy = 0;
		currHp = 100;
		level = 1;
		
		weapon = new Weapon();
		chest = new Chest();
		ring = new Ring();
		maxHp = 100 + weapon.hp + chest.hp + ring.hp;
		armor = 10 + chest.armor + ring.armor;
	}
	public Warrior(String n)	{
		name = n;
		energy = 0;
		currHp = 100;
		level = 1;
		
		weapon = new Weapon();
		chest = new Chest();
		ring = new Ring();
		
		maxHp = 100 + weapon.hp + chest.hp + ring.hp;
		armor = 10 + chest.armor + ring.armor;
	}
	public int Attack()	{
		energy += 5;
		return super.Attack(weapon);
	}
	public void update()	{
		maxHp = 100+(25*level) + weapon.hp + chest.hp + ring.hp;
		armor = 10+(10*level) + chest.armor + ring.armor;
	}
	public double getReduction()	{
		 return super.damageReduction(getArmor(),level);
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
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public void setChest(Chest chest) {
		this.chest = chest;
	}
	public void setRing(Ring ring) {
		this.ring = ring;
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
	
	public void keyRelease(KeyEvent e) {
		int key = e.getKeyCode();
		switch(key)	{
		case KeyEvent.VK_1: break;
		case KeyEvent.VK_2: break;
		case KeyEvent.VK_3: break;
		case KeyEvent.VK_4: break;
		case KeyEvent.VK_5: break;
		case KeyEvent.VK_6: break;
		case KeyEvent.VK_7: break;
		}
	}
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch(key)	{
		case KeyEvent.VK_1: break;
		case KeyEvent.VK_2: break;
		case KeyEvent.VK_3: break;
		case KeyEvent.VK_4: break;
		case KeyEvent.VK_5: break;
		case KeyEvent.VK_6: break;
		case KeyEvent.VK_7: break;
		}
	}
	public double heroicStrike()	{
		int dam = Attack();
		return dam + dam*.20;
	}
	public double shieldWall()	{
		double reDuc = getReduction();
		return reDuc + .50;
	}
	
	public void Stats()	{
		System.out.println(name);
		System.out.println("===============================");
		System.out.println("Level: "+level);
		System.out.println("Hp: "+maxHp);
		System.out.println("Damage: "+weapon.low+" - "+weapon.high);
		System.out.println("Armor: "+armor+" ("+(getReduction()*100)+")");
		System.out.println("===============================");
	}
	
}
