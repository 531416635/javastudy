package java001;

public class Husband {

	private String name;
	
	private String sex;
	
	private String age;
	
	private Wife wife;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = String.valueOf(age);
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}
	
}
