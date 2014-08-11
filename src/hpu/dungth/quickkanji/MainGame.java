package hpu.dungth.quickkanji;

import hpu.dungth.gameframework.Screen;
import hpu.dungth.gameframework.impl.AndroidGame;


public class MainGame extends AndroidGame {
	@Override
	public Screen getStartScreen() {
		 return new LoadingScreen(this);
	}
}
