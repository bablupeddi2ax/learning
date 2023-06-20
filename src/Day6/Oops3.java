package Day6;

public class Oops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a = new Author("shiva","b@gmail.com","male");
		Book b = new Book("Chroicles",a,100000,100);
		b.getAuthorDetails();
		b.getName();
		b.getPrice();
		b.getQty();
	}

}

class Author{
	String name;
	String email;
	String gender;
	
	Author(String n,String e,String g){
		name  = n;
		email =e;
		gender = g;
	}
}

class Book{
	String name;
	Author author;
	double price;
	int qtyInStock;
	Book(String n,Author a,double p,int q){
		name = n;
		author = a;
		price= p;
		qtyInStock = q;
	}
	public void getName() {
		System.out.println(name);
	}
	public void getAuthorDetails() {
		System.out.println("name " +author.name +"\n"+ "email " + author.email +"\n"+ "gender "+author.gender);
	}
	public void getPrice() {
		System.out.println(price);
	}
	public void getQty() {
		System.out.println(qtyInStock);
	}
}