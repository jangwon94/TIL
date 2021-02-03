package test_shape;

public class Triangle extends Shape{

	private int w,h;
	public int getW() {
		return w;
	}
	public void setW(int w) {
		if(w>0)
		{
			this.w = w;
		}
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		if(h>0)
		{
			this.h = h;
		}
	}
	public void areaTri() {
		System.out.println("삼각형의 넓이="+(w*h/2));
	}
}
