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
		if("0".equals(sex)){
			sex = "女";
		}else if("1".equals(sex)){
			sex = "男";
		}
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(int age) {
		//若将年龄由int类型改为string类型，只需内部转换即可
		//封装使我们能够很容易的改变类的内部实现，而无需修改使用了该类的客户代码
		if(age>120){
			System.out.println("ERROR: error age input ...");
		}else{
			this.age = String.valueOf(age);
		}
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}
	
}
