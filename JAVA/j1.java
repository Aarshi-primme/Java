import java.sql.*;

classs j1
{
 public static void main(String a[])
 {
 	class.forname("sun.jdbc.odbc.JdbcOdbcDriver");
connection con = DriverManager.getConnection("jdbc:odbc:btech");
Statement stat = con.createStatement();
Resultset rs = Stat.executeQuery("Select*from btech3");
while(re.next())
{
	System.out.println("Roll no : "+rs.getInt(1));
	System.out.println("Name : "+rs.getString(2));
}
resultSet rs();
	catch(Exception e)
{
	System.out.println(e);
}
 } 
}