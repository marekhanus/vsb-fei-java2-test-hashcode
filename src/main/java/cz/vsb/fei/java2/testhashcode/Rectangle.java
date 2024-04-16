package cz.vsb.fei.java2.testhashcode;

public class Rectangle extends Shape {

	private int width;
	private int height;

	public Rectangle(Point position, int width, int height) {
		super(position);
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
