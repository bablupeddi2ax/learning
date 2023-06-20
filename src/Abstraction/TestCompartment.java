package Abstraction;

import java.util.ArrayList;
import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Compartment> a= new ArrayList<Compartment>(10);
		Random random = new Random();
		for(int i = 0;i<9;i++) {
		int type = random.nextInt(4);
			a.add(classtype(type));
		}
		for(int i = 0;i<a.size();i++) {
			System.out.println(a.get(i).notice());
		}
	}
	public static Compartment classtype(int a) {
	    Ladies l = new Ladies();
	    General g = new General();
	    FirstClass f = new FirstClass();
	    Luggage lg = new Luggage();
	    switch (a) {
	        case 0:
	            return l;
	        case 1:
	            return f;
	            
	        case 2:
	            return lg;
	        case 3:
	            return g;
	        default:
	            return null;
	    }
	}


}


abstract class Compartment{
	public abstract String notice();
}

class FirstClass extends Compartment{
	public  String notice() {
		return "FirstClass";
	}
}

class Ladies extends Compartment{
	public  String notice() {
		return "Ladies";
	}
}
class General extends Compartment{
	public  String notice() {
		return "FirstClass";
	}
}

class Luggage extends Compartment{
	public  String notice() {
		return "Ladies";
	}
}