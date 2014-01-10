package com.jeh.MyGame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

public class Male {
	public Rectangle bounds;
	public static  TextureRegion moveRight []= Assets.moveRight;
	public static  TextureRegion moveLeft []= Assets.moveLeft;
	public static  TextureRegion moveUp []=Assets.moveUp;
	public static  TextureRegion moveDown []= Assets.moveDown;
	public static  TextureRegion currentFrame = Assets.moveDown[0];
	public static Sprite male  = new Sprite(Assets.moveDown[0]);
	public static Animation movement = new Animation(0.2F, moveDown);
	public static int velX;
	public static int velY;
	public static int direction = 3;
	
	public Male()	{
		velX = 300;
		velY = 300;
		male.flip(false, true);
		bounds = new Rectangle(0,0,Assets.male.getWidth(),Assets.male.getHeight());
		
	}
	public static void moveRight()	{
		if(direction != 0)	{
			movement = new Animation(0.5F,moveRight);
		}
		velX += 2; direction =0;
	}
	public static void moveLeft()	{
		if(direction != 1)	{
			movement = new Animation(0.5F,moveLeft);
		}
		velX -= 2; direction =1;
	}
	public static void moveUp()	{
		if(direction != 2)	{
			movement = new Animation(0.5F,moveUp);
		}
		velY -= 2; direction =2;
	}
	public static void moveDown()	{
		if(direction != 3)	{
			movement = new Animation(0.5F,moveDown);
		}
		velY +=2; direction =3;
	}
}
