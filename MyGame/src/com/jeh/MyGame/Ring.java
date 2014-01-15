package com.jeh.MyGame;

public class Ring extends Bag {
	String name;
	int armor;
	int hp;
	int damage;
	int lvReq;
	
	public Ring()	{
		name = "copper ruined ring";
		armor = 1;
		hp = 0;
		damage = 0;
		lvReq = 0;
	}
	public Ring(String n, int a, int h, int d, int l)	{
		name = n;
		armor = a;
		hp = h;
		damage = d;
		lvReq = l;
	}
	public void equip(Warrior war)	{
		war.setRing(this);
		war.update();
	}
	//public void equip(Mage ma)	{
		//ma.setRing(this);
		//war.update();
	//}
	//public void equip(Ranger ra)	{
	//	ra.setRing(this);
		//war.update();
	//}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getLvReq() {
		return lvReq;
	}
	public void setLvReq(int lvReq) {
		this.lvReq = lvReq;
	}
	public void Stats()	{
		System.out.println("Ring");
		System.out.println("===============================");
		System.out.println("Name: "+name);
		System.out.println("Hp gain: "+hp);
		System.out.println("Armor: "+armor);
		System.out.println("Level Requirement: "+lvReq);
		System.out.println("===============================");
	}
}
