package Day6;

public class Oops4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Bird b = new Bird();
		b.eat();
		b.fly();
		b.sleep();
	}

}

class Animal{
	void eat() {
		System.out.println("eating");
	}
	void sleep() {
		System.out.println("sleeping");
	}
}
class Bird extends Animal{
	void eat() {
		System.out.println("Bird is eating");
	}
	void sleep() {
		System.out.println("Bird is sleeping");
	}
	void fly() {
		System.out.println("Bird is flying");
	}
}
