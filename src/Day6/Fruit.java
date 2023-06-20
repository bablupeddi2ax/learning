package Day6;

public class Fruit {
	static String taste;
	static int size;
	Fruit(String t,int a){
		taste = t;
		size = a;
	}
	public void eat() {
		System.out.println("Taste:" + taste + "size" + size);
	}
	public static void main() {
		Apple a = new Apple("sour",10);
		Orange o = new Orange("sweet",10);
		a.eat();
		o.eat();
	}
}
class Apple extends Fruit{
	String t;
	int s;
	Apple(String a,int s){
		super(a,s);
	}
	public void eat() {
		System.out.println("Taste:" + taste + "size" + size);
	}
}
class Orange extends Fruit{
	String t;
	int s;
	Orange(String a,int s){
		super(a,s);
	}
	public void eat() {
		System.out.println("Taste:" + taste + "size" + size);
	}
}