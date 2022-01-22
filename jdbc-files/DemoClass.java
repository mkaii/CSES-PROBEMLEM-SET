package srcPackage;


import java.sql.*;

public class DemoClass {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//Class.forName("com.mysql.jdbc.Driver");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		String url = "jdbc:mysql://localhost:3306/newdb";
		String uName = "root";
		String pass = "ina728dg";
		String query = "select student_name from students where student_ID = '1'";
		
		Connection con = DriverManager.getConnection(url,uName,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		String name = "no record found";

			 name  = rs.getString("student_name");

		
		System.out.println(name);
		
		st.close();
		con.close();
		
		
	}

}
