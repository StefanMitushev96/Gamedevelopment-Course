package ar.uba.fi.game.entity;

import ar.uba.fi.game.ai.fsm.NinjaRabbitState;
import ar.uba.fi.game.audio.AudioProcessor;
import ar.uba.fi.game.graphics.GraphicsProcessor;
import ar.uba.fi.game.physics.BodyProcessor;
import ar.uba.fi.game.physics.PhysicsProcessor;
import ar.uba.fi.game.player.PlayerStatusProcessor;

import com.badlogic.gdx.graphics.Camera;

public class NinjaRabbit extends Entity {
	/**
	 * A component used to change the body of this {@link Entity} according the action being
	 * executed or the {@link Direction} that is facing, if necessary.
	 */
	private final BodyProcessor bodyProcessor;

	/**
	 * A component that handles the score, lives and other player-related data.
	 */
	private final PlayerStatusProcessor player;

	public NinjaRabbit(final PlayerStatusProcessor player, final BodyProcessor bodyProcessor, final GraphicsProcessor graphics,
			final PhysicsProcessor physics,
			final AudioProcessor audio) {
		super(graphics, physics, audio, NinjaRabbitState.IDLE);
		this.bodyProcessor = bodyProcessor;
		this.player = player;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see ar.uba.fi.game.entity.Entity#update(com.badlogic.gdx.graphics.Camera)
	 */
	@Override
	public void update(final Camera camera) {
		player.update(this);
		super.update(camera);
		bodyProcessor.update(this);
	}
}
