package ru.myitschool.game2048.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import ru.myitschool.game2048.MyGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = MyGame.SCR_WIDTH;
		config.height = MyGame.SCR_HEIGHT;
		new LwjglApplication(new MyGame(), config);
	}
}

