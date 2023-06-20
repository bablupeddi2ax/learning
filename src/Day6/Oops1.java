package Day6;

public class Oops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box(1,2,3);
		System.out.println(b.volume());
	}

}

class Box {
	int depth,height,width;
	Box(int a,int b,int c){
		 depth = a;
		 width = b;
		 height = c;
	}
	public int volume() {
		return depth*width*height;
	}
}
