package java002;

public class Person {
	protected String name;
	protected int age;
	protected String sex;
	
	Person(String name){
		System.out.println("person constrctor ... "+name);
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
