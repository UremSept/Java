package day27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class JDBCTest {

	public static void main(String[] args) {
		try {
			//��һ��������JDBC����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("�Ѿ�����������");
			//�ڶ��� ʹ����������DriverManager�õ����ݿ������connection
			Connection  con = DriverManager.getConnection
			("jdbc:mysql://localhost:3306/school","root","123456");
			//������ �õ�SQL��䵽MySQL��Statement����statement ������ִ�о�̬SQL��䣬�����������
			//Statement statement = con.createStatement();
//			//���Ĳ� ʹ��Statementִ��SQL���
//			String mysql = "insert into student (user_name,user_password,address)values('����','555555','����')";
//			boolean b = statement.execute(mysql);
//			System.out.println(b);
//			//��ѯ
//			ResultSet set = statement.executeQuery("select * from student");
//			System.out.println(set);
//			while(set.next()){
//				System.out.println("������"+set.getString("user_name")+"   �ɼ�:"+set.getInt("score"));
//			}
//			//��ѯ�û��Ƿ����
//			Scanner scanner = new Scanner(System.in);
//			String username = scanner.nextLine();
//			String password = scanner.nextLine();
//			String sql = "select * from student where user_name='"+username+"' and user_password='"+password+"'";
//			System.out.println(sql);
//			ResultSet set1 = statement.executeQuery(sql);//���ַ��� ��д����ʱ д�� ssss' or 1='1ʱ������ȷ
//			if(set1.next()){
//				System.out.println("�û���������ȷ");
//			}else{
//				System.out.println("�û����������");
//			}
//		//Ԥ���� �����������ܵ�������
//			PreparedStatement pre = con.prepareStatement("select * from student where user_name = ? and user_password=?");
//			Scanner scanner = new Scanner(System.in);
//			String username = scanner.nextLine();
//			String password = scanner.nextLine();
//			pre.setString(1, username);
//			pre.setString(2,password);
//			ResultSet set1 = pre.executeQuery();
//			if(set1.next()){
//				System.out.println("�û���������ȷ");
//			}else{
//				System.out.println("�û����������");
//			}
			PreparedStatement sta = con.prepareStatement
			("insert into student (user_name,user_password,address)values(?,?,?)");
			sta.setString(1, "С��");
			sta.setString(2, "123456");
			sta.setString(3,"����");
			sta.addBatch();//���Ϸ���SQL�����ӵ�������
			sta.setString(1, "С��");
			sta.setString(2, "123456");
			sta.setString(3,"����");
			sta.addBatch();//���Ϸ���SQL�����ӵ�������
			sta.setString(1, "С��");
			sta.setString(2, "123456");
			sta.setString(3,"����");
			sta.addBatch();//���Ϸ���SQL�����ӵ�������
			sta.setString(1, "С��");
			sta.setString(2, "123456");
			sta.setString(3,"����");
			sta.addBatch();//���Ϸ���SQL�����ӵ�������
			int a[] = sta.executeBatch();
			for (int m:a) {
				System.out.print(" " + m);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
