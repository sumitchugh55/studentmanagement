package comm;

public class Student {
	private int studentid;
	private String studentName;
	private String phonenumber;
	private String city;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int studentid, String studentName, String phonenumber, String city) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		this.phonenumber = phonenumber;
		this.city = city;
	}
	public Student(String studentName, String phonenumber, String city) {
		super();
		this.studentName = studentName;
		this.phonenumber = phonenumber;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentName=" + studentName + ", phonenumber=" + phonenumber
				+ ", city=" + city + "]";
	}
	

}
