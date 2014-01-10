package com.jeh.MyGame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

public class Assets {
	public static BitmapFont font;
	public static Preferences settings;
	public static String name;
	
	public static  Texture texture_male;
	public static Sprite male;
	
	public static  TextureRegion moveRight []=new TextureRegion[4];
	public static  TextureRegion moveLeft []=new TextureRegion[4];
	public static  TextureRegion moveUp []=new TextureRegion[4];
	public static  TextureRegion moveDown []=new TextureRegion[4];
	//change
	////11/11/1/1/1/11/11
	
	public static  Texture texture_female;
	public static Sprite female;
	public static int pixal = 32;
	public static TextureRegion current_frame;
	
	public static void load()	{
		texture_male = new Texture(Gdx.files.internal("menu/Warrior_Male.png"));
		male = new Sprite(texture_male);
		
		texture_female = new Texture(Gdx.files.internal("menu/Warrior_Female2.png"));
		female = new Sprite(texture_female);
		
		loadPics(texture_female);
	}
	 public static void loadPics(Texture x)	{
		 TextureRegion[][] temp = TextureRegion.split(x, pixal, pixal);
		 for(int i =0; i < 4; i++)	{
				for(int j = 0; j <4; j++)	{
					switch(i)	{
						case 0: moveDown[j] = temp[i][j]; moveDown[j].flip(false, true); break;
						case 1: moveLeft[j] = temp[i][j]; moveLeft[j].flip(false, true); break;
						case 2: moveRight[j] = temp[i][j]; moveRight[j].flip(false, true); break;
						case 3: moveUp[j] = temp[i][j]; moveUp[j].flip(false, true); break;
					}
				}
			
		 }
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
