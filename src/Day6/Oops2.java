package Day6;

public class Oops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		System.out.println(c.powerInt(1, 5));
		System.out.println(c.powerDouble(1.0, 5.0));
	}

}

class Calculator{
	static int powerInt(int a, int b) {
		return (int) Math.pow(a, b);
	}
	static double powerDouble(double a, double b) {
		return (double) Math.pow(a, b);
	}
}
