import java.io.UnsupportedEncodingException;
import java.sql.*;

public class JDBCTest {
	public static void main(String[] args) throws UnsupportedEncodingException, ClassNotFoundException{
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://127.0.0.1:3306/localserver?useUnicode=true&characterEncoding=utf8";
		String user="root";
		String password="";
		
		try{
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(url, user, password);
			
			if(!conn.isClosed())
				System.out.println("Succeeded connection to the Database!");
			
			Statement statement=conn.createStatement();
			
			String sql="select distinct province from districts";
			
			ResultSet rs=statement.executeQuery(sql);
			System.out.println("------------------");
			String province = null;
			while(rs.next()){
				province=rs.getString("province").toString();
				//province=new String(province);
				System.out.println(province);
				
			}
			
			rs.close();
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}

