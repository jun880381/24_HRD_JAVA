package day05;

public class Teacher extends Person {
	// id, 담당과목 subject;
	private String id;
	private String subject;
	
	// 인자 생성자
	
	public Teacher() {
		
	}
	
	public Teacher(String name, int age, String id, String subject) {
		super(name, age);
		this.id = id;
		this.subject = subject;
	}
	
	// getter, setter

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	
	// 메소드 오버라이딩

	@Override
	public String personInfo() {
		String info = "\nID : " + id + "\n담당과목 : " + subject;
		return super.personInfo() + info;
	}
}
