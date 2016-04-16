package day27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo1 {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("已经加载了驱动");
		//第二步 使用驱动程序DriverManager得到数据库的连接connection
		Connection  con = DriverManager.getConnection
		("jdbc:mysql://localhost:3306/school","root","123456");
		//事务  
//		connection.setAutoCommit(false);
//		ps.setString(1, "8");
//		ps.setString(2, "liming");
//		ps.setString(3, "555555");
//		ps.execute();
//		ps.setString(1, "9");
//		ps.setString(2, "daijun");
//		ps.setString(3, "66666");
//		ps.execute();
//		connection.commit();
//		connection.setAutoCommit(true);
		
		//元数据
		PreparedStatement ps=con.prepareStatement("select * from student");
		ResultSet set=ps.executeQuery();
		//ResultSetMetaData 获取关于 ResultSet 对象中列的类型和属性信息的对象
		java.sql.ResultSetMetaData data=set.getMetaData();
		//getColumnCount() 返回此 ResultSet 对象中的列数。
		System.out.println(data.getColumnCount());
		for (int i = 1; i <= data.getColumnCount(); i++) {
			System.out.println(data.getColumnName(i));
			System.out.println(data.getColumnType(i));
		}
		
		while(set.next()){
			System.out.println(set.getString("user_name"));
		}


	}

}
