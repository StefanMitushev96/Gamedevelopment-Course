package ar.uba.fi.game.entity;

public enum Direction {
	/**
	 * The {@link Entity} is facing left.
	 */
	LEFT("left"),
	/**
	 * The {@link Entity} is facing right.
	 */
	RIGHT("right");

	/**
	 * A human readable description of the value of the enum. Useful for printing and debugging.
	 */
	private String direction;

	private Direction(final String direction) {
		this.direction = direction;
	}

	public String direction() {
		return direction;
	}

	@Override
	public String toString() {
		return direction;
	}
}
