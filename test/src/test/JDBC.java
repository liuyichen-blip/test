package test;

import java.sql.*;

public class JDBC {
	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");// 加载驱动程序，此次无需更改
			System.out.println("registered success!");//输出registered success表示驱动加载成功
			//创建对象连接，连接数据库，此例中employeedbms为数据库名，root为用户名，123456位密码，该三项均需根据实际情况进行修改，其它代码无需变动。注：确保数据库名、用户名和密码的准确性。
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/library?useSSL=false&serverTimezone=UTC","root","root");
			System.out.println("connection success!");//输出connection success表示数据库已成功连接
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("error!");
		}
		finally{
		}
	}
}

