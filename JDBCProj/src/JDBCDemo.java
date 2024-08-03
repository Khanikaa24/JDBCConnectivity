import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBCDemo {
		
		public static void main(String args[]) throws Exception
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbcdemo";
			String userName="root";
			String password="root";
			String query="select * from employee";
			Connection con=DriverManager.getConnection(url,userName,password);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			System.out.println("Connected");
			while(rs.next())
			{
				System.out.println("ID is "+rs.getInt(1));
				System.out.println("ID is "+rs.getString(2));
				System.out.println("ID id "+rs.getInt(3));
				
			}
			con.close();
		}
}