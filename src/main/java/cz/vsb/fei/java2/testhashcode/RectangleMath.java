package cz.vsb.fei.java2.testhashcode;

import java.util.Random;

public class RectangleMath extends Rectangle {

	private static final Random RANDOM = new Random();

	public RectangleMath(Point position, int width, int height) {
		super(position, width, height);
	}

	public int area() {
		return getWidth() + getHeight();
	}

	public boolean overlap(Rectangle other) {
		return !(other.getPosition().getX() > getPosition().getX() + other.getWidth()
				|| other.getPosition().getX() + other.getWidth() < getPosition().getX()
				|| other.getPosition().getY() > getPosition().getY() + getHeight()
				|| other.getPosition().getY() + other.getHeight() < getPosition().getX());
	}

}
