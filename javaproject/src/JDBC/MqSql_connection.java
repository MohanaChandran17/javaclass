package JDBC;
import java.sql.*;

public class MqSql_connection
{
	public static void main(String[] args) 
	{
	    try
	    {
	        Class.forName("com.mysql.cj.jdbc.Driver");

	        String url = "jdbc:mysql://localhost:3306/jdbc_demo?useSSL=false&serverTimezone=UTC";
	        String userName = "root";
	        String passWord = "ABDmohan123@";

	        Connection con = DriverManager.getConnection(url, userName, passWord);
	        Statement st = con.createStatement();
	        ResultSet res = st.executeQuery("select * from employee");

	        res.next();
	        System.out.println("Emp id " + res.getInt(1));
	        System.out.println("Emp Name " + res.getString(2));
	        System.out.println("Emp Salary " + res.getInt(3));

	        con.close();

	    } 
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	}


}
