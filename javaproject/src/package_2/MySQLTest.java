package package_2;
import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLTest
{
    public static void main(String[] args) 
    {
        try
        {
            String url = "jdbc:mysql://localhost:3306/mohandb";
            String user = "root";
            String password = "ABDmohan123@";

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to MySQL successfully!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
