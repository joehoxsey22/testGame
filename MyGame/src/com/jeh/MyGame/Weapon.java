package com.jeh.MyGame;

public class Weapon extends Bag{
	String name;
	int low;
	int high;
	int damage;
	int hp;
	int lvReq;
	int type; //0 offhand, 1 one hander, 2 2hander weapons
	
	boolean isEquiped;
	
	public Weapon()	{
		name = "Old toren shirt";
		hp = 0;
		damage = 0;
		lvReq = 0;
		type = 1;
	}
	public Weapon(String n, int h, int lo, int hi, int l, int t)	{
		name = n;
		hp = h;
		low= lo;
		high= hi;
		lvReq = l;
		type = t;
	}
	public void equip(Warrior war)	{
		war.setWeapon(this);
		war.update();
	}
	public void equip(Mage ma)	{
	ma.setWeapon(this);
		ma.update();
	}
	public void equip(Ranger ra)	{
	ra.setWeapon(this);
		ra.update();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getLvReq() {
		return lvReq;
	}
	public void setLvReq(int lvReq) {
		this.lvReq = lvReq;
	}
	public int getDamage() {
		return damage = (int)(low+(Math.random()*(high-low))+1);
	}
	public void Stats()	{
		System.out.println("Weapon");
		System.out.println("===============================");
		System.out.println("Name: "+name);
		System.out.println("Hp gain: "+hp);
		System.out.println("Damage: "+low+" - "+high);
		System.out.println("Level Requirement: "+lvReq);
		System.out.println("===============================");
	}

}
