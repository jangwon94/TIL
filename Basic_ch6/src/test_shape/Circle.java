package test_shape;

public class Circle extends Shape{
	private int radius;
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		if(radius>0) {
			this.radius = radius;
		}
	}
	public void areaCircle() {
		System.out.println("원의 넓이="+(3.14*radius*radius));
	}

}
