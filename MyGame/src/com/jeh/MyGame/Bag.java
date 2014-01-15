package com.jeh.MyGame;

import java.util.ArrayList;

public class Bag extends ArrayList<Bag> {
	int maxSlots;
	int openSlots;
	
	public Bag()	{
		maxSlots = 12;
		openSlots = 12;
	}
	public Bag(int max)	{
		maxSlots = max;
		openSlots = max;
	}
	public boolean add(Weapon w)	{
		if(this.size() < maxSlots)	{
			return super.add(w);
		}
		return false;
	}
	public boolean add(Chest c)	{
		if(this.size() < maxSlots)	{
			return super.add(c);
		}
		return false;
	}
	public boolean add(Ring r)	{
		if(this.size() < maxSlots)	{
			return super.add(r);
		}
		return false;
	}

}
