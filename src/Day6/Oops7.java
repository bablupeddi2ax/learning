package Day6;

public class Oops7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		Triangle t = new Triangle();
		Square s = new Square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.erase();
		s.draw();
	}
}

class Shape{
	public void draw(){}
	public void erase(){}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing Circle");
	}
	public void erase() {
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape{
	public void draw() {
		System.out.println("Drawing Triangle");
	}
	public void erase() {
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape{
	public void draw() {
		System.out.println("Drawing Square");
	}
	public void erase() {
		System.out.println("Erasing Square");
	}
}