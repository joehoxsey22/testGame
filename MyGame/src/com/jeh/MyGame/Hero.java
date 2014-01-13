package com.jeh.MyGame;

public class Hero {
	public int Attack(Weapon weapon)	{
		return weapon.getDamage();
	}
	public int Shoot(Weapon weapon)	{
		return weapon.getDamage();
	}
	public int Heal(Weapon weapon)	{
		return weapon.getDamage();
	}
	public int Spell(Weapon weapon)	{
		return weapon.getDamage();
	}
	public double damageReduction(int armor,int level)	{
		return ((double)armor/((double)level*100.00));
	}
	
}
