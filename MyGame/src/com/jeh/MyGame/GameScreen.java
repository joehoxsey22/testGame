package com.jeh.MyGame;

import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class GameScreen implements Screen {
	public MyGame game;
	OrthographicCamera camera;
	SpriteBatch batch;
	
	Texture texture_back;
	
	float stateTime;
	Random rand;
	
	Vector3 touch;
	
	Male joe;
	Female meg;
	int status; //0 menu, 1 create, 2 world, 3 battle
	
	boolean paused;
	
	int maleX;
	int maleY;
	
	
	
	public GameScreen(MyGame game)	{
		this.game = game;
		
		camera = new OrthographicCamera();
		camera.setToOrtho(true, 1024,640);
		batch = new SpriteBatch();
		rand  = new Random();
		
		joe = new Male();
		meg= new Female();
	}
	
	@Override
	public void render(float delta) {
	//	Gdx.gl.glClearColor(0F,0F,0F,0F);
	//	Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		camera.update();
		generalUpdate();
		
		
		stateTime += Gdx.graphics.getDeltaTime();	//since the last frame
		Assets.current_frame = meg.movement.getKeyFrame(stateTime, true);
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();	
			switch(status)	{
			case 0: startMenu(); break;
			case 1: batch.draw(Assets.current_frame, meg.velX, meg.velY  ); break;
			}
		batch.end();
	}

	public void generalUpdate() {
		if(Gdx.input.isKeyPressed(Keys.W))	{
			meg.moveUp();
		}if(Gdx.input.isKeyPressed(Keys.S))	{
			meg.moveDown();
		}if(Gdx.input.isKeyPressed(Keys.A))	{
			meg.moveLeft();
		}if(Gdx.input.isKeyPressed(Keys.D))	{
			meg.moveRight();
		}
	}
	public void startMenu()	{
		Texture background = new Texture(Gdx.files.internal("menu/mainMenu_background.png"));
		TextureRegion [][] temp = TextureRegion.split(background, 1024, 640);
		temp[0][0].flip(false, true);
		
		Texture newGame = new Texture(Gdx.files.internal("menu/newGame_button.png"));
		TextureRegion [][] temp1 = TextureRegion.split(newGame, 200, 100);
		temp1[0][0].flip(false, true);
	
		
		batch.draw(temp[0][0],200,0);
		batch.draw(temp1[0][0],50,150);
		
	}
	

	@Override
	public void show() {
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

}
