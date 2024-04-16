package cz.vsb.fei.java2.testhashcode;

public abstract class Shape {

	private Point position;

	protected Shape(Point position) {
		this.position = position;
	}

	public Point getPosition() {
		return position;
	}

}
