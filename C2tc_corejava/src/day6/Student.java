package day6;

public class Student {
	private String sname;
	private static int id;
	private static int reg;

	
	
	public Student() {
		id++;
		reg++;
		
		
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Student.id = id;
	}
	@Override
	public String toString() {
		return "Student [id:"+id+" reg:"+reg+" sname=" + sname + "]";
	}
	

}
