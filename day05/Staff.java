package day05;

public class Staff extends Person{
	// id
	// private String dept 담당부서
	private String id;
	private String dept;
	
	// 인자 생성자
	
	public Staff () {
		
	}
	
	public Staff (String name, int age, String id, String dept) {
		super(name, age);
		this.id = id;
		this.dept = dept;
	}

	
	// getter, setter
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}

	// 메소드 오버라이딩
	
	@Override
	public String personInfo() {
		String info = "\n아이디 : " + id + "\n담당 부서 : " + dept;
		return super.personInfo() + info;
	}
	
	

}
