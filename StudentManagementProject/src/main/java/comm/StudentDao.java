package comm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	public static boolean insertStudentToDb(Student st) {
		
		boolean f=false;
		//jdbc code for inserting data....
	  try {
		Connection con=CP.createC();
		String q="insert into students (sname,sphone,scity) values(?,?,?)";
		//prepared statement 
		PreparedStatement pstmt=con.prepareStatement(q);
		//set the values of parameter
		pstmt.setString(1, st.getStudentName());
		pstmt.setString(2,st.getPhonenumber());
		pstmt.setString(3,st.getCity());
		
		
		pstmt.executeUpdate();
		f=true;
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	return f;
	}

	public static boolean  deleteRecord(int userId) {
		boolean f=false;
		//jdbc code for inserting data....
	  try {
		Connection con=CP.createC();
		String q="delete from students where sid=?";
		//prepared statement 
		PreparedStatement pstmt=con.prepareStatement(q);
		//set the values of parameter
		pstmt.setInt(1, userId);
		
		
		pstmt.executeUpdate();
		f=true;
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	return f;
	}

	public static boolean showAllStudents() {
		// TODO Auto-generated method stub
		boolean f=false;
		//jdbc code for inserting data....
	  try {
		Connection con=CP.createC();
		String q="select * from students";
		//prepared statement 
		Statement stmt=con.createStatement();
		ResultSet set=stmt.executeQuery(q);
		while(set.next()) {
			
			int id=set.getInt(1);
			String name=set.getString(2);
			String phone=set.getString(3);
			String city =set.getString("scity");
			System.out.println("Id:"+id);
			System.out.println("name:"+name);
			System.out.println("phone:"+phone);
			System.out.println("city:"+city);
			System.out.println("******************");
			
		}
		//set the values of parameter
		
		
		
		
		f=true;
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	return f;
	}
	}
	


