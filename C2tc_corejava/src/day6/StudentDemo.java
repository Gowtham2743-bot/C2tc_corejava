package day6;

public class StudentDemo {
	
	public static void main (String[] args) {
		
		Student s = new Student();
		Student.setId(101);
	
		
		Student s1 = new Student();
		Student.setId(102);
	
		System.out.println(s1);
		System.out.println(s);
		
		
	}
	static{
		System.out.println("Hello");
	}

}
