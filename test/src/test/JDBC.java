package test;

import java.sql.*;

public class JDBC {
	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");// �����������򣬴˴��������
			System.out.println("registered success!");//���registered success��ʾ�������سɹ�
			//�����������ӣ��������ݿ⣬������employeedbmsΪ���ݿ�����rootΪ�û�����123456λ���룬������������ʵ����������޸ģ�������������䶯��ע��ȷ�����ݿ������û����������׼ȷ�ԡ�
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/library?useSSL=false&serverTimezone=UTC","root","root");
			System.out.println("connection success!");//���connection success��ʾ���ݿ��ѳɹ�����
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

