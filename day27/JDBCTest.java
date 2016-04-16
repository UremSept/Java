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
			//第一步，加载JDBC驱动
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("已经加载了驱动");
			//第二步 使用驱动程序DriverManager得到数据库的连接connection
			Connection  con = DriverManager.getConnection
			("jdbc:mysql://localhost:3306/school","root","123456");
			//第三步 得到SQL语句到MySQL的Statement对象，statement 对象是执行静态SQL语句，并将结果返回
			//Statement statement = con.createStatement();
//			//第四步 使用Statement执行SQL语句
//			String mysql = "insert into student (user_name,user_password,address)values('刘杰','555555','兰州')";
//			boolean b = statement.execute(mysql);
//			System.out.println(b);
//			//查询
//			ResultSet set = statement.executeQuery("select * from student");
//			System.out.println(set);
//			while(set.next()){
//				System.out.println("姓名："+set.getString("user_name")+"   成绩:"+set.getInt("score"));
//			}
//			//查询用户是否存在
//			Scanner scanner = new Scanner(System.in);
//			String username = scanner.nextLine();
//			String password = scanner.nextLine();
//			String sql = "select * from student where user_name='"+username+"' and user_password='"+password+"'";
//			System.out.println(sql);
//			ResultSet set1 = statement.executeQuery(sql);//这种方法 在写密码时 写成 ssss' or 1='1时密码正确
//			if(set1.next()){
//				System.out.println("用户名密码正确");
//			}else{
//				System.out.println("用户名密码错误");
//			}
//		//预编译 解决密码错误能登入问题
//			PreparedStatement pre = con.prepareStatement("select * from student where user_name = ? and user_password=?");
//			Scanner scanner = new Scanner(System.in);
//			String username = scanner.nextLine();
//			String password = scanner.nextLine();
//			pre.setString(1, username);
//			pre.setString(2,password);
//			ResultSet set1 = pre.executeQuery();
//			if(set1.next()){
//				System.out.println("用户名密码正确");
//			}else{
//				System.out.println("用户名密码错误");
//			}
			PreparedStatement sta = con.prepareStatement
			("insert into student (user_name,user_password,address)values(?,?,?)");
			sta.setString(1, "小米");
			sta.setString(2, "123456");
			sta.setString(3,"北京");
			sta.addBatch();//将上方的SQL语句添加到批处理
			sta.setString(1, "小米");
			sta.setString(2, "123456");
			sta.setString(3,"北京");
			sta.addBatch();//将上方的SQL语句添加到批处理
			sta.setString(1, "小米");
			sta.setString(2, "123456");
			sta.setString(3,"北京");
			sta.addBatch();//将上方的SQL语句添加到批处理
			sta.setString(1, "小米");
			sta.setString(2, "123456");
			sta.setString(3,"北京");
			sta.addBatch();//将上方的SQL语句添加到批处理
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
