package com.jeh.MyGame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "MyGame";
		cfg.useGL20 = true;
		cfg.width = 1024;
		cfg.height = 640;
		
		new LwjglApplication(new MyGame(), cfg);
	}
}
