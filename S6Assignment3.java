interface Shape {
	
	void draw();
	void getArea(float l, float h);
}

class Triangle implements Shape {
	
	public void draw() {
	
		System.out.println("Called Triangle class draw method");
	}
	
	public void getArea(float l, float h) {
	
		System.out.println("Area of Triangle is = " + (l*h/2));
	}
}

class Square implements Shape {
	
	public void draw() {
	
		System.out.println("Called Square class draw method");
	}
	
	public void getArea(float l1, float l2) {
	
		System.out.println("Area of Triangle is = " + (l1*l2));
	}
}

public class S6Assignment3 {
	
	public static void main(String args[]) {
	
		Triangle t  = new Triangle();
		t.draw();
		t.getArea(5.5f,6.5f);
		
		Square s = new Square();
		s.draw();
		s.getArea(5.5f, 5.5f);
	}
}