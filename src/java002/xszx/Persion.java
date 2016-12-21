package java002.xszx;

public class Persion {
	public void display(){
		System.out.println("Persion.display()....");
	}
	
	static void display(Persion person){
		person.display();
	}
}
