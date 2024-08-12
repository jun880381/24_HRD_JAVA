package day05;

public class Student extends Person{
	// ID, 학급 변수 cName 추가
	
	private String cName;
	private String id;
	
	// 생성자
	
	public Student() {
		
	}
	
	public Student(String name, int age, String id, String cName) {
		super(name,age);
		this.cName = cName;
		this.id = id;
	}
	
	// getter, setter
	
	public void setCName(String cName) {
		this.cName = cName;
	}
	
	public String getCName() {
		return cName;
	}
	
	public void setId() {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	
	// 메소드 오버라이딩
	
	@Override
	public String personInfo() {
		String info = "\n학번 : " + id + "\n학급 : " + cName;
		return super.personInfo() + info;
	}
	

}
