package ar.uba.fi.game;

import com.badlogic.gdx.Screen;

public abstract class AbstractScreen implements Screen {
	protected final NinjaRabbitGame game;

	public AbstractScreen(final NinjaRabbitGame game) {
		this.game = game;
	}

	@Override
	public void hide() {
		dispose();
	}
}
