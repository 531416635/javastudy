package java003.demo1;

public class B extends A{

	public String show(B obj){
		return ("B and B");
	}
	
	public String show(A obj){
		return ("B and A");
	}
}
