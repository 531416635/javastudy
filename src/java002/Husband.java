package java002;

public class Husband extends Person{

	Husband() {
		super("hello world");
		System.out.println("Husband constrctor ..");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		setName("protected -- name -- test");
		return super.toString();
	}
}
