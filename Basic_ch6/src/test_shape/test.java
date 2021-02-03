package test_shape;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.setRadius(5);
		c.areaCircle();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Printer out=new Printer();
		out.print(c);
		out.print(r);
		out.print(t);


	}

}
